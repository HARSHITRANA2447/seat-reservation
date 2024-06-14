#include<stdio.h>

    int main()
{
   int a[20], size , element;
   printf("Give the size of array");
   scanf("%d",&size);
   printf("Give the elements of array");
   for(int i=0; i<size ; i++){
       scanf("%d", &a[i]);
   }
   printf("Enter the element to be searched");
   scanf("%d", &element);
   for(int i=0 ;i<size ; i++){
   if(a[i]==element){
       printf("the value is at postion %d", i ,element);
   }
   }
}