#include<iostream>
using namespace std;
int main()
{
    int i,j,row=5;
    int num=1;
    for(i=1;i<=row;i++)
    {
        for( int s=0;s<=row-i;s++)
        {
            cout<<" ";
        }
        int num=i;
        for(j=1;j<=2*i-1;j++)
        {
            cout<<num;
            if(j<i){
                num++;
            }
            else{
                num--;
            }
        }
        cout<<endl;
    }
}