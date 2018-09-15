#include<iostream>
#include<stdio.h>
#include<math.h>

using namespace std;

int main() {
	double a, b, c;
	cin >> a >> b >> c;

	double calc = sqrt(pow(b, 2) - (4*a*c));
	double r1 = (-b + calc) / (2*a);
	double r2 = (-b - calc) / (2*a);

	if(a!=0 && calc>0) {
		printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
	} else {
		printf("Impossivel calcular\n");
	}
	
	return 0;
}
