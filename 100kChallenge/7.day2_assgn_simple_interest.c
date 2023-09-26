#include <stdio.h>
#include <stdlib.h>

int main(){
	int principal;
	float interest, years, simpleInterest;

	printf("Enter Principal Amount :");
	scanf("%d", &principal);

	printf("Enter Interest Rate :");
	scanf("%f", &interest);

	printf("Enter Years :");
	scanf("%f", &years);

	simpleInterest = (principal*interest*years)/100;


	printf("Simple Interest:%f",simpleInterest); 

	return EXIT_SUCCESS;
}
