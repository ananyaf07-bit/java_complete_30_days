import java.util.*;
public class MatrixDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows:");
        int rows=sc.nextInt();

        System.out.println("Enter Columns:");
        int columns=sc.nextInt();

        int m1[][]=new int[rows][columns];
        int m2[][]=new int[rows][columns];
        int sum[][]=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                m1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                m2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }

        System.out.println("Matrix 1:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(m1[i][j]);
            }
        }

        System.out.println("Matrix 2:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(m2[i][j]);
            }
        }

        System.out.println("Sum:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sum[i][j]);
            }
        }
        sc.close();

    }
    
}
