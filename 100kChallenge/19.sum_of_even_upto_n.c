#include <stdio.h>
#include <stdlib.h>

int main(){
	int n, sum=0,i;
	printf("Enter a number: ");
	scanf("%d", &n);

	for(i=1; i <= n; i++){
		if(i%2 ==0){
			sum = sum + i;
		}
	}

	printf("Sum of even numbers from 1 to %d : %d\n", n, sum); 

	return EXIT_SUCCESS;
}
