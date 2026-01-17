import java.util.Scanner;

public class troy
{
    public static void main(String args[])
    {
        int n,sum=0,pro=1,digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();
        while(n>0)
        {
        digit = n % 10;
        if(digit%2==0)
        {
        sum = sum + digit;
    }
        else
        {
            pro=pro*digit;
        }

            n=n/10;
        }
        System.out.println("sum ="+sum + "pro="+pro);
        sc.close();
    }
}
