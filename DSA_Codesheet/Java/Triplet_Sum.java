import java.util.Arrays;

public class Triplet_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6};
        System.out.println(threeSum(arr,10));

    }
    static boolean threeSum(int[] arr,int x){
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int k = arr.length-1;
            while (j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==x){
                    return true;
                } else if (sum<x) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        return false;
    }
}
