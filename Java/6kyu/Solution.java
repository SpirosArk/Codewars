import java.io.*;

public class Solution {

  public int solution(int number) {
  
  int a, b, c, sum3 = 0, sum5 = 0, sum15 = 0, count = 0, total = 0;  
  count = number / 15;
 
  for(a=3; a<number; a+=3){
    
    sum3 += a;
    
  }
  
  
  for(b=5; b<number; b+=5){
    
    sum5 += b;
    
  }  
  
  
  for(c=1; c<=count; c++){
  
    sum15 += c*15;
    
  }
  
  
  total = sum3 + sum5 - sum15;
    
  return total;
    
  }
}
