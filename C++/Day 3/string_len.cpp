#include <iostream>
using namespace std;
#include <string.h>

int main(){
    char str[]="Hello World";
    int len=strlen(str);
    cout<<"Length of string is:"<<endl;
    cout<<"sized of string is:"<<sizeof(str)<<endl;

    char str1[]="Hello\0 world";
    cout<<str<<endl;
    cout<<str1<<endl;
    cout<<"sized of string is:"<<sizeof(str1)<<endl;
    cout<<strlen(str1)<<endl;



}