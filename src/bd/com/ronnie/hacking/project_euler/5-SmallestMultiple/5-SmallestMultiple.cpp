#include <iostream>

using namespace std;

long gcd(long a, long b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}

long lcm(long a, long b) {
    return (a * b) / gcd(a, b);
}

int main() {
    long t, n;

    cin >> t;

    while (t--) {
        cin >> n;
        for(long i = n-1; i > 1; --i) {
            n = lcm(n, i);
        }
        cout << n << endl;
    }

    return 0;
}