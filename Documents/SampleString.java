// Java program move all uppercase alphabets 
// to the end of string 
  
public class SampleString { 
  
    static public String move(String str) 
    { 
      
        int len = str.length(); 
 
        String low = ""; 
  
        String upr = ""; 
        char ch; 
        for (int i = 0; i < len; i++) { 
            ch = str.charAt(i); 
  
            
            if (ch >= 'A' && ch <= 'Z') { 
                upr += ch; 
            } 
            else { 
                low += ch; 
            } 
        } 
        return low + upr; 
    } 
  
    public static void main(String args[]) 
    { 
        String str = "What to say everyday is a chance to prove yourself!!"; 
        System.out.println("Before Operation:   " + str); 
        System.out.println("After Operation:    " + move(str)); 
    } 
} 