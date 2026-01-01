#include<iostream>
using namespace std;
class temp
{
	int *ptr;
	int size;
public:
	temp();
	void get();
	void show();
	int max();
	int min();
};
temp::temp()
{
	cout<<"how many elements do u want to store\n";
	cin>>size;
	ptr=new int[size];
}
void temp::get()
{
	cout<<"accept elements\n";
	for(int i=0;i<size;i++)
	cin>>ptr[i];
}
void temp::show()
{
	cout<<"value are\n";
	for(int i=0;i<size;i++)
	cout<<ptr[i]<<"\n";
}
int temp::max()
{
	int m=ptr[0];
	for(int i=1;i<size;i++)
	if(ptr[i]>m)
	m=ptr[i];
	return m;
}
int temp::min()
{
	int m=ptr[0];
	for(int i=1;i<size;i++)
	if(ptr[i]<m)
	m=ptr[i];
	return m;
}
int main()
{
	temp a;
	a.get();
	a.show();
	cout<<"maximum number is "<<a.max()<<endl;
	cout<<"minimum number is "<<a.min()<<endl;
}