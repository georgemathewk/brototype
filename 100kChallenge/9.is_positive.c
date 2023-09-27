#include <stdio.h>
#include <stdlib.h>

int main() {
	int num;
	printf("Enter a number");
	scanf("%d", &num);

	if(num<0){
		printf("Entered number is negative");
	}else{
		printf("Entered number is positive");
	}
	return EXIT_SUCCESS;
}
