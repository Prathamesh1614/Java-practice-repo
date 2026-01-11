import java.util.Scanner;
public class agechecker 
{
    public static void main (String [] args)
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are adult");
        }
        else{
            System.out.println("You are minor");
        }
    }
}
