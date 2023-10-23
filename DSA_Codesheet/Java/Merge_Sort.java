
import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the list:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        int low = 0;
        int high = n-1;
        mergeSort(arr,low,high);
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
    static void mergeSort(int[] arr,int low,int high){
        if(low<high){  //to check if size of array is greater than 1
            int mid = low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int[] arr,int low,int mid,int high){
        int n1 = mid-low+1;   //calculating size of left array
        int n2 = high-mid;    //size of right array
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid+i+1];
        }
        int i = 0,j=0,k=low;
        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
