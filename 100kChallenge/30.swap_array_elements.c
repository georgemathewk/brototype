#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[5], b[5], temp;

	printf("Enter 5 elements to first array: ");
	for(int i=0; i<5; i++ ) {
		scanf("%d", &a[i]);
	}

	printf("Enter 5 elements to second array: ");
	for(int i=0; i<5; i++ ) {
		scanf("%d", &b[i]);
	}

	for(int i=0; i<5; i++){
		temp = a[i];
		a[i] = b[i];
		b[i] = temp;
	}

	printf("Elements in first array after sorting : ");
	for(int i=0; i<5; i++){
		printf("%d ", a[i]);
	}

	printf("\nElements in second array after sorting : ");
	for(int i=0; i<5; i++){
		printf("%d ", b[i]);
	}

	printf("\n");

	return EXIT_SUCCESS;
}
