#include <stdio.h>
int main(){
	char a[5];
	printf("Enter the string\t");
	scanf("%s",a);
	printf("%s\n", &a[0]);
	printf("%s\n", &a[1]);
	printf("%s\n", &a[2]);
    printf("%s\n", &a[3]);

}
