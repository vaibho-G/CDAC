#include<iostream>
using namespace std;
int main(){

   
   for (int i = 1; i <= 5; ++i) {
        for (int j = 1; j <= 2 *5- 1; ++j) {
            if (j == i || j == 2 * 5 - i || i == 1) {
                cout << "*";
            } else {
               cout << " ";
            }
        }
       cout <<endl;
    }
    return 0;
}