#include <iostream>

using namespace std;

int main() {
    string str;
    cin >> str;

    string result = "YES";

    for (int i = 0, j = str.length() - 1; i < str.length() / 2; ++i, --j) {
        if(str[i] != str[j]) {
            result = "NO";
            break;
        }
    }

    cout << result;

    return 0;
}