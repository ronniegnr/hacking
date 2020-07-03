#include <iostream>

using namespace std;

int main() {
    int n;
    long long int min = 9223372036854775807 , a;
    long long int max = 0;
    cin >> n;

    while (n--) {
        cin >> a;
        min = a < min ? a : min;
        max = a > max ? a : max;
    }
    cout << min + max;

    return 0;
}