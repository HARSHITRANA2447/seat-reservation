#include<stdio.h>
#include<stdlib.h>

int main(){
  srand(time(NULL));
  int num=1, roll=0;

  for(int i=1;i<=num;i++)
  {
    roll=rand() % 10 + 1 ;
    
  }   
  switch(roll){
    case 1:
    printf("gooo kha le");
    break;
    case 2:
    printf("Bathroom ma fisal ke marega");
    break;
    case 3:
    printf("Hantai ka ashiq");
    break;
    case 4:
    printf("ptu is waiting");
    break;
    case 5:
    printf("mst ma gaya tu ");
    break;
    case 6:
    printf("month end starts now");
    break;
    case 7:
    printf("gf bane gi pr teri nhi dost ki");
    break;
    case 8:
    printf("ganja ho jaega");
    break;
    case 9:
    printf("tera kacha fatega ");
    break;
    case 10:
    printf("feel empty");
    break;
  }
  return 0;
}