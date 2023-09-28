#include <stdio.h>
#include <stdlib.h>

int main(){
	int limit,a[100], search,flag=0;

	printf("Enter limit: ");
	scanf("%d", &limit);

	printf("Enter %d numbers: ", limit);
	for(int i=0; i<limit; i++){
		scanf("%d", &a[i]);
	}

	printf("Enter Search Number: ");
	scanf("%d", &search);

	for(int i=0; i<limit; i++){
		if(a[i] == search){
			flag = 1;
			printf("%d is at the position %d\n", search, i+1);
			break;
		}
	}

	if(flag == 0)
		printf("Search number %d is not found\n", search);

	return EXIT_SUCCESS;

}
