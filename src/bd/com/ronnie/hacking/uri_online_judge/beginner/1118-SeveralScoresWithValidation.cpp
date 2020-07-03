#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    float input, number1, number2, number_read = 0;

    while (1) {
        cin >> input;
        if (input < 0 || input > 10) {
            cout << "nota invalida" << endl;
        } else if (number_read == 0) {
            number1 = input;
            number_read++;
        } else if (number_read == 1) {
            number2 = input;
            number_read++;
            printf("media = %.2f\n", (number1 + number2) / 2);
        } else if (number_read == 2) {
            printf("novo calculo (1-sim 2-nao)\n");
            if (input == 1) {
                number_read = 0;
            } else if (input == 2) {
                break;
            }
        }
    }

    return 0;
}