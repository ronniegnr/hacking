#include <iostream>

using namespace std;

int main() {
    int a, b;

    cin >> a >> b;

    if (a > b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    for (int i = a+1; i < b; ++i) {
        if (i % 5 == 2 || i % 5 == 3) {
            cout << i << endl;
        }
    }

    return 0;
}