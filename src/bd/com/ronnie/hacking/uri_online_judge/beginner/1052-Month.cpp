#include<iostream>
#include<map>

using namespace std;

int main() {
    map<int, string> destinations;

    destinations[1] = "January";
    destinations[2] = "February";
    destinations[3] = "March";
    destinations[4] = "April";
    destinations[5] = "May";
    destinations[6] = "June";
    destinations[7] = "July";
    destinations[8] = "August";
    destinations[9] = "September";
    destinations[10] = "October";
    destinations[11] = "November";
    destinations[12] = "December";

    int a;
    cin >> a;
    cout << destinations[a] << endl;

    return 0;
}
