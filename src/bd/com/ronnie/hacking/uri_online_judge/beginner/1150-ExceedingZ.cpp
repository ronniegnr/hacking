#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int x, z, count = 0;
    cin >> x;

    do {
        cin >> z;
    } while (z <= x);

    for (int a = x, b = 0; b < z; a++) {
        b += a;
        count++;
    }

    printf("%d\n", count);

    return 0;
}