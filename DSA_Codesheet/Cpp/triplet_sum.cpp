#include <bits/stdc++.h>
using namespace std;

class Solution{
    public:
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    bool find3Numbers(int A[], int n, int X)
    {
        int i = 0;
        sort(A , A + n);
        for(int i = 0; i < n; i++)
        {
            int left = i + 1;
            int right = n - 1;
            while(left < right)
            {
                int sum = A[i] + A[left] + A[right];
                if(sum == X)
                { 
                    i = 1;
                    return i;
                }
                if(sum < X)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return 0;
    }

};

int main()
{
	int T;
	cin>>T;
	while(T--)
	{
		int n,X;
		cin>>n>>X;
		int i,A[n];
		for(i=0;i<n;i++)
			cin>>A[i];
		Solution ob;
        cout <<  ob.find3Numbers(A, n, X) << endl;
    }
}
