import java.util.*; 
import java.util.Arrays;

public class isogram {
    public static boolean  isIsogram(String str) {
    
      str = str.toLowerCase();      
      char[] ch = str.toCharArray();
      int n = 0, i = 0;
      int length = str.length();
      HashSet<String> set = new HashSet<String>();
          
      if(length > 26){
         return false;
      }
        
      else if (length < 3){
         return true;
      }
    
    
      for (i=0; i<length; i++) {
        
        set.add(String.valueOf(ch[i]));
        System.out.println(ch[i]);
       }
       
      if (length != set.size()){
        
        return false;
      
      }
      
      else{
      
        return true;
      
      }
    }
}