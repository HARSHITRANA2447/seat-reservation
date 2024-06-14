#include <iostream>
#include<vector>
using namespace std;
void display(vector<int> &v){
    for(int i=0; i<v.size();i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

int main(){
   
    vector<int> vec;
     int element,size,num;
    cout<<"enter the size"<<endl;
    cin>>size;
    
    for (int i = 0; i < size; i++)
    {
        cout<<"Enter element "<<endl;
        cin>>element;
        vec.push_back(element);
    }
    display(vec);
    vec.pop_back();
    display(vec);
    vector<int> :: iterator itr = vec.end();
    vec.insert(itr-1 ,2,32 );
    display(vec);
    vector<int> v1, v;
    v1.push_back(1);
    v1.push_back(2);
    v.push_back(3);
    v.push_back(4);
    for (int i = 0; i < v.size(); i++)
        cout << v[i] << " ";
    for (int i = 0; i < v1.size(); i++)
        cout << v1[i] << " ";    
    v1.swap(v);
    return 0;
}