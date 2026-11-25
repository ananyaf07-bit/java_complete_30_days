import java.util.*;
public class LoopDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter integer n");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.printf("\n%d x %d =%d",n,i,n*i);
        }

        while(n>=1){
            System.out.println(n);
            n--;
        }

        do{
            System.out.println(n);
            n--;
        }while(n>=1);

        sc.close();
    }
    
}
