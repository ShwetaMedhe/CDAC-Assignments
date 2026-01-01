#include<iostream>
using namespace std;
int main()
{
    int* a;
    float* b;
    a=new int;
    b=new float;

    *a=50;
    *b=45.5f;
    cout<<*a<<endl;
    cout<<*b<<endl;

    int* p=new int(55);
    cout<< *p;

    delete a;
    delete b;
    delete p;
}
