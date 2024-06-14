#include <iostream>
using namespace std;

int sum(int a ,int b);
void g(void);
void swap(int &a , int &b){
    int temp = a;
    a = b ;
    b = temp;
}
void y(){
    cout<<"adal badal numbers ka "<<endl;
}
int main(){
    int num1, num2;
    cout<<"give the value of first number "<<endl;
    cin>>num1;
    cout<<"give the value of second number "<<endl;
    cin>>num2;
    cout<<"the sum is "<<sum(num1, num2);
    g();
    swap(num1, num2);
    cout<<"the swaped value of num1 is "<<num1<<endl;
    cout<<"the swaped value of num2 is "<<num2<<endl;
    y();
    return 0;
}
int sum(int a ,int b){
   int c=a+b;
    return c;
}
void g(){
   cout<<"lele answer"<<endl;
} 