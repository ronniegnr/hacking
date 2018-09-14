#include <iostream>

using namespace std;

bool isPrime(int number);

int main() {
    int n;

    cin >> n;
    cout << isPrime(n);

    return 0;
}

bool isPrime(int number) {
    if (number != 2) {
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; (i * i) <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
    }
    return true;
}
