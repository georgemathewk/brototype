#include <stdio.h>
#include <stdlib.h>

int main(){
	int n1, n2, n3;
	
	printf("Enter three numbers");
	scanf("%d%d%d", &n1, &n2, &n3);

	if(n1 > n2) {
		if(n1 > n3){
			printf("Greatest number is %d", n1);
		}else{
			printf("Greatest number is %d", n3);
		}
	}else{
		if(n2 > n3){
			printf("Greatest number is %d", n2);
		}else{
			printf("Greatest number is %d", n3);
		}
	}

	return EXIT_SUCCESS;
}
