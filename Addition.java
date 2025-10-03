import java.util.Scanner;
public class Addition {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number A :");
        int a = sc.nextInt();
        System.out.println("You entered the number :"+a);
        System.out.println("Enter a number B :");
        int b = sc.nextInt();
        System.out.println("You entered the number "+b);
        int sum = a+b;
        System.out.println("Lets add "+ a + " and "+b);
        System.out.println("The addition of given numbers is "+sum);
    }
}

