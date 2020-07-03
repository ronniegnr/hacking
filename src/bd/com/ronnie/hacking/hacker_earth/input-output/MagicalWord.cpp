#include <iostream>

using namespace std;

bool isPrime(int number);

int main() {
    int t, n;
    string s;

    cin >> t;

    while (t--) {
        cin >> n >> s;
        int arr1[58] = {0};
        string sNew = "";

        char c;
        int m;
        for (int i = 0; i < s.length(); ++i) {
            c = s[i];
            m = (int) c;
            if (m < 65) {
                m = 67;
            } else if (m > 90 && m < 94) {
                m = 89;
            } else if (m > 93 && m < 98) {
                m = 97;
            } else if (m > 122) {
                m = 113;
            }

            if (isPrime(m)) {
                sNew += (char)m;
            } else if (arr1[m - 65] == 0) {
                int x = m, y = m;
                while (true) {
                    x--;
                    y++;
                    if (isPrime(x) && ((x > 64 && x < 91) || (x > 96 && x < 123))) {
                        arr1[m - 65] = x;
                        sNew += (char) x;
                        break;
                    } else if (isPrime(y) && ((y > 64 && y < 91) || (y > 96 && y < 123))) {
                        arr1[m - 65] = y;
                        sNew += (char) y;
                        break;
                    }
                }
            } else {
                sNew += (char) arr1[m - 65];
            }
        }
        cout << sNew << "\n";
    }

    return 0;
}

bool isPrime(int number) {
    if (number != 2) {
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; (i * i) <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
    }
    return true;
}
