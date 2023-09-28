#include <stdio.h>
#include <stdlib.h>

int main(){
	int a[5],temp;
	printf("Enter 5 numbers: ");
	for(int i=0;i<5;i++){
		scanf("%d", &a[i]);
	}

	for(int i=0; i < 5; i++){
		for(int j=i+1; j < 5; j++){
			if(a[i] < a[j]) {
				continue;
			}else{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;		
			}
		}
	}

	printf("Sorted array: ");
	for(int i=0; i < 5; i++){
		printf("%d ", a[i]);
	}

	return EXIT_SUCCESS;
}
