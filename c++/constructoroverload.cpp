#include <iostream>
using namespace std;

class pointdistance{
    int a,b;
public:
     pointdistance(){
        a=0;
        b=0;
     }
     pointdistance(int x,int y)
    {
        a=x;
        b=y;
     }
     pointdistance(int x)
    {
        a=x;
        b=0;
     }
    
      void pointprint()
    {
        cout<<"The given cordinates are "<<a <<" and "<<b<<endl;
    }
};

  
int main(){
    pointdistance p(948,34);
    p.pointprint();
    
    return 0;
}