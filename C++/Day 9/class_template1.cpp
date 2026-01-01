#include <iostream>  
using namespace std;  
template<class T>  
class A   
{  
    public:  
    T num1 ;  
    T num2 ;  
	A(T x,T y) 
    {
		num1=x;
		num2=y;
	}          
    void add()  
    {  
        cout << "Addition of num1 and num2 : " << num1+num2<<endl;  
    }  
      
};  
  
int main()  
{  
    A<int> d(2,3);  
    d.add();  
    return 0;  
} 