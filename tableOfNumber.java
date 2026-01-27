import java.util.Scanner;

public class tableOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }

    }

}
