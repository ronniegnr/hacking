#include<cstdio>
#include<iostream>
#include<cmath>

using namespace std;

void sort(float &a, float &b, float &c) {
    if(a<b) swap(a, b);
    if(a<c) swap(a, c);
    if(b<c) swap(b, c);
}

int main() {
    float a, b, c;
    cin >> a >> b >> c;
    
    sort(a, b, c);

    if(a >= b+c) {
        cout << "NAO FORMA TRIANGULO" << endl;
    } else {

        if(pow(a, 2) == pow(b, 2) + pow(c, 2)) {
            cout << "TRIANGULO RETANGULO" << endl;
        } else if(pow(a, 2) > pow(b, 2) + pow(c, 2)) {
            cout << "TRIANGULO OBTUSANGULO" << endl;
        } else if(pow(a, 2) < pow(b, 2) + pow(c, 2)) {
            cout << "TRIANGULO ACUTANGULO" << endl;
        }
    
        if(a == b && a == c && b == c) {
            cout << "TRIANGULO EQUILATERO" << endl;
        } else if (a==b || b==c || a==c) {
            cout << "TRIANGULO ISOSCELES" << endl;
        }
    }
}


