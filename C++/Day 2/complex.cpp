#include<iostream>
using namespace std;
class Complex{
int real,img;
public:
Complex();
Complex(int,int);
void display() const;
void setReal(int);
int getReal() const;
};
void Complex:: setReal(int r)
{
    real=r;
}
int Complex::getReal() const
{
    return real;
}
Complex::Complex()
{
    cout<<"in default constructor\n";
    real=1;
    img=2;
}
Complex::Complex(int r,int i)
{
    cout<<"in para constructor\n";
    real=r;
    img=i;
}
void Complex::display() const{
    cout<<"Complex no.is "<<real<<"+"<<img<<"i"<<endl;
}
int main()
{
    const Complex c2(5,6);
    cout<<"real part\n"<<c2.getReal();
    Complex c3(3,2);
    c3.setReal(10);
    cout<<"real part\n"<<c3.getReal();
}
