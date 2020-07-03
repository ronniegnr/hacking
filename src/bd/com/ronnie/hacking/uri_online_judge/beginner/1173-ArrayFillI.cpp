#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int v, n[10];
    cin >> v;
    n[0] = v;
    printf("N[%d] = %d\n", 0, n[0]);

    for (int i = 1; i < 10; ++i) {
        n[i] = n[i - 1] * 2;
        printf("N[%d] = %d\n", i, n[i]);
    }

    return 0;
}

