#include <bits/stdc++.h>

using namespace std; 

bool find3Numbers(int A[], int arr_size, int sum) {
	for (int i = 0; i < arr_size - 2; i++) {
		for (int j = 1; j < arr_size - 1; j++) {
			for (int k = 1; k < arr_size; k++) {
				if (A[i] + A[j] + A[k] == sum) {
					cout << "Triplet is " << A[i] <<
						", " << A[j] << ", " << A[k]; 
					return true; 
				}
			}
		}
	}

	return false; 
}

int main()
{
	int A[] = { 1, 2, 4, 67, 23, 89, 6, 8, 10 }; 
	int sum = 32; 
	int arr_size = sizeof(A) / sizeof(A[0]); 
	find3Numbers(A, arr_size, sum); 
	return 0;
}