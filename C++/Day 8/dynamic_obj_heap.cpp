#include<iostream>
using namespace std;

class cdate{
    int dd,mm,yy;
    public:
     cdate(){
        dd=mm=yy=0;
     }
     cdate(int d,int m,int y){
        dd=d;
        mm=m;
        yy=y;
     
     }
     void show(){
        cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
     }


};
int main(){
    cdate*ptr1=new cdate(1,9,25);
    ptr1->show();
	delete ptr1;

}
    