#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    float input_count, a, b, c;
    cin >> input_count;

    for(int i=0; i<input_count; i++) {
        cin >> a >> b >> c;
        printf("%.1f\n", (a*2+b*3+c*5)/10);
    }

    return 0;
}
