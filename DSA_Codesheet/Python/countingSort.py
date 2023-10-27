from typing import List

def sortArray(N: List[int]) -> List[int]:
    min_val, max_val = min(N), max(N)
    count = [0] * (max_val - min_val + 1)

    for num in N:
        count[num - min_val] += 1

    sorted_array = []
    for i in range(len(count)):
        sorted_array.extend([i + min_val] * count[i])

    return sorted_array

if __name__ == "__main__":
    # Input
    n = int(input("Enter the number of elements: "))
    user_input = list(map(int, input("Enter the elements separated by spaces: ").split()))

    # Output the array before sorting
    print("Array Before Sorting :-")
    print(" ".join(map(str, user_input)))

    # Sort the array
    sorted_list = sortArray(user_input)

    # Output the array after sorting
    print("Array After Sorting :-")
    print(" ".join(map(str, sorted_list)))
