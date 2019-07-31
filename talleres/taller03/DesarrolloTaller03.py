topN = int(input("Ingrese el numero de discos para su torre de hanoi"))


def hanoi(topN, a = "Tower1", b = "Tower2", c = "Tower3"):
    if topN==1:
        print(a," to ",c)
    else:
        hanoi(topN-1, a, c, b)
        hanoi(topN, a, b, c)
        hanoi(topN-1, b, a, c)
s = input("Ingrese el string para hacer las permutaciones")


def permutacionAux(s, base=""):
    if len(s)==0:
        return base
    else:
        i = len(s)-1
        return permutacionAux(s[0:i]+s[i+1:], base+s[i])
