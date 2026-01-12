import java.util.Scanner;
public class positivenegative 
{
    public static void main(String []args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("number is positive");
        }
        else if(a<0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is zero");
        }

    }
}
