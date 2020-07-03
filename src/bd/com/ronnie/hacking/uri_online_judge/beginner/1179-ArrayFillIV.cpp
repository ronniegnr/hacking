#include <iostream>
#include <cstdio>

using namespace std;

void print_array(int array[5], int size, string array_name) {
    for (int i = 0; i < size; ++i) {
        printf("%s[%d] = %d\n", array_name.c_str(), i, array[i]);
    }
}

int main() {
    int even_index = 0, odd_index = 0, x;
    int  par[5], impar[5];

    for (int i = 0; i < 15; ++i) {
        cin >> x;
        if(even_index == 5) {
            print_array(par, even_index, "par");
            even_index = 0;
        } else if(odd_index == 5) {
            print_array(impar, odd_index, "impar");
            odd_index = 0;
        }
        if (x % 2 == 0) {
            par[even_index] = x;
            ++even_index;
        } else {
            impar[odd_index] = x;
            ++odd_index;
        }
    }

    print_array(impar, odd_index, "impar");
    print_array(par, even_index, "par");

    return 0;
}