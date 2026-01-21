import java.util.Scanner;

public class grades {
    public static void main(String args[]) {
        Scanner score = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks : ");
        marks = score.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade is 'A' ");
        } else if (marks >= 80) {
            System.out.println("Grade is 'B' ");
        } else if (marks >= 70) {
            System.out.println("Grade is 'C' ");
        } else if (marks >= 60) {
            System.out.println("Grade is 'D' ");
        } else if (marks >= 0) {
            System.out.println("You are fail. Better luck next time !!");
        } else {
            System.out.println("invalid input");
        }
    }

}
