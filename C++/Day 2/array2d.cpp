#include<iostream>
using namespace std;
int main(){
    int a[3][3];
    int i,j;
    cout<<"accept elements of an array\n";
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++){
            cin>>*(*(a+i)+j);
        }
    }
    cout<<"display elements of an array\n";
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++){
            cout<<*(*(a+i)+j)<<"\t";

        }
        cout<<endl;
    }
    }