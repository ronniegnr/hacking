#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

float series_sum(float n) {
    if (n == 0) {
        return 1;
    }
    return series_sum(n - 1) + ((2 * n + 1) / pow(2, n));
}

int main() {
    printf("%.2f\n", series_sum(19));
}