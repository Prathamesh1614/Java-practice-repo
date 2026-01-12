import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter  second number:");
        b = sc.nextInt();
        System.out.println("Enter your choice:\n 1->add\n 2->subtract\n 3->multiply\n 4->divide");
        ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Addition is=" + (a + b));
        } else if (ch == 2) {
            System.out.println("Subtraction is=" + (a - b));
        } else if (ch == 3) {
            System.out.println("Multiplication is=" + (a * b));
        } else if (ch == 4) {
            System.out.println("division is=" + (a / b));
        } else {
            System.out.println("invalid choice");

        }

    }
}
