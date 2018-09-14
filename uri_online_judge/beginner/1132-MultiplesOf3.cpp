#include <iostream>

using namespace std;

int main() {
    int a, b, sum = 0;

    cin >> a >> b;

    if (a > b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    for (int i = a; i <= b; ++i) {
        if (i % 13 != 0) {
            sum += i;
        }
    }

    cout << sum << endl;

    return 0;
}