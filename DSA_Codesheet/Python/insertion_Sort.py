# The following function performs insertion sort in ascending order.
# The datatype used is a list(array of numbers).


def insertion_sort(arr):
  for i in range(1, len(arr)):
    key = arr[i]
    j = i - 1
    while j >= 0 and key < arr[j]:
      arr[j + 1] = arr[j]
      j -= 1
    arr[j + 1] = key

  return arr



arr = input("Enter a list of numbers: ").split(" ")

arr = [int(i) for i in arr]

sorted_arr = insertion_sort(arr)

for i in sorted_arr:
  print(i,end=' ')