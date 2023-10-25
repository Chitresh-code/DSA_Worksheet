#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;	//size of the array mountains
	cin >> n;

	int arr[n];

	for(int i=0;i<n;i++)	//Getting the values of the array mountains
		cin >> arr[i];

	//Finding maximum - arr[1]<arr[2]<...<arr[i]>arr[i+1]...arr[n]
	// So we need to find the maximum as we know that the max will be peak

	int max = 0;
	for(int i=1;i<n;i++){
		if(arr[max]<arr[i])
			max = i;
	}

	cout << max << endl;
	//peak index
	return 0;

}