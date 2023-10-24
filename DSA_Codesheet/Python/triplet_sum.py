def find_triplet_sum(arr, n, X):
    # Sort the input array
    arr.sort()

    for i in range(n - 2):
        left = i + 1
        right = n - 1

        while left < right:
            current_sum = arr[i] + arr[left] + arr[right]

            if current_sum == X:
                return 1  # Triplet found

            if current_sum < X:
                left += 1
            else:
                right -= 1

    return 0  # No triplet found

# Input
n, X = map(int, input().split())
arr = list(map(int, input().split()))

# Check if a triplet with the given sum X exists in the array
result = find_triplet_sum(arr, n, X)
print(result)
