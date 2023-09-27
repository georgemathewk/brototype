#include <stdio.h>
#include <stdlib.h>

int main(){
	int n, sum=0;
	printf("Enter a number: ");
	scanf("%d", &n);

	for(int i=0;i<=n;i++){
		sum=sum+i;	
	}

	printf("Sum for numbers from 1 to %d : %d\n", n, sum);

	return EXIT_SUCCESS;
}
