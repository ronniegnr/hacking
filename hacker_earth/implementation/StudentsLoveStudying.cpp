#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int t, n, m, k;

    cin >> t;

    while (t--) {
        cin >> n >> m >> k;
        int m1[n][m], m2[m][k];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                cin >> m1[i][j];
            }
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < k; ++j) {
                cin >> m2[i][j];
            }
        }

        int r[n][k];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < k; ++j) {
                r[i][j] = 0;
                for (int l = 0; l < m; ++l) {
                    r[i][j] += m1[i][l] * m2[l][j];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < k; ++j) {
                cout << r[i][j] << " ";
            }
            cout << "\n";
        }


    }


    return 0;
}
