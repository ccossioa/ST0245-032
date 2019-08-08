import time
import random
def contenedor(start, arrVol,volTotal):
    if start == len(arrVol):
        if volTotal==0:
            return True
        else:
            return False
    elif contenedor(start+1, arrVol, volTotal-arrVol[start]):
        return True
    elif contenedor(start+1, arrVol, volTotal) :
        return True
    return False



arr = []
for i in range (10^10):
    arr [i]= random.randint(0, 100)
start = time.time()*1000
print(start)
contenedor(0, arr, 500)
end = time.time()*1000
print(end)
print(end-start)