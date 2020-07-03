#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int a, n, sum=0;
    cin >> a >> n;

    while (n < 1) {
        cin >> n;
    }

    for (int i = 0; i < n; ++i) {
        sum += (a + i);
    }

    printf("%d\n", sum);


    return 0;
}