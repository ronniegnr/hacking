#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int n, result;
    cin >> n;

    result = (n != 0 ? 1 : 0);

    for (int i = n; i > 0; --i) {
        result *= i;
    }

    printf("%d\n", result);

    return 0;
}