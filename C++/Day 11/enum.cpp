#include<iostream>
using namespace std;

enum year { 
    Jan=1, 
    Feb, 
    Mar, 
    Apr, 
    May, 
    Jun, 
    Jul, 
    Aug, 
    Sep, 
    Oct, 
    Nov, 
    Dec 
}; 
  int main() 
{ 
    int i; 
  
    // Traversing the year enum 
    for (i = Jan; i <= Dec; i++) 
        cout << i << " "; 
  
    return 0; 
}