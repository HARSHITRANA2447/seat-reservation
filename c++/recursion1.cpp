#include <iostream>
using namespace std;

void get(int x,int y){
    if(x<=y){
        cout<<x<<endl;
    }
    get(x+1,y);
}

int main(){
    int a,b;
    cout<<"ENter first & second digit"<<endl;
    cin>>a>>b;
    get(a,b);
    return 0;
}