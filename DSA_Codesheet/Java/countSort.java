import java.util.*;

public class countSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array Before Sorting :-");
        System.out.println();
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] sortedArr = countingSort(arr);


        System.out.println("Array After Sorting :-");
        for(int i = 0; i<n; i++){
            System.out.print(sortedArr[i]+" ");
        }

    }

    public static int[] countingSort(int[] nums) {
        int[] minMax = getMinMax(nums);
        int offset = 0;
        if(minMax[0] < 0) {
            offset = minMax[0] * (-1);
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i]+=offset;
        }
        int[] count = new int[minMax[1] + offset + 1];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] != 0) {
                nums[j] = i - offset;
                count[i]--;
                j++;
            }
        }
        return nums;
    }
    
    public static int[] getMinMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return new int[]{min, max};
    }
}
