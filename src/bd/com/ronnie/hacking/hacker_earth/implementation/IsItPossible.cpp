#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, a;
    string s;
    cin >> n;

    while (n--) {
        cin >> s;
        a = s[s.length() - 1];
        cout << (a % 2 ? "NO" : "YES") << "\n";
    }

    return 0;
}