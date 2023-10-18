package DSA_Worksheet.DSA_Codesheet.Java;

import java.util.Scanner;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();//number of test cases
        System.out.println();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();   //size of an array
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i] = s.nextInt();    //taking input of array elements
            }
            sort0_1_2(arr);
            //printing array elements
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    static int[] sort0_1_2(int[] arr){
        int l = 0;
        int mid = 0;
        int h = arr.length-1;
        while (mid<=h){
            if(arr[mid]==0){
                int temp = arr[l];
                arr[l] = arr[mid];         //swapping
                arr[mid] = temp;
                l++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                int temp = arr[mid];     //swapping
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        return arr;
    }
}
