import java.util.*;
class Methods{
    static void display(){
        System.out.println("Ananya");
    }
    
    static void greet(String name){
        System.out.println("Hello"+name);
    }

    static int square(int n){
        return n*n;
    }

    double calculateArea(double side){
        System.out.println("Area of Circle:");
        return 3.14*side*side;
    }

    double calculateArea(double length,double breadth){
        System.out.println("Area of Rectangle:");
        return length*breadth;
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Methods.display();

        Methods.greet("Ananya");

        int sq=Methods.square(5);
        System.out.println("Square:"+sq);


        Methods m=new Methods();

        double c=m.calculateArea(4);
        double r=m.calculateArea(3,4);

        System.out.println(c);
        System.out.println(r);

        sc.close();
    }
}
 
