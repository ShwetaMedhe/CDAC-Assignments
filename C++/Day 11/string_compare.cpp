#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[20];
   char str2[20];
   cout<<"enter 1st string\n";
   cin>>str1;
   cout<<"enter 2nd string\n";
   cin>>str2;
   int x=strcmp(str1,str2);
   if(x==1)
   cout<<"string 1 is greater than string2\n";
   if(x==-1)
   cout<<"string 2 is greater than string1\n";
    if(x==0)
   cout<<"string 1 is equal to string2\n";
   
}  