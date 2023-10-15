def selection_sort(arr):

    """
    Function for implementation of Selection Sort using python.
    """

    n = len(arr)
    
    for i in range(n):
        # Find the minimum element in the unsorted portion of the array
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        
        # Swap the minimum element with the first element in the unsorted portion
        arr[i], arr[min_index] = arr[min_index], arr[i]

if __name__ == "__main__":
    try:
        arr = list(map(int, input("Enter values for array: ").split())) 
    except:
        print("Please enter a valid number")
    print(f"Your original array: {arr}")
    selection_sort(arr)
    print(f"Sorted Array: {arr}")