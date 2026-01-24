import java.util.Scanner;
public class natural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i = n; i>=1; i--){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i + " ");

        }
    }
    
}
