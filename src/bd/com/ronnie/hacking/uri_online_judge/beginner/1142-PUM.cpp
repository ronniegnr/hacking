#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int input;
    cin >> input;

    for (int i = 0, j = 1; i < input; ++i, j+=4) {
        printf("%d %d %d PUM\n", j, j+1, j+2);
    }

    return 0;
}