#include<iostream>
using namespace std;
class complex
{
	int real,img;

public:
	complex();
	complex(int,int);
	void display();
	complex operator+(complex&);
	complex operator-(complex&);
	complex operator-();
};
complex::complex()
{
	real=img=0;
}
complex::complex(int real,int img)
{
	this->real=real;
	this->img=img;
}
void complex::display()
{
	if(img>0)
	cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
	else
		cout<<"complex number is "<<real<<img<<"i"<<endl;

}
complex complex::operator+(complex & c2_new)
{
	complex temp;
	temp.real=this->real+c2_new.real;
	temp.img=img + c2_new.img;
	return temp;
}
complex complex::operator-(complex & c2_new)
{
	complex temp;
	temp.real=this->real-c2_new.real;
	temp.img=img - c2_new.img;
	return temp;
}
complex complex::operator-()
{
	complex temp;
temp.real=	-this->real;
temp.img=	-this->img;
return temp;
	
}
int main()
{
	complex c1(1,2);
	complex c2(3,4);
	complex c3=c1+c2;
	c3.display();
	complex c4=c1-c2;
	c4.display();
	complex c5=-c1;
	c5.display();
	
	}



