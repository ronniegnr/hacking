#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int x[n];

    int i = 0;
    while (i < n) {
        cin >> x[i];
        i++;
    }

    int lowest = x[0], index = 0;
    for (int j = 1; j < n; ++j) {
        if(x[j] < lowest) {
            lowest = x[j];
            index = j;
        }
    }

    cout << "Menor valor: " << lowest << endl;
    cout << "Posicao: " << index << endl;

    return 0;
}