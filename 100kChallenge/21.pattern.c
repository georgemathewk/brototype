#include <stdio.h>
#include <stdlib.h>

int main(){
	int n;
	printf("Enter a number: ");
	scanf("%d", &n);

	for(int i=0;i<=n;i++){
		for(int j=0;j<i;j++){
			printf("* ");
		}
		printf("\n");
	}


	return EXIT_SUCCESS;
}
