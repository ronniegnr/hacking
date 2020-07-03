#include<iostream>
#include<stdio.h>

using namespace std;

int calculate_odd_sum(int a, int b) {
    if(a > b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    int sum = 0;
    for(int i=a+1; i<b; i++) {
        if(i%2==1 || i%2==-1) {
            sum += i;
        }
    }
    return sum;
}

int main() {
    int input_count, one, two;
    cin >> input_count;

    for(int i=0; i<input_count; i++) {
        cin >> one >> two;
        cout << calculate_odd_sum(one, two) << endl;
    }

    return 0;
}
