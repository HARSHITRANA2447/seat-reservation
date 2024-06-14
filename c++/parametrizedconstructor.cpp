#include <iostream>
using namespace std;
 
 class point{
      int a, b;
    public:
      point(int x, int y){
        a=x;
        b=y;
      }

      void printpoints(){
        cout<<"Entered values are "<< a<< " and "<< b <<endl;
      }

 };

int main(){
    point p(43,348);
    p.printpoints();
    return 0;
}