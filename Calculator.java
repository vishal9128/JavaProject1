// package JavaProject1;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number : ");
            int num1 = scan.nextInt();
            System.out.print("Number : ");
            int num2 = scan.nextInt();
        
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose option for calculations : ");
            int choose = scan.nextInt();

            if(choose==1){
                int Result=num1+num2;
                System.out.println("Addition : "+Result);
            }
            else if(choose==2){
                int Result = num1-num2;
                System.out.println("Subtraction : "+Result);
            }
            else if(choose==3){
                int Result = num1*num2;
                System.out.println("Multiplication : "+Result);
            }
            else if(choose==4){
                if(num2==0){
                    System.out.println("Can't divided by 0");
                }
                else{
                    int Result = num1/num2;
                    System.out.println("Division : "+Result);
                }
            }
            else if(choose==5){
                System.out.println("Thank you!");
                scan.close();
                return;
            }
            else{
             System.out.println("Invailid");
            }
            scan.close();
        }
    }
}
