#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    string name;
    double salary, sales;
    cin >> name >> salary >> sales;
    printf("TOTAL = R$ %.2f\n", salary+(sales*15)/100);
    
    return 0;
}
