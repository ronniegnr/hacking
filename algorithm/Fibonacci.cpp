#include <iostream>

using namespace std;

long long nth_fibonacci_recursive(long long n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }
    else {
        return nth_fibonacci_recursive(n - 1) + nth_fibonacci_recursive(n - 2);
    }
}

long long nth_fibonacci_loop(long long n) {
    long long n1 = 0, n2 = 1, tmp;
    for (int i = 1; i < n; ++i) {
        tmp = n2;
        n2 = n1 + n2;
        n1 = tmp;
    }
    return n2;
}

int main() {
    long long n;
    cin >> n;

    cout << "with recursion: " << nth_fibonacci_recursive(n) << endl;
    cout << "with loop: " << nth_fibonacci_loop(n) << endl;

    return 0;
}

// algorithm theory - Fibonacci Number - https://en.wikipedia.org/wiki/Fibonacci_number