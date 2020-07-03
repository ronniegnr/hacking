#include<iostream>
#include<stdio.h>
#include<map>

using namespace std;

int main() {
    int input_count;
    cin >> input_count;

    map<char, int> animals;
    animals['C'] = 0;
    animals['R'] = 0;
    animals['S'] = 0;
    int animal_count;
    char animal_code;

    for(int i=0; i<input_count; i++) {
        cin >> animal_count >> animal_code;
        animals[animal_code] = animals[animal_code] + animal_count;
    }

    int total = animals['C'] + animals['R'] + animals['S'];
    printf("Total: %d cobaias\n", total);
    printf("Total de coelhos: %d\n", animals['C']);
    printf("Total de ratos: %d\n", animals['R']);
    printf("Total de sapos: %d\n", animals['S']);
    printf("Percentual de coelhos: %.2f %%\n", (animals['C']*100.0)/total);
    printf("Percentual de ratos: %.2f %%\n", (animals['R']*100.0)/total);
    printf("Percentual de sapos: %.2f %%\n", (animals['S']*100.0)/total);

    return 0;
}
