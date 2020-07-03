#include <iostream>

using namespace std;

int main() {
    int n, x, y, sum = 0;
    cin >> n;

    while (n--) {
        cin >> x >> y;
        x = (x % 2 == 0 ? x + 1 : x);
        for (int i = 0; i < y; i++, x+=2) {
            sum += x;
        }
        cout << sum << endl;
        sum = 0;
    }

    return 0;
}
