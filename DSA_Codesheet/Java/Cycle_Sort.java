package DSA_Worksheet.DSA_Codesheet.Java;

import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] nums={1,4,2,3};
        System.out.println(Arrays.toString(C_Sort(nums)));



    }

    static int[] C_Sort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            int item = nums[i];
            int pos = i;
            for (int j = i+1; j < n; j++) {
                if(nums[j]<item){
                    pos++;
                }
            }
            int temp = nums[pos];
            nums[pos] = item;
            item = temp;
            while (pos!=i){
                pos = i;
                for (int j = i+1; j < n; j++) {
                    if(nums[j]<item){
                        pos++;
                    }
                }
                int t = nums[pos];
                nums[pos] =item;
                item = t;
            }
        }
        return nums;
    }
}
