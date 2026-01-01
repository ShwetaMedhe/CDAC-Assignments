#include<stdio.h>
int main(){
int a=5, b=2;
int c=a!=b?a++ : b++;
printf("%d%d%d",a,b,c);
}
