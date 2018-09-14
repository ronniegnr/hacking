#include <iostream>
#include <cstdio>

using namespace std;

int main() {

    int alcohol_count = 0, gasoline_count = 0, diesel_count = 0, input;

    while (1) {
        cin >> input;
        if (input == 1) {
            alcohol_count++;
        } else if (input == 2) {
            gasoline_count++;
        } else if (input == 3) {
            diesel_count++;
        } else if(input == 4) {
            break;
        }
    }

    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", alcohol_count);
    printf("Gasolina: %d\n", gasoline_count);
    printf("Diesel: %d\n", diesel_count);

    return 0;
}