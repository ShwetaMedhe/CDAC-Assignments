#include<iostream>
using namespace std;
int main()
{
    int i,sum=0;
    int a[5],b[5];
    cout<<"Enter elements of array ";
    for(i=0;i<=4;i++)
    {
       
        cin>>a[i];
    }
        
    for(i=0;i<=4;i++)
    {
        b[i]=a[i];
    }
    cout<<"Display copied elements";
    for(i=0;i<=4;i++)
    {
        cout<<b[i]<<"\t";
    }
    for(i=0;i<=4;i++)
    {
        sum=sum+b[i];
    }
    cout<<"Sum of elements is "<<b[i];
}