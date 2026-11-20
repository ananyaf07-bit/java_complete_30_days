import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a=sc.nextInt();

        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        System.out.println("Arithmetic Operations: "+ (a+b));
        System.out.println("Arithmetic Operations: "+ (a*b));
        if(b!=0){
            System.out.println("Arithmetic Operations: "+ (a/b));
            System.out.println("Arithmetic Operations: "+ (a%b));
        }
        

        System.out.println("Relational Comparisons:"+ (a==b));
        System.out.println("Relational Comparisons:"+ (a<b));
        System.out.println("Relational Comparisons:"+ (a>=b));

        boolean bothPositive = (a > 0) && (b > 0);
        boolean atLeastOnePositive = (a > 0) || (b > 0);
        boolean aIsNotPositive = !(a > 0);
        System.out.println("Both are positive " + bothPositive);
        System.out.println("At least one is positive " + atLeastOnePositive);
        System.out.println("a is NOT positive " + aIsNotPositive);

        int temp = a;
        System.out.println("Initial temp value " + temp);
        temp += b;
        System.out.println("After temp +=b" + temp);

        System.out.println("Bitwise AND " + (a & b));
        System.out.println("Bitwise OR " + (a | b));
        


    }
    
}
