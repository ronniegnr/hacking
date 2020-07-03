#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    float m[12][12];
    char operation;

    cin >> operation;

    for (int i = 0; i < 12; ++i) {
        for (int j = 0; j < 12; ++j) {
            cin >> m[i][j];
        }
    }

    float sum = 0, number_count = 0;
    for (int k = 1; k < 12; ++k) {
        for (int l = 12-k; l < 12; ++l) {
            sum += m[l][k];
            number_count++;
        }
    }

    float result = sum / ((operation == 'S') ? 1 : number_count);
    printf("%.1f\n", result);

    return 0;
}