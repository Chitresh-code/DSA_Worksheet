#include <bits/stdc++.h> 
void sort012(int *arr, int n)
{
    int k = 0;
    int occurences[2] = {0,0};

    for(int i = 0; i < n; i++) {
        if(arr[i] == 0) {
            arr[k] = 0;
            k++;
        } else {
            occurences[arr[i]-1]++;
        }
    }

    for(int i = 0; i < 2; i++) {
        for(int j = 0; j < occurences[i]; j++) {
            arr[k] = i+1;
            k++;
        }
    }  
}