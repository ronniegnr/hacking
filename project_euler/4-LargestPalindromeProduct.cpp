#include <iostream>

using namespace std;

bool palindrome_check(long long input) {
    long long number = input, reverse_number = 0, digit;
    while (number > 0) {
        digit = number % 10;
        reverse_number = (reverse_number * 10) + digit;
        number = number / 10;
    }
    return input == reverse_number;
}


int main() {
    long long t, n, largest_palindrome = 0;

    cin >> t;

    while (t--) {
        cin >> n;
        for (int i = 100; i < 1000; ++i) {
            for (int j = 100; j < 1000; ++j) {
                long long mult = i * j;
                if (mult < n) {
                    if (mult > largest_palindrome && palindrome_check(mult)) {
                        largest_palindrome = mult;
                    }
                }
            }
        }
        cout << largest_palindrome << endl;
        largest_palindrome = 0;
    }

    return 0;
}

// Find the largest palindrome made from the product of two 3-digit numbers which is less than .
// "less than" part is tricky here.