#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int t;
    string str1, str2;

    cin >> t;

    while (t--) {
        cin >> str1 >> str2;
        sort(str1.begin(), str1.end());
        sort(str2.begin(), str2.end());
        cout << (str1 == str2 ? "YES" : "NO") << "\n";
    }

    return 0;
}