#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int number, hour;
    float amount;
    cin >> number >> hour >> amount;
    printf("NUMBER = %d\n", number);
    printf("SALARY = U$ %.2f\n", hour*amount);
    
    return 0;
}
