import java.util.Scanner;

public class P3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a= scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int b=scanner.nextInt();
        if(a==b){
            System.out.println("both are samme");
        }
        else 
        System.out.println(" both are not same");

    }
}