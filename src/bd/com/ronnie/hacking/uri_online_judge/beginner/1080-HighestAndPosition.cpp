#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int position=0, highest_value=0, input;

    for(int i=1; i<=100; i++) {
        cin >> input;
        if (input > highest_value) {
            position = i;
            highest_value = input;
        }
    }

    cout << highest_value << endl << position << endl;

    return 0;
}
