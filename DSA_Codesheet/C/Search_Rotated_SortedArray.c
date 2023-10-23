#include <stdio.h>  // Include the standard input/output library.

// Function to search for a target element in a rotated and sorted array.
int searchInRotatedSortedArray(int rotatedSortedArray[], int n, int target) {
    int low = 0, high = n - 1;  // Initialize low and high pointers.

    while (low <= high) {  // Perform a binary search in the array.
        int mid = (low + high) / 2;  // Calculate the middle index of the current search range.

        if (rotatedSortedArray[mid] == target) {  // If the middle element is the target, return its index.
            return mid;
        }

        if (rotatedSortedArray[low] <= rotatedSortedArray[mid]) {
            // If the left half is sorted (no rotation in this part):
            if (rotatedSortedArray[low] <= target && target < rotatedSortedArray[mid]) {
                high = mid - 1;  // Adjust the high pointer to search in the left half.
            } else {
                low = mid + 1;   // Adjust the low pointer to search in the right half.
            }
        } else {
            // If the right half is sorted (no rotation in this part):
            if (rotatedSortedArray[mid] < target && target <= rotatedSortedArray[high]) {
                low = mid + 1;   // Adjust the low pointer to search in the right half.
            } else {
                high = mid - 1;  // Adjust the high pointer to search in the left half.
            }
        }
    }

    return -1;  // If the target element is not found, return -1.
}

int main() {
    printf("Enter the size of the array: ");
    int n;
    scanf("%d", &n);  // Read the size of the array from the user.

    int rotatedSortedArray[n];
    printf("Enter the elements of the rotated sorted array: ");
    for (int i = 0; i < n; ++i) {
        scanf("%d", &rotatedSortedArray[i]);  // Read each element from the user and store it in the array.
    }

    int target;
    printf("Enter the target element to search: ");
    scanf("%d", &target);  // Read the target element from the user.

    int result = searchInRotatedSortedArray(rotatedSortedArray, n, target);  // Call the search function.

    if (result != -1) {
        printf("Element %d found at index %d\n", target, result);  // Output the result if the target is found.
    } else {
        printf("Element %d not found in the array\n", target);  // Output a message if the target is not found.
    }

    return 0;
}
