#include <iostream>
using namespace std;

class point{
     int a, b;

   public:
        point(void);

    void printpoint()
    {
        cout<<"The given pointes are "<< a <<" and "<<b<<endl;
    }   
};
      point ::point(void){
        a=39;
        b=48;
    }

int main(){
    point x;
    x.printpoint();
    return 0;
}