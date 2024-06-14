#include <iostream>
using namespace std;

float volume(int a, int b){
    return 3.143*a*a*b ;
}
int volume(int a, int b, int c){
    return (a*b*c);
}
int volume(int a){
    return (a*a*a);
}

int main(){
    int a, b, c;
    cout<<"Give the value of a "<<endl;
    cin>>a;
    cout<<"Give the value of b "<<endl;
    cin>>b;
    cout<<"Give the value of c "<<endl;
    cin>>c;
    cout<<"The volume of cuboid having sides "<<a<<" & "<<b<<" & "<<c<<" is "<<volume(a,b,c)<<endl;
    cout<<"The volume of cyclinder with radius "<<a<<" & height "<<b<<" is "<<volume(a,b)<<endl;
    cout<<"The volume of cube with side "<<a<<" is "<<volume(a)<<endl;

    return 0;
}