#include <iostream>

using namespace std;

bool isPrime(int a);

int main() {
    int n;
    cin >> n;
    for (int i = 2; i <= n; ++i) {
        if(isPrime(i)) {
            cout << i << " ";
        }
    }
}

bool isPrime(int a) {
    bool result = true;
    for (int i = 2; i <= a / 2; ++i) {
        if (a % i == 0) {
            result = false;
            break;
        }
    }
    return result;
}