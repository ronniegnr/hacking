#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int a, b;
    while(1) {
        cin >> a >> b;
        if(a == b) {
            break;
        }

        if(a > b) {
            cout << "Decrescente" << endl;
        }
        if(b > a) {
            cout << "Crescente" << endl;
        }
    }

    return 0;
}
