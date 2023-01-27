/* SECOND PROGRAMMING EXERCISE */
/* SUBMITTED BY: ANDREI N. CAPILI (BSCPE 1-1 - PUP BC) */
/* C++ ACTIVITY */ 

#include <iostream>
#include <iomanip>

using namespace std;
    string greetUser (){
        string userName;
        cout<<"Hi! What's your name?:";
        cin>>userName;
        cout<<"Greetings! " + userName + ", This program will help you calculate your BMI (Body Mass Index)."<<endl;
        cout<<"All you need to do is provide the necessary information below."<<endl;
        return userName;
    }
    double calcBMI (double w, double h) {
        double bmi;
        bmi = w*703/(h*h);
        return bmi;
    }
    string getClass (double bmi) {
        if (bmi < 18.5) {
            return " your BMI class is UNDERWEIGHT";
        } else if (bmi >= 18.5 && bmi <=24.9) {
            return " your BMI class is NORMAL";
        }else if (bmi >= 25 && bmi <= 29.9) {
            return " your BMI class is OVERWEIGHT";
        }else {
            return " your BMI class is OBESE";
        }
    }
    int main () { 
        string userName;
        double weight, height;
        double bmi;
        string bmiClass;

        userName = greetUser();
        cout<<"Please enter your WEIGHT in POUNDS (lbs): ";
        cin>>weight;
        cout<<"Please enter your HEIGHT in INCHES (in): ";
        cin>>height;
        bmi = calcBMI(weight, height);
        bmiClass = getClass (bmi);
        
        cout<<fixed<<setprecision(1);
        cout<<"Here's your result "<<userName<<","<<endl;
        cout<<"Your BMI is: "<<bmi<<" and"<<bmiClass;
    return 0;
    }
    
    