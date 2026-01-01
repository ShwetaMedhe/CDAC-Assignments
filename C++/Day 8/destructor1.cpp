#include <iostream>
using namespace std;
     
class Test {
	private:
		static int cnt1;
		static int cnt2;
public:
 static int getcnt1()
 {
 	return cnt1;
 }
 
    Test()
    { 
    cnt1++;
       cout<<this<<endl;
       cout<<"constructor is called\n";
    }
     ~Test()
    {
    	
       cout<<"destructor is called"<<++cnt2<<endl;; 
	   cout<<this<<endl; 
    }
};
int Test ::cnt1=0;
int Test::cnt2=0;
int main()
{
    Test t;
    cout<<&t<<endl;
	  Test t1;
    cout<<&t1<<endl;
   cout<<"no of cons called"<< Test::getcnt1()<<endl;
}

