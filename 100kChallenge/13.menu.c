#include <stdio.h>
#include <stdlib.h>

int main(){
	int choice;
	printf("1 for Porotta\n2 for Biriyani\n3 for Mandhi\n4 for Patthiri\n Enter your choice:");
	scanf("%d", &choice);
	switch(choice){
		case 1:
			printf("\nYour choice is Porotta\n");
			break;
		case 2:
			printf("\nYour choice is Biriyani\n");
			break;
		case 3:
			printf("\nYour choice is Mandhi\n");
			break;
		case 4:
			printf("\nYour choice is Pathiri\n");
			break;
		default:
			printf("\nIncorrect choice\n");
	
	}
	return EXIT_SUCCESS;
}
