#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int n, i;
    long x;
    cin >> n;

    while (n--) {
        cin >> x;
        for (i = 2; i < x; ++i) {
            if (x % i == 0) {
                break;
            }
        }

        if(i == x) {
            printf("%d eh primo\n", x);
        } else {
            printf("%d nao eh primo\n", x);
        }
    }

    return 0;
}