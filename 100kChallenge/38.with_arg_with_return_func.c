#include <stdio.h>
#include <stdlib.h>
int sum(int, int);

int main(){
	int n1, n2, s;
	printf("Enter 2 numbers: ");
	scanf("%d%d", &n1, &n2);
	s = sum(n1, n2);
	printf("Sum of 2 numbers: %d\n", s);
	
}

int sum(int n1, int n2){
	int sum;
	sum = n1 + n2;
	return sum;
}


