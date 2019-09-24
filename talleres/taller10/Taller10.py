# -*- coding: utf-8 -*-
"""Untitled3.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1HE2uC5Hs67vhl1zKNITTChVgwimOKynx
"""

class Nodo:
    def __init__(self, d):
      self.dato = d
      self.izq = None
      self.der = None
     


class Arbol:
    def __init__(self):
        self.raiz = None
    
    def buscar(self, x):
       return buscarAux(self.raiz, x)
      
    def buscarAux(self, nodo, x): #O(logn)
      if(nodo == None):
        return False
      else:
        if(nodo.dato == x):
          return True
        else:
          if(x < nodo.dato):
            return buscarAux(nodo.izq, x)
          else:
            return buscarAux(nodo.der, x)
    def insertar (self, x):
      return insertarAux (self.raiz, x)
    
    def insertarAux (self, nodo, x):  #O(logn)
      if (nodo == None):
        nodo = x
      elif(nodo.dato < x && nodo.izq == None):
        nodo.izq = x
      elif(nodo.dato > x && nodo.der == None):
        nodo.der = x
      elif(nodo.dato < x && nodo.izq != None):
        return insertarAux(self.nodo.izq, x)
      elif(nodo.dato > x && nodo.der != None):
        return insertarAux(self.nodo.der, x)
      else:
        return