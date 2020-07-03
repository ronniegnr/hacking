#include<iostream>
#include<cstdio>

using namespace std;

int main() {
    int d=0, h=0, m=0, s=0;
    int ed=0, eh=0, em=0, es=0;

    scanf("Dia %d", &d);
    scanf("%d : %d : %d\n", &h, &m, &s);
    scanf("Dia %d", &ed);
    scanf("%d : %d : %d", &eh, &em, &es);

    s = es - s;
    m = em - m;
    h = eh - h;
    d = ed - d;

    if(s < 0) {
        s += 60;
        m--;
    }
    if(m < 0) {
        m += 60;
        h--;
    }
    if(h < 0) {
        h += 24;
        d--;
    }

    printf("%d dia(s)\n", d);
    printf("%d hora(s)\n", h);
    printf("%d minuto(s)\n", m);
    printf("%d segundo(s)\n", s);

    return 0;
}
