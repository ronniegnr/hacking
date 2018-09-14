#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;

    for (int i = 0; i < n; ++i) {
        if(i == 0) {
            cout << "Ho";
        } else {
            cout << " Ho";
        }
    }
    cout << "!" << endl;

    return 0;
}