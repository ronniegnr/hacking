#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int divisor = 1;

    while(divisor <= n) {
        if(n % divisor == 0) {
            cout << divisor << endl;
        }
        divisor++;
    }
}