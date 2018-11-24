import java.util.*;
public class CaesarCipher {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      Scanner input = new Scanner (System.in);
      String prompt = "";
     
      
     
       do {

      System.out.println("Enter string to be encryted:");
      String value = sc.next();
      value = value.toUpperCase();
      System.out.println("String to be encrypted:" +" " + value);
                 
      int [] charValuesPos = new int [value.length()];
      
    

       System.out.println("Enter a Numeric Key: "+ " ");
      String s = "";  
      int key = sc.nextInt() % 26;
      for (int i = 0; i < value.length(); i++) 
      {
         char c = value.charAt(i);
         if (c <= 64 || c >= 91) 
          {
            c += 0;
          }
         else {
            c += key;
            if (c >= 91) {
               c -= 26;
                         }
              }
        s = s + c; 
        
         
     
        } 

       System.out.println("Encrypted String is "+ s);
       System.out.println("Would you like to continue?(Y/N)");
     prompt = input.next();
     prompt = prompt.toUpperCase();
      
        } while(prompt.equals("Y")   );
         
             
      

      


   }


}