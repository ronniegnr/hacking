#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int input;
    int even_count = 0, positive_count = 0, negative_count = 0;

    for(int i=0; i<5; i++) {
        cin >> input;
        if (input%2 == 0) {
            even_count++;
        }
        if (input > 0) {
            positive_count++;
        } else if (input < 0) {
            negative_count++;
        }
    }

    printf("%d valor(es) par(es)\n", even_count);
    printf("%d valor(es) impar(es)\n", 5-even_count);
    printf("%d valor(es) positivo(s)\n", positive_count);
    printf("%d valor(es) negativo(s)\n", negative_count);

    return 0;
}
