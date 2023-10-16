import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,x;
        int[] arr=new int[1000];  
        n=sc.nextInt();
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();  
        }
        sort(arr,n);
        int[] ans=value(arr,n);
        for(int j=0;j<ans.length;j++){
              System.out.print(ans[j]+" ");
        }
 }
 static void sort(int[] arr,int n){ 
     int correct,i=0;
      while(i<n){
         correct=arr[i]-1;
            if(arr[i]!=correct){
            int temp=arr[i];
               arr[i]=arr[correct];
               arr[correct]=temp;
            }
          else{
            i++;
              }
        }
   }
   static int[] value(int[] arr,int n){
    int x=-1;
     int y=-1;
     for(int i=0;i<n;i++){
            if((arr[i]-1)!=i){
                x=arr[i];
                y=i+1;
                break;
            }
      }
       return new int[]{x,y}; 
    }
  
}
