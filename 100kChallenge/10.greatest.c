#include <stdio.h>
#include <stdlib.h>

int main(){
	int n1, n2;
	printf("Enter two numbers");
	scanf("%d%d",&n1, &n2);

	if(n1 > n2){
		printf("Greatest number is %d", n1);
	}else{
		printf("Greatest number is %d", n2);
	}
	return EXIT_SUCCESS;
}
