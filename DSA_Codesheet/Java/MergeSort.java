import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :. ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the Array ("+n+") :. ");
        for(int i=0; i<n; i++){
            System.out.println("Enter "+i+"th Element :.");
            arr[i] = input.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
