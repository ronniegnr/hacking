#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	double value;
	cin >> value;

	int whole = (int)value;
	int fraction = (int)((value - whole)*100);

	int notes[] = {100, 50, 20, 10, 5, 2};
	int coins[] = {100, 50, 25, 10, 5, 1};

	int result;

	printf("NOTAS:\n");
	for(int i=0; i<6; i++) {
		result = whole/notes[i];
		whole = whole%notes[i];
		printf("%d nota(s) de R$ %d.00\n", result, notes[i]);
	}

	fraction = fraction + whole*100;
	printf("MOEDAS:\n");
	for(int i=0; i<6; i++) {
		result = fraction/coins[i];
		fraction = fraction%coins[i];
		printf("%d moeda(s) de R$ %.2f\n", result, coins[i]/100.0);
	}

    return 0;
}
