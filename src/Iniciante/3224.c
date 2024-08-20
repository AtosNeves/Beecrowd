#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
                     
                      
      int main (){
            setlocale(LC_ALL,"");
            char a[1000],b[1000];
            scanf("%s",a);
            scanf("%s",b);
            int c = (strlen(a)-1)-(strlen(b)-1);
            //printf("%d\n",c); 
            if ((strlen(a))<c)
            {
                  printf("no\n");
            }
            else printf("go\n");
            
    
                  
                   
   return 0;    
}