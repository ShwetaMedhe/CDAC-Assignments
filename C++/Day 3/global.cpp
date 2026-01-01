#include <iostream>
using namespace std;
void show();
int y=10;
int main(){
    cout<<y<<endl; //10
    y++; 
    show();
    cout<<y<<endl; //11
}
void show(){
    cout<<y<<endl; 
    y=0;

    cout<<y<<endl;
    y++;
    cout<<y<<endl;
}