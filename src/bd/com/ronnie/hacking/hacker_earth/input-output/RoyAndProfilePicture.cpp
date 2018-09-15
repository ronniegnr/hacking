#include <iostream>

using namespace std;

int main() {
    int l, n;
    int a, b;
    cin >> l >> n;

    while (n--) {
        cin >> a >> b;
        if(a < l || b < l) {
            cout << "UPLOAD ANOTHER" << endl;
        } else {
            if(a == b) {
                cout << "ACCEPTED" << endl;
            } else {
                cout << "CROP IT" << endl;
            }
        }
    }
}