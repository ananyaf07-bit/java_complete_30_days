package day5;
import java.util.Scanner;
public class PackageDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner needs to be imported bcs it is part of java.util

        System.out.println("Enter your name");
        String name=sc.next();//but string isn't bcs java.lang is accessible w/o importing

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);

    }
    
}
