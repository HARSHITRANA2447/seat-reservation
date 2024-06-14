#include <iostream>
using namespace std;

template<class a, class b>
class diff
{
public:
   a firstnum;
   b secondnum;
   diff(a n1,b n2){
    firstnum=n1;
    secondnum=n2;
   }
   void display(){
    cout<<this->firstnum<<" "<<this->secondnum<<endl;
   }


};
int main(){
    diff<float,int> num(531.5,53);
    num.display();
    return 0;
}