package DSA_Worksheet.DSA_Codesheet.Java;

import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        long[] nums={1,4,2,1,5};
        long n = nums.length;
        dupmis(nums,n);




    }
    static  void dupmis(long[] arr,long n){
        long sum = (n*(n+1))/2;
        long squaresum = (n*(n+1)*((2*n+1)))/6;
        long s1 = 0;    //sum of array elements
        long s2 = 0;    //sum of square of array elements
        for (int i = 0; i < n; i++) {
            s1 += arr[i];
            s2 += (arr[i]*arr[i]);
        }
        long val1 = s1-sum;   //x-y
        long val2 = s2-squaresum;
        val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x-val1;
        System.out.print(x+" ");
        System.out.print(y);
    }


}
