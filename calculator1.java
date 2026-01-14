import java.util.Scanner;

public class calculator1 
{
    public static void main(String [] args)
    {
    int a,b,ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    a=sc.nextInt();
    System.out.println("Enter second number");
    b=sc.nextInt();
    System.out.println("Enter your choice\n 1->add\n 2->subtract\n 3->multiply\n 4->divide\n");
    ch=sc.nextInt();
    switch (ch)
     {
        case 1:
        System.out.println("addition is="+(a+b));
        break;
        case 2:
        System.out.println("subtraction is="+(a-b));
        break;
        case 3:
        System.out.println("multiplication is="+(a*b));
        break;
        case 4:
        System.out.println("division is="+(a/b));
        break;
        default:
        System.out.println("invalid choice");

     }
    }

}
