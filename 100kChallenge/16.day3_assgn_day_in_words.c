#include <stdio.h>
#include <stdlib.h>

int main(){
	int day;

	printf("Your Day number: ");
	scanf("%d", &day);

	switch(day){
		case 1:
			printf("Day: Sunday");
			break;
		case 2:
			printf("Day: Monday");
			break;

		case 3:
			printf("Day: Tuesday");
			break;

		case 4:
			printf("Day: Wednesday");
			break;

		case 5:
			printf("Day: Thursday");
			break;

		case 6:
			printf("Day: Friday");
			break;

		case 7:
			printf("Day: Saturday");
			break;
	}

	printf("\n");


	return  EXIT_SUCCESS;
}
