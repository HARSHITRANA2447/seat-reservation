#include<stdio.h>

int achk(int m, int n);
int main(){
    int m,n;
    printf("Enter two numbers \n");
    scanf("%d%d",&m,&n);
    printf("OUTPUT is %d", achk(m,n));
    return 0;
}
int achk(int m ,int n){
    if (m==0)
    {
       return n+1;
    }
    else if(n==0){
        return achk(m-1,1);
    }    
    else{
        return achk(m-1,achk(m,n-1));
    }
}