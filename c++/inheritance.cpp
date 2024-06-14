#include <iostream>
using namespace std;

class person
{
  int id ;
  char name[100] ;  
 
public:
  void set_data()
  {
    cout<<"Enter the Id "<<endl;
    cin>>id;
    fflush(stdin);
    cout<<"Enter the name"<<endl;
     cin.get(name,100);
  }
  void display_data(){
    cout<<"The ID is "<<id<<"\t"<<"Name is "<<name<<endl;
  }
};
class student: private person{
   char course[50];
   int fees;
   public:
    void set_data1()
    {
        set_data();
        cout<<"Enter the course name "<<endl;
        fflush(stdin);
        cin.getline(course,50);
        cout<<"Enter the fee "<<endl;
        cin>>fees;
    }
    void display_data1(){
        display_data();
         
         cout<<"The course "<<course<<" will cost you "<<fees<<endl;
        
    }

     
};
int main(){
    student s1;
    s1.set_data1();
    s1.display_data1();
    return 0;
}