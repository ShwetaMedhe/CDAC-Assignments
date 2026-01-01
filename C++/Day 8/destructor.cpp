#include<iostream>
using namespace std;
static int count=0;
class test
{
    public:
    test()
    {
        count++;
        cout<<"No of objects created "<<count<<endl;
    }

    ~test()
    {
         cout<<"No of objects destroyed "<<count<<endl;
        count--;
       
    }
};
int main()
{
    test t, t1,t2,t3;
}