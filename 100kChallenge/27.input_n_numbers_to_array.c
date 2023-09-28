#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[1000], limit;

	printf("Enter array limit: ");
	scanf("%d", &limit);

	printf("Enter %d numbers : ", limit);

	for(int i=0;i<limit;i++){
		scanf("%d", &a[i]);
	}

	printf("Entered Values are : ");
	for(int i=0;i<limit;i++){
		printf("%d ", a[i]);
	}
	printf("\n");

	return EXIT_SUCCESS;
}
