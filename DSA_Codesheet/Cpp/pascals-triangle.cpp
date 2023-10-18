#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> generateTriangle(int numRows) {
    vector<vector<int>> ans;
    if(numRows <= 0) return ans;
    
    ans.push_back(vector<int>{1});
    if(numRows == 1) return ans;
    
    for(int j=2; j<numRows+1; j++) {
        vector<int> temp{1};
        
        for(int i=1; i<j-1; i++) {
            temp.push_back(ans[j-2][i-1] + ans[j-2][i]);
        }
        
        temp.push_back(1);
        ans.push_back(temp);
    }
    
    return ans;
}

int main() {
    int n;
    cout << "Enter Number of rows for Pascal Triangle: ";
    cin >> n;
    
    vector<vector<int>> ans = generateTriangle(n);
    
    for(int i=0; i<ans.size(); i++) {
        for(int j=0; j<ans[i].size(); j++) {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
    
    return 0;
}