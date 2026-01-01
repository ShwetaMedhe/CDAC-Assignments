#include<iostream>
using namespace std;
int main()
{
    int i,j,row=5;
    char ch='A';
    for(i=1;i<=row;i++)
    {
        for(int s=1;s<=row-i;s++)
        {
            cout<<" ";

        }
        for(j=1;j<=2*i-1;j++)
        {
            cout<<ch;
            ch++;
        }
        ch='A';
        cout<<endl;
    }
}