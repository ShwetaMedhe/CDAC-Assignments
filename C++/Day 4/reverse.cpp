#include<iostream>
using namespace std;
void reverseString(char* str)
{
    char* start = str;
    char*end = str;
    
    while(*end!=0)
    {
        end++;
    }

    end--;

    while (start<end)
{
    char temp=*start;
    *start = *end;
    *end = temp;

    start++;
    end--;
}

}

int main()
{
    char str[]="Hello World";
    cout<<"Original String is "<<str<<endl;
    reverseString(str);
    cout<<"Reverse String is "<<str<<endl;
    return 0;
}

