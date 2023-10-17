package DSA_Worksheet.DSA_Codesheet.Java;

import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] nums={1,4,2,3};
        System.out.println(Arrays.toString(C_Sort(nums)));

        //use only when number starts from 1 or 0
        //Time complexity:
        //worst case:O(n)

    }
    static int[] C_Sort(int[] nums){
        int i=0;
        while (i<nums.length){
            int cindex=nums[i]-1;
            if(nums[i]!=nums[cindex]){
                int temp=nums[cindex];
                nums[cindex]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        return nums;
    }
}
