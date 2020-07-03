#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
    int password = 2002, input;
    cin >> input;
    while(input != password) {
        cout << "Senha Invalida" << endl;
        cin >> input;
    }
    cout << "Acesso Permitido" << endl;

    return 0;
}
