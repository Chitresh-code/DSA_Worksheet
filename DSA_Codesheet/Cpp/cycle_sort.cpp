#include <iostream>
using namespace std;

void cycleSort (int arr[], int n)
{
    // count number of memory writes
    int writes = 0;
 
    // traverse array elements and put it to on the right place
    
    for (int i=0; i<=n-2; i++)
    {
        int item = arr[i];

        int pos = i;
        for (int j = i+1; j<n; j++)
            if (arr[j] < item)
                pos++;
 
        // If item is already in correct position then
        if (pos == i)
            continue;
 
        // if it have duplicate elements
        while (item == arr[pos])
            pos += 1;
 
        // put the item to right position
        if (pos != i)
        {
            swap(item, arr[pos]);
            writes++;
        }
 
        // Rotate rest of the cycle
        while (pos !=i)
        {
            pos =i;
 
            // for position where we put the element
            for (int j = i+1; j<n; j++)
                if (arr[j] < item)
                    pos += 1;
 
            //  to ignore all duplicate elements
            while (item == arr[pos])
                pos += 1;
 
            // put the item to its right position
            if (item != arr[pos])
            {
                swap(item, arr[pos]);
                writes++;
            }
        }
    }
}
 

int main()
{
    int arr[] = {1, 8, 3, 9, 10, 10, 2, 4 };
    
    int n = sizeof(arr)/sizeof(arr[0]);
    cout<<"unsorted array:"<<endl;
    for (int j =0; j<n; j++)
    cout<< arr[j]<<" ";

    cycleSort(arr,  n) ;
    cout<<endl;
    cout << "After sort : " <<endl;
    for (int j =0; j<n; j++)
        cout << arr[j] << " ";
    return 0;
}