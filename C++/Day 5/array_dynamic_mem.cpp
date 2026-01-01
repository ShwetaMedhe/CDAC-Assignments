#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter the total numbers of students\n";
    cin>>num;
    float*ptr;
    ptr =new float[num];
    cout<<"Enter the GPA of students\n";
    for(int i=0; i<num;i++){
        cout<<"student"<<i+1<<":";
        cin>>*(ptr+i);

    }
     cout<<"displaying GPA of students\n";
      for(int i=0; i<num;i++){
        cout<<"student "<<i+1<<":"<<*(ptr+i)<<"\n";
      }
      delete ptr;
      return 0;
    }