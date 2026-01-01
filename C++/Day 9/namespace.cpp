#include <iostream>
using namespace std;
// first name space
namespace first_space
{
	int a=10;
  void func()
  {
     cout << "Inside first_space" << endl;
  }
}
 
// second name space
namespace second_space
{
int a=100;
  void func()
  {
     cout << "Inside second_space" << endl;
  }
}
using namespace first_space;
int main ()
{
   // This calls function from first name space.
  func();
cout<<a;

  return 0;
}