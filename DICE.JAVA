
import java.util.Random;
import java.util.Scanner;


public class Dice {

    /**
     * @param args the command line arguments
     */
    
   public static double getRandomIntegerBetweenRange(double min, double max){
    double x = (int)(Math.random()*((max-min)+1))+min;
    return x;
} 

public static int generateRandomIntIntRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Grand Circus Casino!");
        Scanner scan= new Scanner(System.in);
        int side;
         
        String input;
        
        do{
            
       System.out.println("How many sides you shoould each die have?");
       side=scan.nextInt();
       
        int num1=generateRandomIntIntRange(1, side);
        int num2=(int)getRandomIntegerBetweenRange(1, side);
        System.out.println("Roll 1:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Roll again?(y/n)");
        input=scan.next();
         }while(input.equalsIgnoreCase("y"));
    }
    
}