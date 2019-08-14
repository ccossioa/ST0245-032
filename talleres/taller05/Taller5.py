#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import matplotlib.pyplot as plt
import numpy as np
import time
import random
get_ipython().run_line_magic('matplotlib', 'inline')

def insertionSort(arr):
    for i in range (1, len(arr)): #n+C1
        aux = arr[i]
        j = i - 1
        while j >= 0:                #n+C2
            if aux < arr[j]:
                arr[j + 1] = arr[j]
                arr[j] = aux
                j -= 1
            else:
                break
            #Complejidad: O(n^2)


def suma (arr):
    for i in range (0, len(arr)):
        sumatoria += arr[i]
    return sumatoria
 #Complejidad O(n)
    
def arrAleatorio (n):
    arr=[0]*n
    for i in range (n):
        arr[i]=random.randint(0,800)
    return arr

for i in range (0,900):
    arr=arrAleatorio(i)
    T1=time.time()*1000
    insertionSort(arr)
    T2=time.time()*1000-T1
    area = np.pi*0.1
    colors = "green"
    plt.scatter(i, T1, s=area, c=colors, alpha=1)
    plt.title("Insertion Sort")
    
for i in range (0,900):
    arr=arrAleatorio(i)
    T1=time.time()*1000
    suma(arr)
    T2=time.time()*1000-T1
    area = np.pi*0.1
    colors = "yellow"
    plt.scatter(i,T1, s=area, c=colors, alpha=1)
    plt.title("Suma")
    
plt.show()


# In[ ]:




