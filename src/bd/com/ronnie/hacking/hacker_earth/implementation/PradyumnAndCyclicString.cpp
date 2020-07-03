#include <iostream>

using namespace std;

int main() {
    int t;
    string input;

    cin >> t;

    while (t--) {
        cin >> input;
        long long length = input.size();
        cout << (length * (length + 1)) / 2 << "\n";
    }

}