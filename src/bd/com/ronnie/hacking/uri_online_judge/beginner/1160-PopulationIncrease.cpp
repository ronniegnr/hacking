#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    long long t, pa, pb, na, nb;
    int i;
    double g1, g2;

    cin >> t;

    while (t--) {
        cin >> pa >> pb >> g1 >> g2;

        na = pa;
        nb = pb;
        for (i = 0; i <= 100 && na <= nb; ++i) {
            na = na + (na * (g1 / 100));
            nb = nb + (nb * (g2 / 100));
        }

        if (i > 100) {
            cout << "Mais de 1 seculo." << endl;
        } else {
            printf("%d anos.\n", i);
        }
    }

    return 0;
}