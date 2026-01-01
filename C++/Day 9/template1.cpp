#include<iostream>
using namespace std;
template <class T>
void swap1(T &x, T &y)
{
   T temp;
   temp=x;
   x=y;
   y=temp;
}
 int main()
{
    
    int a=10,b=20;
char x='A',y='B';
    swap1(a,b);
	cout<<a<<b<<endl;
swap1(x,y);
cout<<x<<y;

}