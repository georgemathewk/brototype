#include <stdio.h>
#include <stdlib.h>

int main(){
	int n,sum=0;
	
	printf("Enter a number: ");
	scanf("%d", &n);

	for(int i=1;i<=n;i++){
		if(i % 2 != 0){
			sum = sum + i;
		}
	}
	printf("Sum of all odd numbers upto %d : %d\n", n, sum);

	return EXIT_SUCCESS;
}
