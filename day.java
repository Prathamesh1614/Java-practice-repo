import  java.util.Scanner;

public class day 
{
 public static void main(String [] args)
 {
    int a;
    Scanner sc=new Scanner (System.in);
    System.out.println("Eneter the number(1-7) to check days of week");
    a=sc.nextInt();
    switch(a)
    {
        case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednsday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        break;
        default:
        System.out.println("invalid choice");


    }
 }   
}
