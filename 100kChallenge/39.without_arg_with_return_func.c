#include <stdio.h>
#include <stdlib.h>

int sum();

int main(){
	int result;
	result = sum();

	printf("Sum of 2 numbers: %d\n", result);

	return EXIT_SUCCESS;
}

int sum(){
	int n1, n2;
	printf("Enter 2 numbers: ");
	scanf("%d%d", &n1, &n2);

	return n1 + n2;
}
