import java.util.*; 
public class  Palindrome 
{ 
 public static void main(String[] args)  
 { 
Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a String"); 
    String s = sc.next(); 
     int len = s.length(); 
      int i , j=len-1; 
 boolean flag=true; 
 for(i=0 ; i < len/2 ; i++) 
  { 
   if(s.charAt(i) != s.charAt(j)) 
    { 
            flag=false; 
               } 
      j--; 
  } 
          if(flag==true) 
      System.out.println("The string " +s + " is  Palindrome"); 
    else 
                         System.out.println("The string " +s + " is Not a Palindrome"); 
 } 
} 
