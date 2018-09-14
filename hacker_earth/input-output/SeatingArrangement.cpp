#include <iostream>

using namespace std;

int main() {
    int t, n;
    cin >> n;
    string type;
    int frontSeat;

    while (n--) {

        cin >> t;
        if (t % 6 == 0 || t % 6 == 1) {
            type = "WS";
        } else if (t % 6 == 3 || t % 6 == 4) {
            type = "AS";
        } else {
            type = "MS";
        }
        if (t % 12 != 0) {
            frontSeat = 13 - (t % 12) + (t / 12) * 12;
        } else {
            frontSeat = 13 + (t / 12 - 2) * 12;
        }
        cout << frontSeat << " " << type << endl;

    }

    return 0;
}