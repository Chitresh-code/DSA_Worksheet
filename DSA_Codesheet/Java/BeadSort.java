import java.util.*;

// BeadSort Algorithm(wikipedia) : https://en.wikipedia.org/wiki/Bead_sort
// BeadSort can't sort negative number, Character, String. It can sort positive number only


public class BeadSort {
    public static int[] sort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        int max = 0;
        for (int i = 0; i < unsorted.length; i++) {
            max = Math.max(max, unsorted[i]);
        }

        char[][] grid = new char[unsorted.length][max];
        int[] count = new int[max];

        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < max; j++) {
                grid[i][j] = '-';
            }
        }

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < unsorted.length; i++) {
            int k = 0;
            for (int j = 0; j < unsorted[i]; j++) {
                grid[count[max - k - 1]++][k] = '*';
                k++;
            }
        }

        for (int i = 0; i < unsorted.length; i++) {
            int k = 0;
            for (int j = 0; j < max && grid[unsorted.length - 1 - i][j] == '*'; j++) {
                k++;
            }
            sorted[i] = k;
        }
        return sorted;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter size of the Array :-- ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+ " (Positive) Digits:-- ");
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array Before Sorting:-- ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] sorted_arr = sort(arr);
        System.out.println("Array After Sorting:-- ");
        for(int i = 0; i<n; i++){
            System.out.print(sorted_arr[i]+" ");
        }

      }
}
