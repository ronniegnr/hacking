#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int t, n[1000];
    cin >> t;

    for (int i = 0, j = 0; i < 1000; ++i, ++j) {
        if (j == t) {
            j = 0;
        }
        n[i] = j;
        printf("N[%d] = %d\n", i, j);
    }

    return 0;
}