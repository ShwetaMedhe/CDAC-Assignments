#include <iostream>
using namespace std;

int main() {
   
    int a = 10, b = 20;
   

    // if-else
    cout << "\n if-else:" << endl;
    if (a > b) {
        cout << a << " is greater than " << b << endl;
    } else {
        cout << b << " is greater than " << a << endl;
    }

    // switch-case
    cout << "\n switch-case:" << endl;
    int choice = 2;
    switch (choice) {
        case 1:
            cout << "You chose option 1" << endl;
            break;
        case 2:
            cout << "You chose option 2" << endl;
            break;
        default:
            cout << "Invalid choice" << endl;
    }

    // for loop
    cout << "\n for loop:" << endl;
    for (int i = 1; i <= 5; i++) {
        cout << "Iteration " << i << endl;
    }

    // while loop
    cout << "\n while loop:" << endl;
    int count = 1;
    while (count <= 3) {
        cout << "Count: " << count << endl;
        count++;
    }

    // do-while loop
    cout << "\ndo-while loop:" << endl;
    int num = 1;
    do {
        cout << "Number: " << num << endl;
        num++;
    } while (num <= 3);


    
    return 0;
}
