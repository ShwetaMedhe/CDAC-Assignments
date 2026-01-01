#include<iostream>
using namespace std;
void display(char='*',int=30);
int main(){
    int count=80;
    cout<<"no arguments passed";
    display();
    cout<<"first argument passed";
    display('#');
    cout<<"both arguments passed";
    display('$',count);
    return 0;
}

void display(char c, int count){
    for(int i=1; i<=count; i++){
        cout<<c;

    }
    cout<<endl;
}
