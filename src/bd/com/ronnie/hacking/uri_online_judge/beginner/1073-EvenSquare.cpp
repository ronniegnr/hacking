#include<iostream>
#include<stdio.h>
#include<math.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    for(int i=2; i<=n; i+=2) {
        printf("%d^2 = %d\n", i, i*i);
    }

    return 0;
}
