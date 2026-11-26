import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Largest element:");
        int larg=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        System.out.println(larg);

        System.out.println("Smallest element:");
        int small=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);

        System.out.println("Enter the element to search");
        int key=sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.printf("Element found at index %d",i);
            }
        }

        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        sc.close();

    }
    
}
