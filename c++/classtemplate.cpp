#include <iostream>
using namespace std;

template<class a,class b>
void sum(a num1, b num2){
     cout<<"sum of "<<num1<<" and "<<num2<<" is "<<num1+num2<<endl;
};
int main(){
    int m;
    float n;
    cout<<"Enter the interger"<<endl;
    cin>>m;
    cout<<"Enter the decimal value"<<endl;
    cin>>n;
    sum(m,n);
    return 0;
}