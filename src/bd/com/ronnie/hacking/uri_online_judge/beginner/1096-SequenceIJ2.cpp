#include<iostream>
#include<stdio.h>
#include<map>

using namespace std;

int main() {
    for(int i=1; i<10; i+=2) {
        printf("I=%d J=%d\n", i, 7);
        printf("I=%d J=%d\n", i, 6);
        printf("I=%d J=%d\n", i, 5);
    }

    return 0;
}
