#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isPalindrome(char[]);

int main(){
	char str[100];
	bool result;
	printf("Enter a string: ");
	scanf("%s", str);
	result = isPalindrome(str);
	if(result==true){
		printf("%s is palindrome", str);
	}else{
		printf("%s is not palindrome", str);
	}

	printf("\n");
	return EXIT_SUCCESS;
}

bool isPalindrome(char str[]){
	bool flag = true;
	int  len = strlen(str);
	int lastIndex = len - 1;
	for(int i=0;i<len/2;i++){
		printf("%d => %c %c\n", i, str[i], str[lastIndex-i]);
		if(str[i] !=  str[lastIndex-i] ){
			flag = false;
			break;
		}
	}
	return flag;
}
