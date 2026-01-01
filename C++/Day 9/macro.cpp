#include<iostream>
using namespace std;
#define MAXIMUM(a,b) (a>b)?a:b
int main()
{
    cout<<"Max (80,100):";
    int k=MAXIMUM(80,100);
    cout<<k<<endl;
    cout<<"Max (20,50):";
    int k1=MAXIMUM(20,50);
    cout<<k1<<endl;
    return 0;
}