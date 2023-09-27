#include <stdio.h>
#include <stdlib.h>

int main(){
	int choice;
	float n1, n2;

	printf("Enter two numbers:");
	scanf("%f%f", &n1, &n2);

	printf("1 for addition\n2 for subtraction\n3 for Multiplication\n4 for Division\n Enter your choice: ");
	scanf("%d", &choice);

	if(choice==1){
		printf("Sum : %f", n1+n2);
	}else if(choice==2){
		printf("Subtraction : %f", n1-n2);
	}else if(choice==3){
		printf("Multiplication: %f", n1*n2);
	}else if(choice==4){
		printf("Division : %f", n1/n2);
	}else{
		printf("Incorrect choice");
	}
	return EXIT_SUCCESS;
}
