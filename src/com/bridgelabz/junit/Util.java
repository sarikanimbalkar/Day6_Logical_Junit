package com.bridgelabz.junit;

public class Util {
        static int dayOfWeek(int d, int m, int y) {
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;
            return d0;
        }

        static double monthlyPayment(double p, double y, double r) {
            double n = 12 * y;
            double r1 = r / (12 * 100);
            double payment = p * r1 / (1 - Math.pow((1 + r1), -n));
            return payment;
        }
        static double sqrt(double c) {

            double t = c;
            double epsilon = 1e-15;
            while (Math.abs(t - c / t) > epsilon * t) {
                t = (c / t + t) / 2;
            }
            return t;
        }
     }



