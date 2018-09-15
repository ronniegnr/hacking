#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    int k;
    cin >> str >> k;

    int strSize = str.size();
    for (int i = 0; i < strSize; ++i) {
        if((str[i] >= 48 && str[i] <=57) || (str[i] >= 65 && str[i] <=122)) {
            str[i] = static_cast<char>(str[i] + k);
        }
    }

    cout << str;

    return 0;
}