#include<stdio.h>
int main(){
  int n;
  printf("Enter the size of array:");
  scanf("%d",&n);
  printf("Enter the unsorted array:");
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(int i=1;i<n;i++){
    int current =arr[i];
    int j=i-1;
    while(arr[j]>current &&j>=0){
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=current;
  }
  printf("sorted list:\n");
  for(int i=0;i<n;i++){
    printf("%d\n",arr[i]);
  }
  return 0;
}