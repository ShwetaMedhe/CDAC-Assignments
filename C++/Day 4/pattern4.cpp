#include<iostream>
using namespace std;
int main(){
    int i,j, row=5;
    char ch='A';
    for(i=0;i<row;i++){
        for(j=0;j<=i;j++){
            cout<<ch;
        }
        cout<<endl;
        ch++;
    
    }

}