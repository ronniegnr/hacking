#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	int x, y;
	cin >> x >> y;
	double prices[] = {4, 4.50, 5, 2, 1.5};
	printf("Total: R$ %.2f\n", prices[x-1]*y);
	
	return 0;
}
