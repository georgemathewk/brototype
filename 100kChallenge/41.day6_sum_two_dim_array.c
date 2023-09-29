#include <stdio.h>
#include <stdlib.h>
void showSum(int[3][3],int[3][3]);

int main(){
	int arr1[3][3], arr2[3][3];

	printf("Enter 9 numbers to first array:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			scanf("%d", &arr1[i][j]);
		}
	}

	printf("Enter 9 numbers to second array:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			scanf("%d", &arr2[i][j]);
		}
	}

	showSum(arr1, arr2);



	return EXIT_SUCCESS;
}
	

void showSum(int arr1[3][3], int arr2[3][3]){
	int sum[3][3];
	printf("\nSum of the two arrays :\n");
	for(int i=0; i<3; i++){
		for(int j=0; j<3;j++){
			sum[i][j] = arr1[i][j] + arr2[i][j];
			printf("%d ", sum[i][j]);
		}
		printf("\n");
	}
}
