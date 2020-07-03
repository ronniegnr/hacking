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

            int xIndex = 0, yIndex = 0;
            int fillValue = 1;
            for (int i = 0; i < n; ++i) {
                for (int j = xIndex; j < n; ++j) {
                    arr[xIndex][yIndex++] = fillValue++;
                }
                xIndex++;
                yIndex = xIndex;
                fillValue = 1;
            }

            int index = 1;
            int startValue;
            for (int i = 0; i < n - 1; ++i) {
                startValue = index + 1;
                for (int j = 0; j < index; ++j) {
                    arr[index][j] = startValue--;
                }
                index++;
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