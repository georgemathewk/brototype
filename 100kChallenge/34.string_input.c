#include <stdio.h>
#include <stdlib.h>

int main(){
	char name[10];
	printf("Enter your Name: ");
	scanf("%s", name);

	printf("Hai %s\n", name);
	return EXIT_SUCCESS;
}
