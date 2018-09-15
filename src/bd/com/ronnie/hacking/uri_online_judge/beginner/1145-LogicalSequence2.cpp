#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int x, y;

    cin >> x >> y;

    for (int i = 1; i < y; i += x) {
        for (int j = 0; j < x; ++j) {
            if (j == x - 1) {
                printf("%d\n", i + j);
                continue;
            }
            printf("%d ", i + j);
        }
    }

    return 0;
}