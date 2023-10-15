//Sort any given unsorted array of side n in descending order using the selection sort algorithm.

#include<iostream>
using namespace std;

void selectionSort(int arr[], int n) {
    for(int i=0; i<n-1; i++) {
        int maxIndex = i;
        for(int j=i+1; j<n; j++) {
            if(arr[j]<arr[maxIndex]) {
                maxIndex = j;
            }
        }
        if(maxIndex != i) {
            swap(arr[i], arr[maxIndex]);
        }
    }
}

int main() {
    int n;
    cin >> n;

    int arr[n];

    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    selectionSort(arr, n);

    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}


/*
Input :

6
2 13 4 1 3 6

Output :

1 2 3 4 6 13

----------------------------------

Input :

5
9 3 6 2 0

Output :

0 2 3 6 9


*/