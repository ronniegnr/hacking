#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long n, q;
    cin >> n >> q;

    long arr[n], sum[n] = {0}, preSum = 0;
    int m = n;
    while (m--) {
        cin >> arr[n - m - 1];
        sum[n - m - 1] = preSum + arr[n - m - 1];
        preSum = sum[n - m - 1];
    }

    int l, r;
    while (q--) {
        cin >> l >> r;
        long isum = 0;
        isum = sum[r - 1] - (l != 1 ? sum[l - 2] : 0);
        cout << isum / (r - l + 1) << "\n";
    }

    return 0;
}