#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int code1, code2;
    double unit1, price1, unit2, price2;
    cin >> code1 >> unit1 >> price1 >> code2 >> unit2 >> price2;
    printf("VALOR A PAGAR: R$ %.2f\n", unit1*price1+unit2*price2);
    
    return 0;
}
