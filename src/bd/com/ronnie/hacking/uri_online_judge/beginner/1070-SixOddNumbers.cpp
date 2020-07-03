#include<iostream>

using namespace std;

int main() {
    int input, i;
    cin >> input;
    if (input%2 == 0) {
        i = input + 1;
    } else {
        i = input;
    }

    for(int j=0; j<6; j++, i+=2) {
        cout << i << endl;
    }
}
