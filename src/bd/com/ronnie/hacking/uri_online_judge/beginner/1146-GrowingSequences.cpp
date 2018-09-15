#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int x;
    cin >> x;

    while (x != 0) {
        int i = 1;
        for (; i < x; ++i) {
            printf("%d ", i);
        }
        printf("%d\n", i);

        cin >> x;
    }

    return 0;
}