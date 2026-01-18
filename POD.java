import java.util.Scanner;

public class POD {
    public static void main(String args[]) {
        int n, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();
        while (n > 0) {
            mul = mul * (n % 10);
            n = n / 10;
        }
        System.out.println("product of digit=" + mul);
        sc.close();

    }

}
