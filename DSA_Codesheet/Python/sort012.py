from os import *
from sys import *
from collections import *
from math import *

from sys import stdin,setrecursionlimit
setrecursionlimit(10**7)

def sort012(arr, n) :
    k = 0
    occurences = [0,0]
    for i in range(n):
        if(arr[i] == 0):
            arr[k] = 0
            k+=1
        else:
            occurences[arr[i]-1]+=1
    for i in range(2):
        for j in range(occurences[i]):
            arr[k] = i+1
            k+=1
    pass


#taking inpit using fast I/O
def takeInput() :
	n = int(input().strip())

	if n == 0 :
		return list(), 0

	arr = list(map(int, stdin.readline().strip().split(" ")))

	return arr, n



def printAnswer(arr, n) :
    
    for i in range(n) :
        
        print(arr[i],end=" ")
        
    print()
    
#main

t = int(input().strip())
for i in range(t) :

    arr, n= takeInput()
    sort012(arr, n)
    printAnswer(arr, n)
