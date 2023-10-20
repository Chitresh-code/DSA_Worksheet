public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String args[]) {
        int arr[] = {18, 0, 11, 1, 24, 91, 100};
        int n = arr.length;

        insertionSort(arr);

        for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
        
        System.out.println();
        
    }
}
