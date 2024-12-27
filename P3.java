import java.util.Scanner;

public class P3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = scanner.nextInt();
        System.out.println("enter second number: ");
        int b = scanner.nextInt();
        addition(a,b);
        sub(a,b);
       }
       public static void addition(int i, int j){
        System.out.println("sum of a and b is: "+ (i+j));
       }
       public static void sub(int k, int l){
        System.out.println("sum of a and b is: "+ (k-l));
       }
    
}