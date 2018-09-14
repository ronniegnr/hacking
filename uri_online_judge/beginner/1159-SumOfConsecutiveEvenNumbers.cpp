#include <iostream>

using namespace std;

int main() {
    int x, y, sum = 0;

    while (true) {
        cin >> x;
        if(x==0) {
            break;
        }

        y = (x % 2 == 0 ? x : x + 1);
        for (int i = 0; i < 5; ++i, y += 2) {
            sum += y;
        }

        cout << sum << endl;
        sum = 0;
    }

    return 0;
}