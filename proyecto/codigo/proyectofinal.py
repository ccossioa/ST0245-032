# -*- coding: utf-8 -*-
"""ProyectoFinal

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1y2ggwfGP4CSZLXW7dMpgSopSSa1Xpuu8
"""

import io
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn import  metrics
from sklearn.tree import export_graphviz
from sklearn.externals.six import StringIO  
from IPython.display import Image  
import pydotplus
import urllib.request
import matplotlib.pyplot as plt
import numpy as np
import time
import random
get_ipython().run_line_magic('matplotlib', 'inline')


def leer_archivo (direccion_url):
  url = direccion_url
  response = urllib.request.urlopen(url)
  data = response.read()    
  text = data.decode('utf-8')
  arr = []
  lista = []
  aux1 = ""
  for i in range (0, 80):
    aux1 += text[i]
  arr.append(aux1)
  for i in range (0, len(text)):
    if(text[i] == '\n'):
      aux = ""
      while i != len(text)-1 and text[i+1]!="\n" and text[i+1] != "\r":
        aux += text[i+1]
        i+=1
      arr.append(aux)
  for i in range(len(arr)-1):
    lista.append(arr[i].split(','))

def caracteristicas(direccion):
  leer_archivo(direccion)
  roya_caracteristicas = []
  a = 0
  for i in range (1, len(lista)):
    roya_caracteristicas.append([])
    for j in range (0, 6):
      roya_caracteristicas[a].append(float(lista[i][j])) 
    a += 1
  return roya_caracteristicas

def etiqueta (direccion):
  leer_archivo(direccion)
  label = []
  a = 0
  for i in range (1, len(lista)):
    label.append(lista[i][6])
  return label 

def arbol (direccion):
  leer_archivo(direccion)
  #caracteristicas_columnas = ['ph', 'soil_temperature', 'soil_moisture', 'illuminance', 'env_temperature', 'env_humidity']
  x = caracteristicas(direccion)
  y = etiqueta(direccion)

  X_train, X_test, y_train, y_test = train_test_split(x, y, test_size = 0.3, random_state = 1)

  clf = DecisionTreeClassifier()
  clf = clf.fit(X_test, y_test)
  y_pred = clf.predict(X_test)

  print ("Exactitud: ", metrics.accuracy_score(y_test, y_pred))

  dot_data = StringIO()
  export_graphviz(clf, out_file=dot_data, rounded=True,
                  special_characters=True,feature_names = caracteristicas_columnas,class_names=['Roya','No roya'])
  graph = pydotplus.graph_from_dot_data(dot_data.getvalue())
  graph.write_png('roya.png')
  Image(graph.create_png())
  
arbol('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/train/data_set_train.csv')

def tiempo(direccion):
  T1=time.time()*1000
  arbol(direccion)
  T2=time.time()*1000-T1
  area = np.pi*0.1
  colors = "green"
  plt.scatter(i, T1, s=area, c=colors, alpha=1)
  plt.title("Roya")

#tiempo('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/train/data_set_train.csv')

import urllib.request

def leer_archivo (direccion_url):
  url = direccion_url
  response = urllib.request.urlopen(url)
  data = response.read()    
  text = data.decode('utf-8')
  arr = []
  lista = []
  aux1 = ""
  for i in range (0, 80):
    aux1 += text[i]
  arr.append(aux1)
  for i in range (0, len(text)):
    if(text[i] == '\n'):
      aux = ""
      while i != len(text)-1 and text[i+1]!="\n" and text[i+1] != "\r":
        aux += text[i+1]
        i+=1
      arr.append(aux)
  for i in range(len(arr)-1):
    lista.append(arr[i].split(','))
  print(lista)
leer_archivo('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/data_set.csv')