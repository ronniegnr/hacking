#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int input_count, input;
    cin >> input_count;
    int output_count=0;

    for(int i=0; i<input_count; i++) {
        cin >> input;
        if (input >= 10 && input <= 20) {
            output_count++;
        }
    }

    printf("%d in\n", output_count);
    printf("%d out\n", input_count-output_count);

    return 0;
}
