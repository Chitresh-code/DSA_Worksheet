import java.util.Scanner;
public class SearchRotatedSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the rotated sorted array:");
        int n = s.nextInt();
        System.out.println("Enter the elements of the rotated sorted array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = s.nextInt();
        s.close();
        searchRotated(arr,n,target);

    }
    static void searchRotated(int[] arr,int n,int target){
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Element "+target+" found at "+mid);
                return;
            }
            if(arr[mid]>=arr[low]){
                if(target>=arr[low] && target<arr[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }else{
                if(target>arr[mid] && target<=arr[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        System.out.println(-1);

    }
}
