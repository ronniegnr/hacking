#include<iostream>
#include<algorithm>
#include<stdio.h>

using namespace std;

int main() {
    float arr[3];
    for(int i=0; i<3; i++) {
        cin >> arr[i];
    }

    float perimetro = arr[0] + arr[1] + arr[2];
    float area = (arr[0]+arr[1]) * arr[2] * .5;
    
    sort(arr, arr+3);
    
    if(arr[0]+arr[1] > arr[2]) {
        printf("Perimetro = %.1f\n", perimetro);
    } else {
        printf("Area = %.1f\n", area);
    }
}
