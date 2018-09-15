#include <iostream>

using namespace std;

int main() {
    std::ios::sync_with_stdio(false);

    string x;
    int k;
    cin >> x >> k;

    for (int i = 0, j = 0; i < k && j < x.size(); ++j) {
        if(x[j] == '9') {
            continue;
        } else {
            x[j] = '9';
            i++;
        }

    }

    cout << x;
}