#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    float input;
    int count = 0;

    for(int i=0; i<6; i++) {
        cin >> input;
        if(input > 0) {
            count = count + 1;
        }
    }

    printf("%d valores positivos\n", count);

    return 0;
}
