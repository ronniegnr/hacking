#include<iostream>
#include <cmath>

using namespace std;

long long find_largest_prime_factor(long long a) {
    if (a < 3) {
        return 2;
    }

    while (a % 2 == 0) {
        a = a / 2;
    }

    if (a == 1) {
        return 2;
    }

    long long b = 3;

    while (sqrt(a) >= b) {
        if (a % b == 0) {
            a = a / b;
        } else {
            b += 2;
        }
    }

    if (a > 2) {
        return a;
    } else {
        return b;
    }
}

int main() {
    long long factor, t, n;

    cin >> t;

    while (t--) {
        cin >> n;
        factor = find_largest_prime_factor(n);
        cout << factor << endl;
    }

    return 0;
}
