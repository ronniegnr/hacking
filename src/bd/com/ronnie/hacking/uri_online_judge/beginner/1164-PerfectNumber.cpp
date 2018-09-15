#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int n;
    long x, sum = 0;

    cin >> n;

    while (n--) {
        cin >> x;
        for (int i = 1; i < x; ++i) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if(x == sum) {
            printf("%d eh perfeito\n", x);
        } else {
            printf("%d nao eh perfeito\n", x);
        }
        sum = 0;
    }

    return 0;
}