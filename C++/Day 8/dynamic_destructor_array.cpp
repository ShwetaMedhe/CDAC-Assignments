#include<iostream>
using namespace std;
class Student
{
	int rollno;
	char name[20];
	public:
		void accept()
		{
			cin>>rollno;
			cin>>name;
		}
		void display()
		{
			cout<<"rollno is \t"<<rollno<<"name is \t"<<name<<endl;
			
		}
		~Student()
		{
			cout<<"destructor is called\n";
		}
	
};
  
  int main()
  {
  	int n,i;
  	cout<<"enter no of students\n";
  	cin>>n;
  Student* ptr	=new Student[n];
  cout<<"accept details\n";
  for(i=0;i<n;i++)
   ptr[i].accept(); 
   cout<<"display details\n";
  for(i=0;i<n;i++)
   (ptr+i)->display();
delete [] ptr;
}