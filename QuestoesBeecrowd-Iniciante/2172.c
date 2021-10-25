#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
                     
                      
      int main (){
            setlocale(LC_ALL,"");
            unsigned long long int exp;
            int x,a=0;
            while (a==0)
            {
                  
                  scanf("%x %llu",&x,&exp);
                  if (x>0 && exp >0)
                  {
                        printf("%llu\n",exp*x);
                  }
                  else {
                        a=1;
                  }
                  
            }
            
    
                  
                   
   return 0;    
}