#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> sortArray(vector<int>& N) {
    int min_val = *min_element(N.begin(), N.end());
    int max_val = *max_element(N.begin(), N.end());

    vector<int> count(max_val - min_val + 1, 0);

    for (int num : N) {
        count[num - min_val]++;
    }

    vector<int> sorted_array;
    for (size_t i = 0; i < count.size(); i++) {
        for (int j = 0; j < count[i]; j++) {
            sorted_array.push_back(i + min_val);
        }
    }

    return sorted_array;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> user_input(n);
    cout << "Enter the elements separated by spaces: ";
    for (int i = 0; i < n; i++) {
        cin >> user_input[i];
    }

    // Output the array before sorting
    cout << "Array Before Sorting :-" << endl;
    for (int num : user_input) {
        cout << num << " ";
    }
    cout << endl;

    // Sort the array
    vector<int> sorted_list = sortArray(user_input);

    // Output the array after sorting
    cout << "Array After Sorting :-" << endl;
    for (int num : sorted_list) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
