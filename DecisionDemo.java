import java.util.*;
public class DecisionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks:");
        int ch=sc.nextInt();

        if(ch>=90 && ch<=100){
            System.out.println('A');
        }
        else if(ch>=80){
            System.out.println('B');
        }
        else if(ch>=70){
            System.out.println('C');
        }
        else if(ch>=60){
            System.out.println('D');
        }
        else if(ch<60 && ch>=0){
            System.out.println('F');
        }
        else{
            System.out.println("Invalid input");
        }
    } 
}
