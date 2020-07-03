#include <iostream>
#include <cstdio>

using namespace std;

int main() {

    int n;

    while (1) {
        cin >> n;
        if (n == 0) {
            break;
        } else {
            int arr[n][n];
            int iter = (n % 2 == 0) ? (n / 2) : (n / 2) + 1;
            int fillValue = 1;
            int limit = n;
            int xIndex = 0, yIndex = 0;

            // fill arr[][] with value
            for (int i = 0; i < iter; ++i) {
                for (int j = xIndex; j < limit; ++j) {
                    for (int k = yIndex; k < limit; ++k) {
                        arr[j][k] = fillValue;
                    }
                }
                limit--;
                xIndex++;
                yIndex++;
                fillValue++;
            }

            // print arr[][] in specified format
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (j > 0) {
                        printf(" ");
                    }
                    printf("%3d", arr[i][j]);
                }
                cout << "\n";
            }
            cout << "\n";
        }
    }

    return 0;
}