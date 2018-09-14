#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int time, speed;
    cin >> time >> speed;
    printf("%.3f\n", (time*speed)/12.0);
    
    return 0;
}
