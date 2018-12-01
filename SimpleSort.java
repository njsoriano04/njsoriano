
import java.util.Scanner;

public class SimpleSort { 
  
public static void main(String[] args) {
    Scanner scan1=new Scanner(System.in);
    System.out.print("How many numbers you want to sort: ");
    int a=scan1.nextInt();

    int i,j,k=0; // i and j is used in various loops.
    int num[]=new int[a];
    int great[]= new int[a];  

    Scanner scan2=new Scanner(System.in);
    System.out.println("Enter the numbers: ");

    for(i=0;i<a;i++)    
        num[i] = scan2.nextInt();

    for (i=0;i<a;i++) {
        for(j=0;j<a;j++) {
            if(num[i]>num[j]) 
                k++;} 
    	great[i]=k++;  
    k=0; } 

    System.out.println("Ascending Order: ");

    for(i=0;i<a;i++)
        for(j=0;j<a;j++)
            if(great[j]==i) System.out.println(num[j]); 

    System.out.println("Descending Order");
    for(i=0;i<=a;i++)
        for(j=0;j<a;j++)
            if(great[j]==a-i) System.out.println(+num[j]);

}
}