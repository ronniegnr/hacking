#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, m;

    cin >> n;
    int arr1[n];
    for (int i = 0; i < n; ++i) {
        cin >> arr1[i];
    }
    sort(arr1, arr1 + n);

    cin >> m;
    int arr2[m];
    for (int i = 0; i < m; ++i) {
        cin >> arr2[i];
    }
    sort(arr2, arr2 + m);

    int p = 0, q = 0, pair = 0;
    while (1) {
        if (p >= n || q >= m) {
            break;
        }
        if (arr1[p] - arr2[q] > -2 && arr1[p] - arr2[q] < 2) {
            pair++;
            p++;
            q++;
        } else {
            if (arr1[p] < arr2[q]) {
                p++;
            } else {
                q++;
            }
        }
    }

    cout << pair;

    return 0;
}