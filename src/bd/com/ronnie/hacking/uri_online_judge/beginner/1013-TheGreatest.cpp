#include<iostream>
#include<cstdlib>
#include<cstdio>

using namespace std;

int maiorAB(int a, int b) {
    return (a + b + abs(a - b)) / 2;
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int greatest = maiorAB(a, maiorAB(b, c));
    printf("%d eh o maior\n", greatest);
    
    return 0;
}
