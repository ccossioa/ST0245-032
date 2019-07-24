#Punto 1
print ("inicio punto 1")
def algoritmoDeEuclides (ancho, alto):

    if ancho > alto:
        if ancho % alto == 0:
            return alto
        else:
            return algoritmoDeEuclides (alto, ancho % alto)
    else:
        if alto % ancho == 0:
            return ancho
        else:
            return algoritmoDeEuclides (ancho, alto % ancho)
a = int(input("Ingrese el ancho -> "))
b = int(input("Ingrese el alto -> "))
print(algoritmoDeEuclides(a, b))


#Punto 2
print ("inicio punto 2")
def dark_souls (start, nums, target):
    if start >= len(nums):
        if target == 0:
            return True
        else:
            return False
    else:
        return dark_souls (start+1, nums, target) or dark_souls (start + 1, nums, target-nums[start])

print ( dark_souls (0, [2, 4, 8], 10))

#Punto 3
def subconjuntoinicial (base, t):
    if len(t)==0:
        print (base)
    else:
        x = t[1:]
        subconjuntoinicial(base+t[0], x)
        subconjuntoinicial(base, x)

def subconjunto (s):
    subconjuntoinicial("", s)

print (subconjunto("Camilo"))




