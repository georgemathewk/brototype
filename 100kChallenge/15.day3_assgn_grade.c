#include <stdio.h>
#include <stdlib.h>

int main(){
	int p;
	char grade;

	printf("Enter Percentage: ");
	scanf("%d", &p);

	if(p >= 90)
		grade = 'A';
	else if(p >= 80)
		grade = 'B';
	else if(p >= 70)
		grade = 'C';
	else if(p >= 60)
		grade = 'D';
	else if(p >= 50)
		grade = 'E';
	else 
		grade = 'F';

	if(grade == 'F')
		printf("Grade: Failed\n");
	else
		printf("Grade: %c\n", grade);

	return EXIT_SUCCESS;
}
