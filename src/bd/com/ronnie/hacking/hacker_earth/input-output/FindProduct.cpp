#include <iostream>

using namespace std;

int main() {
    long d = 1000000007;
    long res = 1;
    int n, a;
    cin >> n;

    for (int i = 0; i < n; ++i) {
        cin >> a;
        res = (res * a) % d;
    }

    cout << res;

    return 0;
}