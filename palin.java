import java.util.Scanner;

public class palin
{
    public static void main(String a [])
    {
        Scanner sc = new Scanner(System.in);
      int n,rev=0,z;
      System.out.println("enter number");
      n=sc.nextInt();
      z=n;
      while(n>0)   
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(rev==z)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not panindrome");
            sc.close();
        }
      }

    }

