def last_digit(n1, n2)

    mod1 = n1 % 10
    mod2 = n2 % 10
    
    
    
    if ((n2 == 0))
    
        return 1
        
    
    elif (n2 == 1)
        
        return mod1   
       
        
    elif ((mod1 == 0))
        
        return 0 
        
    elif (n2 % 4 == 0)
        return (pow(mod1, 4 % 10) % 10) 
        
    
    elif ((mod1 == 1))
    
        return 1    
        
        
    elif ((mod1 == 2))
    
        return (pow(mod1, n2 % 4) % 10)
        
        
    elif ((mod1 == 3))
    
        return (pow(mod1, n2 % 4) % 10)
        
    
    elif ((mod1 == 4))
        
        return (pow(mod1, n2 % 4) % 10)
    
    
    elif (mod1 == 5)
        
        return 5 
    
    
    elif (mod1 == 6)
        
        return 6
    
    
    elif ((mod1 == 7))
    
        return (pow(mod1, n2 % 4) % 10)
        
        
    elif ((mod1 == 8))
    
        return (pow(mod1, n2 % 4) % 10) #v1
        
        
    elif ((mod1 == 9))
        
        return (pow(mod1,n2 % 4) % 10)