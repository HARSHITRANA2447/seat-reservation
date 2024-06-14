#include <iostream>
using namespace std;

void reverse_array(int a[],int start,int end)
{
   while(start<end)
   {
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
    start++;
    end--;
   }
}
void display_array(int a[],int size)
{
   for(int i=0;i<=size;i++){
     cout<<"The array is "<<a[i]<<endl;
   }
}
int main(){

    int arr[10];
    int n=10;
    for(int i=0;i<=0;i++){
        cin>>arr[i];
    }
    reverse_array(arr,0,n-1);
    display_array(arr,n);
    return 0;
}