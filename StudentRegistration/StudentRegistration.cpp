// StudentRegistration.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

int main()
{
    //Display the welcome 
    cout << "Registration Form\n" << endl;

    //Enter first name and store
    string first_name;
    cout << "First name: ";
    cin >> first_name;

    //Enter last name and store
    string last_name;
    cout << "Last name: ";
    cin >> last_name;

    //Enter birth year and store
    int birth_year;
    cout << "Birth year: ";
    cin >> birth_year;

    //Take stored information and print to console
    cout << "\nWelcome " << first_name << "!" << endl;
    cout << "Your registration is complete." << endl;
    cout << "Name: " + first_name + ' ' + last_name << endl;
    cout << "Temporary password: " << first_name << "*" << birth_year << endl;
}