#include <stdio.h>
#include <stdlib.h>
void sum(int,int);

int main(){
	int n1, n2;

	printf("Enter 2 numbers: ");
	scanf("%d%d", &n1, &n2);

	sum(n1,n2);
	return EXIT_SUCCESS;

}

void sum(int n1, int n2){
	int sum;
	sum = n1 + n2;
	printf("Sum: %d\n" , sum);
}

