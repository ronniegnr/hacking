#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int n;
    cin >> n;

    int a = 0, b = 1, c;

    for (int i = 0; i < n; ++i) {
        if(i != n-1) {
            printf("%d ", a);
        } else {
            printf("%d\n", a);
        }
        c = b;
        b = a + b;
        a = c;
    }

    return 0;
}