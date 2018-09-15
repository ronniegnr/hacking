#include <iostream>

using namespace std;

bool pallindrome_check(long long input) {
    long long number = input, reverse_number = 0, digit;
    while(number > 0) {
        digit = number % 10;
        reverse_number = (reverse_number*10) + digit;
        number = number / 10;
    }
    return input == reverse_number;
}


int main() {
    long long number;

    cin >> number;
    cout << pallindrome_check(number);

    return 0;
}