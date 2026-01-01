#include <iostream>
using namespace std;
int main()
{
    int i,j,row =4;
    int column=9;
    for(i = 0; i<=row;i++){
        for(int s = 0; s < i; s++) {
            cout << " ";
        }
            for(j=0;j< column;j++){
                cout<<"*";
            
            }
        
        column --;
        column --;
        cout<<endl;
        
        
    } 

    
}