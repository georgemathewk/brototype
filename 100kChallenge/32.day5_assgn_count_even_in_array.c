#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[5];
	int count = 0;
	printf("Enter 5 numbers: ");
	for(int i=0; i<5; i++){
		scanf("%d", &a[i]);
	}	

	for(int i=0; i<5; i++){
		if(a[i]%2 == 0){
			count++;
		}
	}

	printf("Number of even in the above users list : %d\n", count);

	return EXIT_SUCCESS;
}
