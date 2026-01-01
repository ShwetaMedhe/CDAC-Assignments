#include<iostream>
using namespace std;

class student {
public:
    int rollno, mark;
    int dd, mm, yy;

    void inputRollNo() {
        cout << "Enter Roll no: ";
        cin >> rollno;
    }

    void inputDOB() {
        cout << "Enter Date of birth (dd mm yyyy): ";
        cin >> dd >> mm >> yy;
    }

    void inputMarks() {
        cout << "Enter marks: ";
        cin >> mark;
    }

    void display() {
        cout << "Roll no is: " << rollno << endl;
        cout << "Date of birth is: " << dd << "/" << mm << "/" << yy << endl;
        cout << "Marks are: " << mark << endl << endl;
    }
};

int main() {
    student s[5];

    // Input data
    for (int i = 0; i < 5; i++) {
        cout << "Enter student data for student " << i + 1 << ":" << endl;
        s[i].inputRollNo();
        s[i].inputDOB();
        s[i].inputMarks();
    }

    // Sort by roll number
    for (int i = 0; i < 5; i++) {
        for (int j = i + 1; j < 5; j++) {
            if (s[i].rollno > s[j].rollno) {
                swap(s[i], s[j]);
            }
        }
    }

    // Display sorted data
    cout << "\nSorted student data by Roll No:\n";
    for (int i = 0; i < 5; i++) {
        s[i].display();
    }

    return 0;
}