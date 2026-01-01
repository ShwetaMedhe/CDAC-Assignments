#include<iostream>
using namespace std;

int main(){
    void swap(int*,int*);
    int a=10,b=20;
    cout<<"before swapping\n";
    cout<<"a="<<a<<"\t"<<"b="<<b;
    swap(&a,&b);
    cout<<"\n After swapping in main()";
    cout<<"a="<<a<<"\t"<<"b="<<b;
    
};

void swap(int*p,int*q) 
{
    int temp;
    temp=*p;
    *p=*q;
    *q=temp;
    cout<<"\n in Swap function()";
    cout<<"*p="<<*p<<"\t"<<"*q="<<*q;
}
