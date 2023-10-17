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
    //picking up an element and checking if it is at right position or not
    //when the elements start from 1 then every element should be at index one less
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
