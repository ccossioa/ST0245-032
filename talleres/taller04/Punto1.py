import random
from matplotlib import pyplot as pl
import time

def sumaArreglo (nums, contador):
    if contador==nums.size(): #C1
        return 0;
    else:
        return nums[contador] + sumaArreglo(nums, contador+1) #T(n)= C2 + T(n-1)

#Complejidad: T(n)=C1+C^2*n


