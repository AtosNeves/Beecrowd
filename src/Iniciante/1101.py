z = 20                                                   
somador = 0                                              
contador = -1                                            
while z < 60:                                            
    a,b = input().split(" ")                             
    a = int(a)                                           
    b = int(b)                                           
    if b > a and a > 0 and b >0:                         
        print(a, end=" ")                                
        for x in range(a,b):                             
             g = x                                       
             contador = g + 1                            
             somador = somador + x                       
                                                         
             print(contador, end=" ")                    
        somador = somador +(x+1)                         
        print(f"Sum={somador}")                          
        somador = 0                                      
        g = 0                                            
    elif a > b and a > 0 and b >0:                       
        print(b, end=" ")                                
        for x in range(b,a):                             
            g = x                                        
            contador = g + 1                             
            somador = somador + x                        
            print(contador, end=" ")                     
        somador = somador +(x+1)                         
        print(f"Sum={somador}")                          
        somador = 0                                      
        g = 0                                            
    else:                                                
        exit()                                           
