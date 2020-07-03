#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	float n1, n2, n3, n4;
	cin >> n1 >> n2 >> n3 >> n4;
	float media = (n1*2 + n2*3 + n3*4 + n4) / (2+3+4+1);
	printf("Media: %.1f\n", media);
	if(media >= 7.0) {
		printf("Aluno aprovado.\n");
	} else if(media < 5.0) {
		printf("Aluno reprovado.\n");
	} else if(media>=5.0 && media<=6.9) {
		printf("Aluno em exame.\n");
		float n5;
		cin >> n5;
		printf("Nota do exame: %.1f\n", n5);
		float media2 = (media+n5) / 2;
		if(media2 >= 5.0) {
			printf("Aluno aprovado.\n");
		} else {
			printf("Aluno reprovado.\n");
		}
		printf("Media final: %.1f\n", media2);
	}
	
	return 0;
}
