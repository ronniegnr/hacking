#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int t;
    string str1, str2;

    cin >> t;

    while (t--) {
        cin >> str1 >> str2;
        int charToRemove = 0, arr1[26] = {0}, arr2[26] = {0};

        char c;
        for (int i = 0; i < str1.length(); ++i) {
            c = str1[i];
            arr1[(int) c - 97]++;
        }
        for (int i = 0; i < str2.length(); ++i) {
            c = str2[i];
            arr2[(int) c - 97]++;
        }

        for (int i = 0; i < 26; ++i) {
            charToRemove += abs(arr1[i] - arr2[i]);
        }

        cout << charToRemove << "\n";
    }


    return 0;
}