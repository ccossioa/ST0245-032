import random
import time
import matplotlib.pyplot as plt
import numpy as np

#Punto 1.1

def secuenciaComun(cadena1, cadena2):
    if len(cadena1) == 0 or len(cadena2) == 0:
        return 0
    elif cadena1[0] == cadena2[0]:
        return 1 + secuenciaComun(cadena1[1:], cadena2[1:])
    return max(secuenciaComun(cadena1[1:], cadena2), secuenciaComun(cadena1, cadena2[1:]))


cadena1 = "ADFRGGSD"
cadena2 = "ADSSCC"
secuenciaComun(cadena1, cadena2)


#Punto 1.2


def llenarTablero (n):
    if (n == 0):
        return 1
    if (n == 1):
        return 1
    else:
        return llenarTablero(n-2) + llenarTablero(n-1)


# Grafico

for i in range(10, 30):
    T1 = time.time() * 1000
    llenarTablero(i)
    T2 = time.time() * 1000 - T1
    area = np.pi * 0.1
    colors = "red"
    plt.scatter(i, T2, s=area, c=colors, alpha=1)
    plt.title("Tablero")

plt.show()

'''
Como resultado tenemos una funcion exponencial, que indica que entre mas grande
es el problema, mas tiempo se demora en ejecutar completamente el algoritmo.
'''

