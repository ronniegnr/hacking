#include <iostream>

using namespace std;

int main() {
    int n, min = INT32_MAX, max = 0;
    cin >> n;
    int inputs[1000] = {0};

    int a;
    while (n--) {
        cin >> a;
        if (a < min) {
            min = a;
        }
        if (a > max) {
            max = a;
        }
        inputs[a] = 1;
    }

    string output = "YES";
    for (int i = min; i <= max; ++i) {
        if (inputs[i] == 0) {
            output = "NO";
            break;
        }
    }

    cout << output;

}