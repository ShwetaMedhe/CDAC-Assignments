#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[20];
   char str2[20];
   cout<<"enter 1st string\n";
   cin>>str1;
   strcpy(str2,str1);
   strrev(str1);
   if(strcmp(str1,str2))
   cout<<"string is not palindrome";
   else
   cout<<" string is palindrome";

}  