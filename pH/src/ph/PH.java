
package ph;

import java.util.Scanner;

public class PH {


    public static void main(String[] args) {
       String[] s={"apple","grape","orange","lemon","lichi"}; 
       System.out.println("Please enter a fruit : ");
       for(int i=0;i<5;i++) System.out.println((i+1)+")"+s[i]);
       
       Scanner input=new Scanner(System.in);
       int fruit=input.nextInt();
       Product p=new Product(fruit);
       Container c=new Container();
 
       System.out.println("Please enter amount of barrel:");
       int amount=input.nextInt();
       int space=c.hold(fruit, amount);
       if(space>c.getStorage()) System.out.println("Sorry, not available storage.");
       else {
           System.out.println("Enter pH : ");
           double ph=input.nextDouble();
           Toxicity t=new Toxicity(p,ph);
       }
       
    }
    
}
