#include<iostream>
using namespace std;
void add(int=1,int=2,int=3,int=4);
int main(){
    add();
    add(5);
    add(2,2);
    add(0,2,0);
    add(10,12,4,0);
}

void add(int a,int b,int c, int d){
    cout<<a+b+c+d<<endl;
}