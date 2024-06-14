#include <iostream>
using namespace std;

class video
{
    protected:
    string title;
    int likes;

    public:
    video(string t, int l)
    {
     title= t ;
     likes= l ;
    }
    void display()
    {
    }
};
class youtube: public video
{
   int comments;
   public:
   youtube(string t, int l, int c): video(t,l) 
   {
    comments =c;
   }
   void display()
   {
    cout<<"Your video "<<title<<endl;
    cout<<"Total likes are "<<likes<<endl;
    cout<<"Total comments are "<<comments<<endl;
   }
};
class twitch:public video
{
   protected:
   int viewers;
   public:
   twitch(string t, int l,int v):video(t,l)
   {
    viewers=v;
   }
   void display() 
   {
    cout<<"Your video "<<title<<endl;
    cout<<"Total likes are "<<likes<<endl;
    cout<<"Total people watching your stream are "<<viewers<<endl;
   }
};

int main(){
    string title;
    int length,likes,comments,viewers;

     title = "hello guys";
     length=40;
     likes=12332;
     comments=324;
     viewers=2348;
     youtube v1(title, likes, length);
     v1.display();
     twitch v2(title, length, viewers);
     v2.display();
    return 0;
}