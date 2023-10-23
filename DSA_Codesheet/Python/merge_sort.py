def merge_sort(arr):
    # Base case: If the list has 0 or 1 elements, it is already sorted
    if len(arr) <= 1:
        return arr

    # Divide the input list into two halves
    middle = len(arr) // 2
    left_half = arr[:middle]
    right_half = arr[middle:]

    # Recursively sort the two halves
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)

    # Merge the sorted halves
    return merge(left_half, right_half)

def merge(left, right):
    result = []
    left_idx, right_idx = 0, 0

    # Compare and merge elements from the left and right halves
    while left_idx < len(left) and right_idx < len(right):
        if left[left_idx] < right[right_idx]:
            result.append(left[left_idx])
            left_idx += 1
        else:
            result.append(right[right_idx])
            right_idx += 1

    # Append any remaining elements from the left and right halves
    result.extend(left[left_idx:])
    result.extend(right[right_idx:])
    return result

# Input: Size of the list
n = int(input())
# Input: List of integers
arr = list(map(int, input().split()))

# Perform Merge Sort
sorted_arr = merge_sort(arr)

# Output: Sorted list of integers
print(" ".join(map(str, sorted_arr)))
