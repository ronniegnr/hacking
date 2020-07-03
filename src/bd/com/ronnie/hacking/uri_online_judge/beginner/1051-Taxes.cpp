#include<iostream>
#include<cstdio>
#include<cfloat>

using namespace std;

int main() {
    float sal;
    cin >> sal;

    float lranges[] = {2000, 1000, 1500, FLT_MAX};
    float taxes[] = {.08, .18, .28};
    float ttax = 0;
    for(int i=0; i<3; i++) {
        sal = sal - lranges[i];
        if(sal > 0) {
            if(sal >= lranges[i+1]) {
                ttax += lranges[i+1] * taxes[i];
            } else {
                ttax += sal * taxes[i];
                break;
            }
        } else  {
            break;
        }
    }

    if(ttax == 0) {
        cout << "Isento" << endl;
    } else {
        printf("R$ %.2f\n", ttax);
    }

    return 0;
}
