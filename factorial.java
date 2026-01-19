import java.util.Scanner;
public class factorial {
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n , fact=1;
        System.out.println("Enter the number");
        n = sc.nextInt();

    while(n>0)
    {
        fact = fact*n;
        n=n-1;
    }
    System.out.println("factorial is: "+fact);
    }
}
