#include<stdio.h>
#include<math.h>

int main(){
float a,b,c,D,r1,r2,r3 ;
printf("\n enter the coffecients \n");
scanf("%S %S %S", &a ,&b ,&c );
D=(b*b)-4*a*b;
printf("/nthe value of %S" , D);
if (D<0)
{
  printf("no real roots");
}
if (D>0)
{
  r1= (-b+ sqrt(D))/2*a;
  r2=(-b- sqrt(D))/2*a;
  printf("/nthe first root  %S", r1);
  printf("/nthe second root %S", r2);
}
if(D==0){
    r3=-b/2*a;
    printf("/nthe roots are equal %S" ,r3);
}
return 0;
}