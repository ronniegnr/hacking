#include <iostream>
#include <cstdio>

using namespace std;

float harmonic_sum(float n) {
    if (n == 1) {
        return 1;
    }
    return harmonic_sum(n - 1) + (1 / n);
}

int main() {
    printf("%.50f\n", harmonic_sum(100));
}