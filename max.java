import java.util.Scanner;
public class max
 {
    public static void main(String [] args)
    {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number:");
    a=sc.nextInt();
    System.out.println("Enter second number");
    b=sc.nextInt();
    System.out.println("Enter third number");
    c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println("Max number="+a);
    }
    else if(b>c && b>c)
    {
        System.out.println("max number="+b);
    }
    
        else
        {
            System.out.println("max number="+c);
        }
    }
}
 