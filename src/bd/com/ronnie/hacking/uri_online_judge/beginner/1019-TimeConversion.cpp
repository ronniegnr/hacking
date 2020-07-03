#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int seconds;
    cin >> seconds;

    int hour = seconds/3600;
    seconds = seconds%3600;
    int minute = seconds/60;
    int second = seconds%60;

    printf("%d:%d:%d\n", hour, minute, second);
    
    return 0;
}
