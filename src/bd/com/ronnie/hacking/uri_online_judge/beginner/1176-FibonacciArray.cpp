#include <iostream>

using namespace std;

long long nth_fibonacci(long long n) {
    if (n == 0) {
        return 0;
    }
    long long n1 = 0, n2 = 1, tmp;
    for (int i = 1; i < n; ++i) {
        tmp = n2;
        n2 = n1 + n2;
        n1 = tmp;
    }
    return n2;
}

int main() {
    int t;
    long long n;
    cin >> t;

    while (t--) {
        cin >> n;
        cout << "Fib(" << n << ") = " << nth_fibonacci(n) << endl;
    }

    return 0;
}