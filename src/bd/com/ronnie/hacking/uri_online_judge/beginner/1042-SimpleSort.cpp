#include<iostream>
#include<stdio.h>
#include<algorithm>

using namespace std;

int main() {
	int array[3];
	cin >> array[0] >> array[1] >> array[2];

	int array2[3];
	
	copy(array, array+3, array2);
	sort(array, array+3);
	
	for(int i=0; i<3; i++) {
		printf("%d\n", array[i]);
	}
	printf("\n");
	for(int i=0; i<3; i++) {
		printf("%d\n", array2[i]);
	}
	
	return 0;
}
