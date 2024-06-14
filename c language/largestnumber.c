#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter the value of a,b,c\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b){
        if(b>c){
            printf("The biggest number is %d",a);
        }
    }
    if(b>a){
        printf("The biggest number is %d",b);
    }
    else{
        printf("The biggest number is %d",c);
    }
    return 0;
}