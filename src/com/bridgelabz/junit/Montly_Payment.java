package com.bridgelabz.junit;
import java.util.Scanner;
public class Montly_Payment {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter principal ,year and rate");
            double p = s.nextDouble();
            double y = s.nextDouble();
            double r = s.nextDouble();
            System.out.println("mothly payment is " + Util.monthlyPayment(p, y, r));
        }
    }
