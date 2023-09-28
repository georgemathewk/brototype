#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[5];
	printf("Enter 5 numbers : ");

	for(int i=0;i<5;i++){
		scanf("%d", &a[i]);
	}

	printf("Entered Values are : ");
	for(int i=0;i<5;i++){
		printf("%d ", a[i]);
	}
	printf("\n");

	return EXIT_SUCCESS;
}
