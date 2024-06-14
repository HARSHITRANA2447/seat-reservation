#include<stdio.h>

int main(){
    int amount;
    printf("Enter a number \n\n");
    scanf("%d",&amount);
    switch(amount){
        case 1:

          printf("Ek din khaega tatty");
  
          break;       
        case 2:
  
          printf("aaj hi kha le ");
  
         break;
  
        case 3:
  
           printf("naak ka maal ha tu");
  
         break;
  
        case 4:   
  
           printf("bread ki fungus chall nikal");
  
         break;

      default:
      printf("Entered number is not avalaible");
      break;
      
    }

    return 0;
}