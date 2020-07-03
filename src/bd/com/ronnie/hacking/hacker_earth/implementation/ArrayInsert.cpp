#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, q;
    cin >> n >> q;

    int arr[n];
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    int t, x, y, s;
    while (q--) {
        cin >> t >> x >> y;
        if (t == 1) {
            arr[x] = y;
        } else {
            s = 0;
            for (int i = x; i <= y; ++i) {
                s += arr[i];
            }
            cout << s << "\n";
        }
    }

    return 0;
}