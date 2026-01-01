#include <iostream>
using namespace std;
void show();
int main()
{
    show();
    show();
    return 0;
}
void show()
{
   static int x;
    cout<<x<<endl;
    x++;
}