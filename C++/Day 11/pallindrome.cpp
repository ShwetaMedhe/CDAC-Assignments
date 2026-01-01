#include<iostream>

using namespace std;

bool isPalindrome(int num) {

int original = num;
int reversed = 0;

 while (num > 0) {
 int digit = num % 10;
 reversed = reversed * 10 + digit;
num /= 10;

 }
 return original == reversed;

}

int main() {
int num;

cout << "Enter a number: ";

cin >> num;

bool result = isPalindrome(num);

 if (result) {

 cout << num << " is a palindrome." << endl;

 } else {

 cout << num << " is not a palindrome." << endl;

 }

 return 0;

}