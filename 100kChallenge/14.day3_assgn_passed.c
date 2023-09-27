#include <stdio.h>
#include <stdlib.h>

int main(){
	int mark;
	printf("Enter your mark:");
	scanf("%d", &mark);

	if(mark >=50){
		printf("\nPassed\n");
	}else{
		printf("\nFailed\n");
	}
	return EXIT_SUCCESS;
}
