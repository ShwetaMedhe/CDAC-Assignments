#include<stdio.h>
int add(int,int)
int main()
{
	int a,b;
	printf("Enter value of a and b\n");
	scanf("%d%d",&a,&b);
	r=add(a,b);
	printf("Sum is %d",r);
	printf("end");
}
int add(int p, int q)
{
	int r=p+q;
	return r;
}
