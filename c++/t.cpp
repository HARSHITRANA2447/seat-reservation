#include <iostream>
#include<cmath>
using namespace std;

class point
{

int x;
int y;
friend void distance(point,point);

public:
  point(int a,int b){
    x=a;
    y=b;
  }
  void showpoints(){
    cout<<"Entered Cordinates are "<<x<<" and "<<y<<endl;
  }
};

void distance(point p ,point q){
    int x_diff=p.x-q.x;
    int y_diff=p.y-q.y;
    int diff = sqrt(pow(x_diff,2)+pow(y_diff,2));
    cout<< "The difference is : "<<diff<<endl;
}

int main(){
    point p(34,34);
    point q(34,323);
    return 0;
}