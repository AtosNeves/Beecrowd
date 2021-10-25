#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
                     
                      
      int main (){
            setlocale(LC_ALL,"");
            int a,b;
            scanf("%d %d",&a,&b);

            if (a>=b)
            {
                  printf("%d\n",a);
            }
            else if (b>a)
            {
                  printf("%d\n",b);
            }
            
            
    
                  
                   
   return 0;    
}