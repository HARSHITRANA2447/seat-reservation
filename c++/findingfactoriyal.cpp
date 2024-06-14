#include <iostream>
using namespace std;
int fibonacci(int x){
    if (x<2){
        return 1;
    }
    return fibonacci(x-1) + fibonacci(x-2); 
}

int factorial(int a){
    if(a<=1){
        return 1;
    }
    return a * factorial(a-1);
}
int main(){
    cout<<"Enter the value "<<endl;
    int b;                  
    cin>>b;
    cout<<"The factorial of "<<b<<" is "<<factorial(b)<<endl;
    cout<<"The value of the number at "<<b<<"th place in fibonacci series is "<<fibonacci(b)<<endl;

    return 0;
}