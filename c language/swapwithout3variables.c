#include<stdio.h>

int main(){
    int x,y;
    printf("Enter the value of X\n");
    scanf("%d",&x);
    printf("Enter the value of Y\n");
    scanf("%d",&y);
    x=x+y;
    y=x-y;
    x=x-y;
    printf("The values after swap are %d and %d",x,y);
    return 0;
}