#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int column;
    float m[12][12];
    char operation;

    cin >> column;
    cin >> operation;

    for (int i = 0; i < 12; ++i) {
        for (int j = 0; j < 12; ++j) {
            cin >> m[i][j];
        }
    }

    float sum = 0;
    for (int k = 0; k < 12; ++k) {
        sum += m[k][column];
    }

    float result = sum / ((operation == 'S') ? 1 : 12);
    printf("%.1f\n", result);

    return 0;
}