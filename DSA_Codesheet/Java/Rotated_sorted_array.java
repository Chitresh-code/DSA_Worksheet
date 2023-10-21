import java.util.Scanner;

public class RotatedArraySearch {
    public static int searchInRotatedArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the rotated sorted array
        System.out.print("Enter the size of the rotated sorted array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        // Input: Elements of the rotated sorted array
        System.out.print("Enter the elements of the rotated sorted array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input: Target element to search
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Find the index of the target element using the searchInRotatedArray function
        int index = searchInRotatedArray(nums, target);

        // Output: Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
