#include <stdio.h>
#include <stdlib.h>

int main(){
	int n1, n2, sum;

	printf("Enter two numbers: ");
	scanf("%d%d", &n1, &n2);
	sum = n1 + n2;
	printf("Sum of %d & %d is %d :", n1, n2, sum );

	return EXIT_SUCCESS;
}
