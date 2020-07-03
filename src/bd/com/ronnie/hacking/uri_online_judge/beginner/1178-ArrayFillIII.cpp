#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    double x, n[100];
    cin >> x;

    n[0] = x;
    printf("N[%d] = %.4f\n", 0, n[0]);
    for (int i = 1; i < 100; ++i) {
        n[i] = n[i-1] / 2;
        printf("N[%d] = %.4f\n", i, n[i]);
    }

    return 0;
}