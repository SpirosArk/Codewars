int digital_root(int n) {
 
  int a = 0;
  
  while (n > 0 || a > 9){
    if (n == 0){
      n = a; 
      a = 0; 
    } 
    a += n % 10; 
    
    n /= 10; 
  } 
  return a; 
  
}