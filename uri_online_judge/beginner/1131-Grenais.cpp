#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int granais_count = 0, inter_win_count = 0, gremio_win_count = 0;
    int a, b, x;

    while (1) {
        cin >> a >> b;
        cout << "Novo grenal (1-sim 2-nao)\n";
        granais_count++;
        if (a > b) {
            inter_win_count++;
        } else if (b > a) {
            gremio_win_count++;
        }

        cin >> x;

        if(x == 1) {
            continue;
        } else if (x == 2) {
            printf("%d grenais\n", granais_count);
            printf("Inter:%d\n", inter_win_count);
            printf("Gremio:%d\n", gremio_win_count);
            printf("Empates:%d\n", granais_count - (inter_win_count+gremio_win_count));

            if(inter_win_count > gremio_win_count) {
                printf("Inter venceu mais\n");
            } else if (gremio_win_count > inter_win_count) {
                printf("Gremio venceu mais\n");
            } else {
                printf("Não houve vencedor");
            }

            break;
        }
    }


    return 0;
}