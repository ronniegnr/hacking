#include <iostream>

using namespace std;

int main() {
    string str;
    int ascii_value;
    cin >> str;

    for (int i = 0; i < str.length(); ++i) {
        ascii_value = (int) str[i];
        ascii_value = ascii_value < 97 ? ascii_value + 32 : ascii_value - 32;
        cout << (char)ascii_value;
    }

    return 0;
}