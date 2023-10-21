def counting_sort(arr):
    # Find the maximum element in the array
    max_val = max(arr)

    # Create a count array to store the count of each element
    count = [0] * (max_val + 1)
    output = [0] * len(arr)

    # Count the occurrences of each element in the input array
    for num in arr:
        count[num] += 1

    # Calculate the cumulative count
    for i in range(1, max_val + 1):
        count[i] += count[i - 1]

    # Build the output array
    for i in range(len(arr) - 1, -1, -1):
        output[count[arr[i]] - 1] = arr[i]
        count[arr[i]] -= 1

    # Copy the sorted elements back to the original array
    for i in range(len(arr)):
        arr[i] = output[i]

if __name__ == "__main__":
    n = int(input("Enter the number of elements: "))
    arr = list(map(int, input(f"Enter {n} positive elements: ").split()))

    print("Array Before Sorting: ")
    print(*arr)

    counting_sort(arr)

    print("Array After Sorting:")
    print(*arr)
