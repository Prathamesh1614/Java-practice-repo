import java.util.Scanner;


public class multiplication 
{
    public static void main(String [] args)
    {
        int i,mul=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("print the table of:");
        mul=sc.nextInt();
         i=5;
        while(i<=50)
        {
            // System.out.println(mul + " x " + (i / 5) + " = " + (mul * (i / 5)));
            mul=mul*i;
            i=i+5;
        }
        System.out.println("table is="+mul);
        

    }
    
}
