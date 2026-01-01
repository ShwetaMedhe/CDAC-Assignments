#include <iostream>
using namespace std;
 class Parent
{   
    protected:
    int id_protected;
  };
class Child : public Parent
{
    public:
    void setId(int id)
    { 
        
             id_protected = id;
      }
       void displayId()
    {
        cout << "id_protected is: " << id_protected << endl;
    }
};
 int main() {
     
    Child obj1;
  
  obj1.setId(81);
    obj1.displayId();

}