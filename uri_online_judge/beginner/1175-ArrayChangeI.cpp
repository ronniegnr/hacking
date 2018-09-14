#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int n[20];

    for (int i = 0; i < 20; ++i) {
        cin >> n[19 - i];
    }

    for (int j = 0; j < 20; ++j) {
        printf("N[%d] = %d\n", j, n[j]);
    }

    return 0;
}