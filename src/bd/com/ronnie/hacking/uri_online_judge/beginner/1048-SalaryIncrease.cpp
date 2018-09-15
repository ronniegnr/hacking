#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    float salary, increment, percentage;

    cin >> salary;

    if(salary >= 0 && salary <= 400) {
        increment = salary * .15;
        percentage = 15;
    } else if(salary > 400 && salary <= 800) {
        increment = salary * .12;
        percentage = 12;
    } else if(salary > 800 && salary <= 1200) {
        increment = salary * .10;
        percentage = 10;
    } else if(salary > 1200 && salary <= 2000) {
        increment = salary * .07;
        percentage = 7;
    } else if(salary > 2000) {
        increment = salary * .04;
        percentage = 4;
    }

    printf("Novo salario: %.2f\n", salary+increment);
    printf("Reajuste ganho: %.2f\n", increment);
    printf("Em percentual: %.0f %c\n", percentage, '%');

    return 0;
}
