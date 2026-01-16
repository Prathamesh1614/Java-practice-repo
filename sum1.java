import java.util.Scanner;

public class sum1 
{
    public static void main(String args [])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter number:");
        n=sc.nextInt();
        while (n>0) 
        {
           sum = sum + n%10;// Extract last digit and add to sum
            n=n/10; //to remove decimal digit from users input  
        }
        System.out.println("sum is:"+sum);
        sc.close();

    }
}
