#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int amount, result;
    cin >> amount;

    int notes[] = {100, 50, 20, 10, 5, 2, 1};

    printf("%d\n", amount);

    for(int i=0; i<7; i++) {
        result = amount/notes[i];
        amount = amount%notes[i];
        printf("%d nota(s) de R$ %d,00\n", result, notes[i]);
    }
    
    return 0;
}
