#include<iostream>
using namespace std;

class Cdate{
    int dd,mm,yy;
    public:
    void accept();
    void display();
    void setDd(int);
    int getMm();
};

void Cdate::accept()
{

    cout<<"Enter Date, Month and Year\n";
    cin>>dd>>mm>>yy;
}

void Cdate::display(){
    cout<<"Date is: "<<dd<<"/"<<mm <<"/"<<yy<<endl;


}
void Cdate::setDd(int d)
{
    dd=d;

}
int Cdate::getMm(){
    return mm;

}
int main()
{
    Cdate d1;
    d1.display();
    d1.accept();
    d1.setDd(22);
    d1.display();
    cout<<"MONTH IS "<<d1.getMm();
} 