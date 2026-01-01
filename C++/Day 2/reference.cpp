#include<iostream>
using namespace std;
void swap(int &, int &);
int main()
{
    
    int a=10, b=20;
    cout<<"before swapping\n";
    cout<<"a="<<a <<"\t"<<"b="<<b;
    
}
void swap(int &p, int &q){
    int *temp;
    *temp=p;
    p=q;
    q=*temp;
    cout<<"\n in after swapping in swap()\n";
    cout<<"p="<<p<<"\t"<<"q="<<q;
}