#include <stdio.h>
#include <stdlib.h>

int main(){
	float n1, n2, n3, avg;

	printf("Enter three numbers : ");
	scanf("%f %f %f", &n1, &n2, &n3);
	avg = ( n1 + n2 + n3 ) / 3;
	printf("Average : %f", avg);

	return EXIT_SUCCESS;

}
