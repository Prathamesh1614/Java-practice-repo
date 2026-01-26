import java.util.Scanner;
public class sunOfFirtEvenNumbers {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int i=0, n, sum=0;
        System.out.println("enter the Number(n): ");
        n = sc.nextInt();
        while(i<=n ){
            sum += 2 * i;
            i++;
            System.out.println("Sum of first " + n + " even numbers is: " + sum);
        }

    }
    
}
