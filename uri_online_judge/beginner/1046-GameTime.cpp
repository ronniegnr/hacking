#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    
    int diff;

    if (a < b) {
        diff = b - a;
    } else if (a >= b) {
        diff = b - a + 24; 
    }

    printf("O JOGO DUROU %d HORA(S)\n", diff);

    return 0;
}
