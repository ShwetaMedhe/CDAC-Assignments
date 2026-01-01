#include <iostream>
#include <string>
using namespace std;

int main() {
    string str, reversedStr;
    cout << "Enter a string: ";
    cin >> str;

    for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr += str[i];
    }

    cout<< "Reversed string is:" <<reversedStr << endl;
    return 0;
}
 