#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int h1, m1, h2, m2, mdiff=0, hdiff=0, hfromm=0;

    cin >> h1 >> m1 >> h2 >> m2;

    if(m1 < m2) {
        mdiff = m2 - m1;
    } else {
        mdiff = m2 - m1 + 60;
        hfromm = -1;
    }
    hfromm = hfromm + (mdiff/60);
    mdiff = mdiff%60;

    if(h1 < h2) {
        hdiff = h2 - h1;
    } else {
        hdiff = h2 - h1 + 24;
    }
    hdiff = hdiff + hfromm;

    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hdiff, mdiff);

    return 0;
}
