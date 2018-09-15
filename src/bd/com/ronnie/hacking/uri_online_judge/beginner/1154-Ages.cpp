#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int input, count = 0;
    float sum = 0;

    while (1) {
        cin >> input;
        if (input < 0) {
            break;
        }
        sum += input;
        count++;
    }

    printf("%.2f\n", sum/count);

    return 0;
}