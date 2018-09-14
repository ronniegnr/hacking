#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int input_count, input;
    cin >> input_count;

    for(int i=0; i<input_count; i++) {
        cin >> input;
        if(input == 0) {
            printf("NULL\n");
        } else if (input%2 == 0 && input >0) {
            printf("EVEN POSITIVE\n");
        } else if (input%2 == 0 && input <0) {
            printf("EVEN NEGATIVE\n");
        } else if ((input%2 == 1||input%2==-1) && input >0) {
            printf("ODD POSITIVE\n");
        } else if ((input%2 == 1||input%2==-1) && input <0) {
            printf("ODD NEGATIVE\n");
        }
    }

    return 0;
}
