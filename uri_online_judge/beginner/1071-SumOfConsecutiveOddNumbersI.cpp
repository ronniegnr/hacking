#include<iostream>

using namespace std;

int main() {
    int max, min, sum=0;
    cin >> max >> min;

    if (min > max) {
        min = min + max;
        max = min - max;
        min = min - max;
    }

    for(int i=min+1; i<max; i++) {
        if (i%2 == 1 || i%2 == -1) {
            sum+=i;
        }
    }

    cout << sum << endl;

    return 0;
}
