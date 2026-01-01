#include <iostream>
using namespace std;
int main()
{
    int i,j,row =6;
    
    for(i = 0; i<row;i++){
        for (int s = 0; s <=row -i-1; s++) {
            cout<<" ";
        }
        int num = 1;
            for(j=0;j <=i;j++){
                cout << num<<" ";
                num = num * (i - j) / (j + 1);
            }
           cout<<endl;
    }
}