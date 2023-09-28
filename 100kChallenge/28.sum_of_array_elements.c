#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[5],sum=0;

	printf("Enter 5 numbers: ");
	for(int i=0;i<5;i++){
		scanf("%d", &a[i]);
	}

	for(int i=0;i<5;i++){
		sum = sum + a[i];
	}

	printf("Sum of all 5 numbers: %d\n", sum);

	return EXIT_SUCCESS;
}
