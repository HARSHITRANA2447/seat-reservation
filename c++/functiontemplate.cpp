#include <iostream>
using namespace std;

template<class a>
float swapp(a &num1, a &num2){
    a temp=num1;
    num1=num2;
    num2=temp;
}
int main(){
    float x=34.0,y=43.0;
    swapp(x,y);
    cout<<"Swaped values are "<<x<<" "<<y<<endl;
    return 0;
}