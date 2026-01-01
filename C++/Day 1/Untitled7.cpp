#include<stdio.h>
int main(){
	int a[5],i;
	printf("Enter elements");
	for(i=0;i<=4;i++){
		scanf("%d",(a+i));
		*(a+i)=a[i]*a[i];
		printf("%d\t",*(a+i));
	}
}
