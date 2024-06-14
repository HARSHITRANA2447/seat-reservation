#include <iostream>
using namespace std;

class Students
{
    protected: 
    int roll_no;

    public:
    void set_roll_no()
    {
        cout <<"Enter Roll No. :- "<<endl;
        cin >>roll_no;
    }
    void give_roll_no(void)
    {
        cout<<"Roll No. of Student is:- "<<roll_no<<endl;
    }
};
class Theory_Marks:virtual public Students
{
    protected:
    float physics;
    float maths; 
    float chemistry;
    public:
    void set_marks()
    {
        cout<<"Enter the Marks in physics out of 60: "<<endl;
        cin>>physics;
        cout<<"Enter the Marks in mathsout of 60: "<<endl;
        cin>>maths;
        cout<<"Enter the Marks in chemistryout of 60: "<<endl;
        cin>>chemistry;
    }
};
class Practical_Marks:virtual public Students
{
    protected:
    float Theory_physics;
    float Theory_Maths;
    float Theory_chemisty;
    public:
    void set_Theory_Marks() 
    {
        cout << "Enter Marks in Theory Physics out of 40:- "<<endl;
        cin >> Theory_physics ;
        cout << "Enter Marks in Theory Maths out of 40:-"<<endl;
        cin>> Theory_Maths;
        cout<<"Entet Marks in Theory Chemisty out of 40:- "<<endl;
        cin>> Theory_chemisty;
    }
    
};
class Total_percentage: public Theory_Marks,public Practical_Marks
{
  private:
  float Percentage;
  public:
  void display(void)
  {
    Percentage=(physics+Theory_physics+maths+Theory_Maths+chemistry+Theory_chemisty) * 0.33;
    give_roll_no();
    cout<<"The percentage of "<<roll_no<<" is "<<Percentage<<"% "<<endl;
  }
};
int main(){
    Total_percentage omi;
    omi.set_roll_no();
    omi.give_roll_no();
    omi.set_marks();
    omi.set_Theory_Marks();
    omi.display();
    return 0;
}