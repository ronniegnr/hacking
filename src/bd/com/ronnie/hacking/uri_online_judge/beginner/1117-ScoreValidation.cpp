#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    float x, score[2];

    for (int i = 0; i < 2; i++) {
        cin >> x;
        if (x < 0 || x > 10) {
            i--;
            cout << "nota invalida" << endl;
            continue;
        }
        score[i] = x;
    }
    printf("media = %.2f\n", (score[0] + score[1]) / 2);

    return 0;
}
