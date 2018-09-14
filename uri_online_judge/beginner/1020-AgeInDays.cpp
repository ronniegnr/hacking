#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int days;
    cin >> days;

    int year = days/365;
    days = days%365;
    int month = days/30;
    int day = days%30;

    printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, month, day);

    return 0;
}
