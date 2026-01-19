import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        int n, z, count = 0, digit, i, pro = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        z = n;
        while (z > 0) {
            count = count + 1;
            z = z / 10;
        }
        z = n;
        while (z > 0) {
            digit = z % 10;
            pro = 1;
            for (i = 1; i <= count; i++) {
                pro = pro * digit;
            }
            sum = sum + pro;
            z = z / 10;

        }
        if (sum == n) {
            System.out.println("armstrong number");

        } else {
            System.out.println("not armstrong");
        }

    }

}
