#include <stdio.h>
#include <stdlib.h>
void getData(int[5]);
void displayData(int[5]);

int main(){
	int a[5];
	getData(a);
	displayData(a);
}

void getData(int a[5]){
	printf("Enter 5 numbers: ");
	for(int i=0; i<5; i++){
		scanf("%d", &a[i]);
	}
}

void displayData(int a[5]){
	printf("Entered values: ");
	for(int i=0; i<5; i++){
		printf("%d ", a[i]);
	}
	printf("\n");
}
