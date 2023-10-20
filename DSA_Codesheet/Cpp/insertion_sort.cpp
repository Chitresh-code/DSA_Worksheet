#include<iostream>
using namespace std;
int main(){
  int n;
  cout<<"Enter the size of array:";
  cin>>n;
  cout<<"Enter the unsorted array:"<<endl;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
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
  cout<<"sorted list:";
  for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
  }cout<<endl;
}