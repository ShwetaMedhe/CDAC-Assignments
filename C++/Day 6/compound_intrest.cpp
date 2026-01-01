#include <iostream>
using namespace std;

int main() {
    double principal, rate, time, compoundInterest, amount = 1;

    cout << "Enter the principal amount: ";
    cin >> principal;
    cout << "Enter the annual interest rate: ";
    cin >> rate;
    cout << "Enter the time: ";
    cin >> time;
 
    rate = rate / 100;

 
    for (int i = 0; i < time; i++) {
        amount *= (1 + rate);
    }

    compoundInterest = principal * amount - principal;

    cout << "Compound Interest: " << compoundInterest << endl;
    cout << "Total Amount: " << principal * amount << endl;

    return 0;
}
