# The following function performs insertion sort in ascending order.
# The datatype used is a list(array of numbers).


def insertion_sort(arr):
  for i in range(1, len(arr)):
    key = arr[i]
    j = i - 1
    while j >= 0 and arr[j] > key:
      arr[j + 1] = arr[j]
      j -= 1
    arr[j + 1] = key

  return arr



arr = input("Enter a list of numbers").split(" ")

sorted_arr = insertion_sort(arr)

print(sorted_arr)