#include <iostream>

using namespace std;

int main() {
    int n;
    long results[3] = {0};
    cin >> n;

    long m = 0, a;
    while (m++ < n) {
        cin >> a;
        results[m % 3] += a;
    }

    cout << results[1] << " " << results[2] << " " << results[0];
}