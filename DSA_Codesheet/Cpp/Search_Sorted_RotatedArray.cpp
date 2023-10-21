#include <iostream>
#include <vector>

using namespace std;

int searchInRotatedArray(const vector<int>& nums, int target) {
    int low = 0, high = nums.size() - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid; // Found the target
        }

        // Check if the left half is sorted
        if (nums[low] <= nums[mid]) {
            // Check if the target lies in the left half
            if (nums[low] <= target && target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else { // Right half is sorted
            // Check if the target lies in the right half
            if (nums[mid] < target && target <= nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    return -1; // Target not found
}

int main() {
    cout << "Enter the size of the rotated sorted array: ";
    int n;
    cin >> n;

    cout << "Enter the elements of the rotated sorted array: ";
    vector<int> rotatedArray(n);
    for (int i = 0; i < n; ++i) {
        cin >> rotatedArray[i];
    }

    int target;
    cout << "Enter the target element to search: ";
    cin >> target;

    int result = searchInRotatedArray(rotatedArray, target);

    if (result != -1) {
        cout << "Element " << target << " found at index " << result << endl;
    } else {
        cout << "Element " << target << " not found in the array" << endl;
    }

    return 0;
}
