#include<iostream>
using namespace std;
int main(){

    
   for (int i = 1; i <= 5; ++i) {
        for (int j = 1; j <= 2*5-1; ++j) { // 2+2n-1=2n-1 where n is level and +2 is for 2 stars 2n-1 is spaces
            if (j == 5 - (i - 1) || j == 5 + (i - 1) || i == 5) { // left side right side and for base i==5 
            cout << "*";
            } else {
              cout << " ";
            }
        }
       cout << endl;
    }


   
    
    return 0;
}