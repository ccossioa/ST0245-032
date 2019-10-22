# -*- coding: utf-8 -*-
"""Laboratorio5_Punto2

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1UR3CkM3cDY-maSml6cxBaDjo-jy5fCRS
"""

import urllib.request
import networkx as nx
import matplotlib.pyplot as plt

url = 'https://raw.githubusercontent.com/ccossioa/ST0245-032/master/laboratorios/lab05/codigo/prueba.txt'
response = urllib.request.urlopen(url)
data = response.read()    
text = data.decode('utf-8')
arr = []
for i in range (3, len(text)):
  if text[i] == '\n':
    arr.append(text[i+1]+' '+text[i+3])
for i in range(len(arr)):
  aux = arr
  arr[i] = aux[i].split()

G = nx.Graph()
for i in range(len(arr)):
  G.add_edge(arr[i][0],arr[i][1])

nx.draw_shell(G, with_labels = True, node_color = 'w')
plt.show()

EV = G.edges
aux1 = []
aux2 = []
for u, v in EV:
  if u in aux1: continue
  else:
    aux1.append(u)
  if v in aux1: continue
  else:
    aux2.append(v)

p = True
for i in aux1:
  if i in aux2:
    p = False

if p == True: print("El anterior grafo se puede pintar con dos colores")
else: print("El anterior grafo no se puede pintar con dos colores")