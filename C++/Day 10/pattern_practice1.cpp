#include<iostream>
using namespace std;

int main(){
    int i,j;
    char ch='a'+i;
    for(int i=0; i<=5;i++){
        for(int j=0; j<=i; j++)
        {
            cout<<ch<<" ";
            
        }
        cout<<ch++;
        cout<<"\n";
    }
}