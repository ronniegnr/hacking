#include<iostream>
#include<cstdio>
#include<map>

using namespace std;

int main() {
    map<int, string> destinations;

    destinations[61] = "Brasilia";
    destinations[71] = "Salvador";
    destinations[11] = "Sao Paulo";
    destinations[21] = "Rio de Janeiro";
    destinations[32] = "Juiz de Fora";
    destinations[19] = "Campinas";
    destinations[27] = "Vitoria";
    destinations[31] = "Belo Horizonte";

    int ddd;
    cin >> ddd;

    if(destinations.count(ddd) > 0) {
        cout << destinations[ddd] << endl;
    } else {
        cout << "DDD nao cadastrado" << endl;
    }

    return 0;
}
