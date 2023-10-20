def quick_sort(arr):
    """
    Sorts an array using the Quick Sort algorithm.

    Parameters:
    arr (list): The list to be sorted.

    Returns:
    list: The sorted list.
    """

    # Base case: If the array is empty or has only one element, it's already sorted.
    if len(arr) <= 1:
        return arr

    # Choose a pivot element. Here, we simply select the last element as the pivot.
    pivot = arr[-1]

    # Initialize three lists to hold elements less than, equal to, and greater than the pivot.
    less_than_pivot = []
    equal_to_pivot = []
    greater_than_pivot = []

    # Partition the array into the three lists.
    for element in arr:
        if element < pivot:
            less_than_pivot.append(element)
        elif element == pivot:
            equal_to_pivot.append(element)
        else:
            greater_than_pivot.append(element)

    # Recursively sort the two sub-arrays (less than and greater than the pivot).
    sorted_less = quick_sort(less_than_pivot)
    sorted_greater = quick_sort(greater_than_pivot)

    # Combine the sorted sub-arrays and the elements equal to the pivot to get the final sorted array.
    return sorted_less + equal_to_pivot + sorted_greater

# Example usage:
unsorted_list = [4, 2, 7, 1, 9, 3]
sorted_list = quick_sort(unsorted_list)
print("Original list:", unsorted_list)
print("Sorted list:", sorted_list)