#include <iostream>
using namespace std;

class banksavings
{
  int principal;
  int years;
  float intrest_Rate;
  float final_amount;
  

  public:
  banksavings(){}
  banksavings(int p ,int y ,float IR);
  banksavings(int p ,int y, int IR);
  void print();
};
banksavings:: banksavings(int p,int y,float IR)
{
    principal=p;
    years=y;
    intrest_Rate=IR;
    final_amount=principal;
    for(int i=0;i<y;i++)
    {
     final_amount=final_amount * (1+intrest_Rate);   
    }
}
void banksavings :: print()
{
    cout<<endl<<"principal amount was "<<principal<<"time for investment "<<years<<"your amount is "<<final_amount<<endl;

}
int main(){
     banksavings aman;
     int p, a;
     float j;
     int i;
     cout<<"Enter the principal amount "<<endl;
     cin>>p;
     cout<<"Enter the time and intrest rate "<<endl;
     cin>>a>>j;
     aman=banksavings(p,a,j);
     aman.print();
    
    return 0; 
}