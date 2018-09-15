#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    double m[12][12];
    char operation;

    cin >> operation;

    for (int i = 0; i < 12; ++i) {
        for (int j = 0; j < 12; ++j) {
            cin >> m[i][j];
        }
    }

    double sum = 0, number_count = 0;
    for (int k = 11; k > 6; --k) {
        for (int l = 12-k; l < k; ++l) {
            sum += m[k][l];
            number_count++;
        }
    }

    double result = sum / (operation == 'S' ? 1 : number_count);
    printf("%.1f\n", result);

    return 0;
}