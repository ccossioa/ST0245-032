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
from time import time
from math import e
import pydotplus
import urllib.request
import matplotlib.pyplot as plt
import numpy as np
import random
import os
import psutil
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
  for i in range(0, len(arr)-1):
    lista.append(arr[i].split(','))
  return lista
  
def caracteristicas(list1):
  roya_caracteristicas = []
  a = 0
  for i in range (1, len(list1)):
    roya_caracteristicas.append([])
    for j in range (0, 6):
      roya_caracteristicas[a].append(float(list1[i][j])) 
    a += 1
  return roya_caracteristicas

def etiqueta (list2):
  label = []
  a = 0
  for i in range (1, len(list2)):
    label.append(list2[i][6])
  return label 

def arbol (direccion):
  lista = leer_archivo(direccion)
  caracteristicas_columnas = ['ph', 'soil_temperature', 'soil_moisture', 'illuminance', 'env_temperature', 'env_humidity']
  x = caracteristicas(lista)
  y = etiqueta(lista)

  X_train, X_test, y_train, y_test = train_test_split(x, y, test_size = 0.3, random_state = 1)

  clf = DecisionTreeClassifier()
  clf = clf.fit(X_test, y_test)
  y_pred = clf.predict(X_test)

  print ("Exactitud: ", metrics.accuracy_score(y_test, y_pred))

  dot_data = StringIO()
  export_graphviz(clf, out_file=dot_data, rounded=True, special_characters = True,feature_names = caracteristicas_columnas,class_names=['Roya', 'No roya'])
  graph = pydotplus.graph_from_dot_data(dot_data.getvalue())
  graph.write_png('roya.png')
  Image(graph.create_png())

arbol('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/data_set.csv')

from time import time
import os
import psutil
import matplotlib.pyplot as plt

arrT = []
for i in range(100):
  t1 = time()
  arbol('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/data_set.csv')
  t2 = time()
  arrT.append(t2-t1)

print(min(arrT))
print(max(arrT))
print(sum(arrT)/len(arrT))

plt.plot(arrT, color='r')
plt.xlabel('Numero de prueba')
plt.ylabel('[seg]')
plt.title('Tiempos de ejecucion')

plt.show()

import os
import psutil
from math import e
import matplotlib.pyplot as plt

arrM = []
for i in range(100):
  arbol('https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/DataSets/data_set.csv')
  process = psutil.Process(os.getpid())
  arrM.append((process.memory_info().rss)/(1e+6))


print(min(arrM))
print(max(arrM))
print(sum(arrM)/len(arrM))

plt.plot(arrM, color='c')
plt.xlabel('Numero de prueba')
plt.ylabel('[MB]')
plt.title('Espacio de Memoria')

plt.show()