#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int a, b, i, sum;
    while(1) {
        cin >> a >> b;
        if(a<1 || b<1) {
            break;
        }

        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        i = a;
        sum = 0;
        while(i<=b) {
            sum += i;
            cout << i++ << " ";
        }
        printf("Sum=%d\n", sum);
    }

    return 0;
}
