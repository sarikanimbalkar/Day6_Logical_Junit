package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNum {
    static void PerfectNum()
    {
        int i, Number, Sum = 0 ;
       Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any Number: ");
        Number = sc.nextInt();
        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.format(Number + "  is a Perfect Number");
        }
        else {
            System.out.format(Number + "  is a Perfect Number");
        }
    }
    public static void main(String[] args) {
        PerfectNum();
    }
}
