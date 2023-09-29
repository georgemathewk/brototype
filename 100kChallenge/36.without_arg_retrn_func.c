#include <stdio.h>
#include <stdlib.h>
void sum();

int main(){
	sum();
	return EXIT_SUCCESS;
}

void sum(){
	int n1,n2,sum;

	printf("Enter two numbers:");
	scanf("%d%d", &n1, &n2);

	sum = n1 + n2;

	printf("Sum of two numbers : %d\n", sum);	
}
