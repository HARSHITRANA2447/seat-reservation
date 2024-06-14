#include<stdio.h>
#include<math.h>

int main()
{
    int i=1,sum=0,n,m,yo;
    printf("enter the power of series\n");
    scanf("%d",&n);
    printf("enter the last number of series\n");
    scanf("%d",&m);
    while(i<=m)
    {
       yo=pow(i,n);
       sum=sum+yo;
       i++;
    }
printf("The sum of term is %d",sum);
   return 0;
}