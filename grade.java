// public package JavaProject1;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("Result of the student");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int numberOfSubject = scan.nextInt();
        int totalScore=0;
        int eachSub;
        for(int i=1; i<=numberOfSubject; i++){
            System.out.print("Enter the score of each subjects : ");
            eachSub = scan.nextInt();
            if(eachSub < 0 || eachSub > 100){
                System.out.println("Invailid score!");
            }
            totalScore = totalScore + eachSub;
        }
        int Avg = totalScore/numberOfSubject;
        if(Avg >= 60){
            System.out.println("P");            //P = Pass
        }
        else {
            System.out.println("F");            //F = Fail
        }
        scan.close();
    }
}