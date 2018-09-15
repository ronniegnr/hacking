#include <iostream>
#include <cstdio>
#include <cmath>
#include <sstream>

using namespace std;

int count_number(int number);

int main() {

    int n;

    while (1) {
        cin >> n;
        if (n == 0) {
            break;
        } else {
            int arr[n][n];

            for (int i = 0; i < n; ++i) {
                for (int j = 0, k = i; j < n; ++j) {
                    arr[i][j] = (int) pow(2, k++);
                }
            }

            int max_len = count_number(arr[n - 1][n - 1]);

            // print arr[][] in specified format
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (j != 0) {
                        printf(" ");
                    }
                    int len_diff = max_len - count_number(arr[i][j]);
                    for (int k = 0; k < len_diff; ++k) {
                        printf(" ");

                    }
                    printf("%d", arr[i][j]);
                }
                cout << "\n";
            }
            cout << "\n";
        }
    }

    return 0;
}

int count_number(int number) {
    int count = 0;

    while (number != 0) {
        number = number / 10;
        count++;
    }
    return count;
}