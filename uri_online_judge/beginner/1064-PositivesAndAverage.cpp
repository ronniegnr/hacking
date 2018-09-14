#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    float input, positive_sum = 0;
    int count = 0;

    for(int i=0; i<6; i++) {
        cin >> input;
        if(input > 0) {
            positive_sum += input;
            count = count + 1;
        }
    }

    printf("%d valores positivos\n", count);
    printf("%.1f\n", positive_sum/count);

    return 0;
}
