#include<stdio.h>
int main(){
  int a[6]={1,2,3,4,5,6};
  int*b=(a+4);
  int*c=(4+a);
  if(b==c){
  	printf("both pointer pointing to same location\n");
  	if(*b=*c){
  		printf("both pointers holding same value\n");
  		if((*a+4)==*b)
  		printf("both pointers holding same value\n");
	  }
  }
}
