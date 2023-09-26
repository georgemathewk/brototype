#include <stdio.h>
#include <stdlib.h>

int main(){
	int n1;
	float n2, sum;

	printf("Enter two numbers :");
	scanf("%d%f", &n1, &n2);
	sum = n1 + n2;
	printf("Sum:%f",sum); 

	return EXIT_SUCCESS;
}
