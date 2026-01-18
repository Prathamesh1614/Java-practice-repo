import java.util.Scanner;
public class prime 
{
    public static void main(String args[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            if(n % i == 0)
            count++;

            i++;
        }
        if(count==2)
        {
            System.out.println("prime");
        }
            else
            {
                System.out.println("not prime");
            }
                sc.close();
        }
    }
    

