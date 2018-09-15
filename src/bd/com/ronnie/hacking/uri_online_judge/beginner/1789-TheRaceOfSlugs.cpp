#include <iostream>

using namespace std;

int main() {

    int l;

    while (cin >> l) {
        int arr[l];

        for (int i = 0; i < l; ++i) {
            cin >> arr[i];
        }

        int lvl = 1, int_level = 1;
        for (int i = 0; i < l; ++i) {
            if (arr[i] >= 10 && arr[i] < 20) {
                int_level = 2;
            } else if (arr[i] >= 20) {
                int_level = 3;
            }

            lvl = int_level > lvl ? int_level : lvl;
        }

        cout << lvl << endl;
    }

    return 0;
}