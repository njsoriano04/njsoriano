import java.util.Scanner;

public class GuessingGame
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);

   int a = (int) (Math.random()*100+1);
   int guess=0;
System.out.println(a);
  int count = 0;




   while (guess!=a &&  count<5 ){
        
      System.out.println("Enter a guess (1-100)");
       
         


       guess = sc.nextInt();

        count++;

   if (guess == a)	
   {  
     System.out.println("Your guess is correct. Congratulations!");

   } 
   else if (guess < a) 
   {
    System.out.println("Your guess is smaller than the secret number!");

   }
   else if(guess>a)
   {
     System.out.println("Your guess is greater than the secret number.");
   }


}


   
  }
}