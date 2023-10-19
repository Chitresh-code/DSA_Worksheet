import java.util.Arrays;
import java.util.Scanner;

/*
 * You are given a read-only array of N integers with values also in the range 1to N both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Input Format
The first line contains integer, n, the size of array arr[]
The second line contains n space-separated integers arr[i].

Constraints
1<=n<=1000
-10000 <= arr[i] <= 10000,
0<=i<=n

Output Format
The output contains two space-separated integers where the first number is the number that appears twice and the second integer is the number that is missing
 */
public class Cycle_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //Taking the input for the length of the array 
        int []arr=new int[n]; //Initialising the array arr
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();  //Taking the input for all the elements of the array
        }
        sc.close();
        int A;  //It is the variable for repeating number
        int B;  //It is the variable for missing number
        
        // IntStream stream=Arrays.stream(arr,0,n+1);
        int actualsum=Arrays.stream(arr).sum();  //It is the sum of the entered elements of the array
        int actualsumofsquares=Arrays.stream(arr).map(x -> x*x).sum();  //It is the sum of the squares of the entered elements of the array

        int expectedSum=n * (n+1) /2;  //Expected sum of the elements according to the formula for sum of n natural numbers
        int expectedSumOfSquares=n * (n+1) * (2*n +1) /6;    //Expected sum of squares of the elements according to the formula for sum of the squares of n natural numbers

        int dif1=expectedSum-actualsum;  //these are the differences
        int dif2=expectedSumOfSquares-actualsumofsquares;

        A=(dif2-dif1) /2;
        B=(dif1+dif2) /2;

        System.out.println(A+" "+B);
    }
}
