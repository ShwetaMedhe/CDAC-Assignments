#include<iostream>
using namespace std;
#include <cstring> 
class Account{
    public:
    int accno;
    char name[50];
    static float rateofInterest;
    Account(int accno1, const char* name1)
    {
        accno=accno1;
        strcpy(name,name1);
    }
    void display()
    {
        cout<<accno<<"  "<<name<<"  "<<rateofInterest<<endl;
    }
};
float Account::rateofInterest=6.5;
int main()
{
    Account a1=Account(101, "Rahul");  
    Account a2=Account(102, "Rohit");
    a1.display();
    a2.display();
    return 0;
}
