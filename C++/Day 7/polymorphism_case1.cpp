#include <iostream>
using namespace std;

class employee{
    int id;
    public:
    employee();
    employee(int );

    void display();
    int findsalary()
    {
        return 0;
    }
    };
    employee::employee(){
        cout<<"in default emp\n";
        id=0;
    }
    employee::employee(int i){
        cout<<"in parameterised emp\n";
        id=1;
    }
    void employee::display(){
        cout<<"id of an emp\n"<<id<<endl;
    }
    
    class wageemployee:public employee{
        int hrs,rate;
        public:
        wageemployee();
        wageemployee(int,int,int);
        void display();
        int findsalary();
    };
    wageemployee::wageemployee(){
        cout<<"in default emp\n";
        hrs=0;
        rate=0;

    }
    wageemployee::wageemployee(int i,int h, int r) : employee(i){
        cout<<"in parameterised emp\n";
        hrs=h;
        rate=r;
}
int wageemployee::findsalary(){
    return hrs * rate;

}
void wageemployee::display(){
    employee::display();
    cout<<hrs<<endl;
    cout<<rate<<endl;

}

int main(){
    employee * ptr;
    wageemployee we1(334,7,29);
    ptr = &we1;
	cout<<"salary is "<<ptr->findsalary();
    ptr->display();
}



