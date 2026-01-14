import java.util.Scanner;

public class pro 
{
    public static void main(String [] args)
    {
        int i,n;
        i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr no you want to print upto");
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i=i+1;
        }
        sc.close();
    }
}
