#include <iostream>
#include <cmath>

using namespace std;

int main() {

    int a, b, c, result;

    while (cin >> a && a != 0) {
        cin >> b >> c;
        result = sqrt((a * b * 100) / (double) c);
        cout << result << endl;
    }

    return 0;
}