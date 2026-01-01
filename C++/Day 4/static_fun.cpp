#include<iostream>
using namespace std;
class Complex
{
    public:
    static int cnt;
};
int Complex::cnt=5;
int main()
{
    cout<<Complex::cnt;
}