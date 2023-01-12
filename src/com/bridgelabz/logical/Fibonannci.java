package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonannci {
    static int n;
    static void Fibonannaci()
    {
        int i = 1, firstTerm = 0, secondTerm = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        n=sc.nextInt();
        while (i <= n) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
        System.out.println("Fibonacci Series of " + n );
    }
    public static void main(String[] args) {
        Fibonannaci();
    }
}
