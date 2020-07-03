#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    float input_count, x, y;
    cin >> input_count;

    for(int i=0; i<input_count; i++) {
        cin >> x >> y;
        if(x!=0 && y==0) {
            cout << "divisao impossivel" << endl;
        } else if(x==0 && y!=0) {
            cout << "0.0" << endl;
        } else {
            printf("%.1f\n", x/y);
        }
    }

    return 0;
}
