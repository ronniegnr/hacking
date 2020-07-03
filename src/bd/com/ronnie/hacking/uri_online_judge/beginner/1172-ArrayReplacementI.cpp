#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int input [10];
    for (int i = 0; i < 10; ++i) {
        cin >> input[i];
        if(input[i] < 1) {
            input[i] = 1;
        }
        printf("X[%d] = %d\n", i, input[i]);
    }

    return 0;
}