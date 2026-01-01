#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    char str1[20]="Hello";
    char str2[50]="Bye";
    strcat(str1, str2);
    cout<<str1;
}