package org.example;

import java.util.function.DoubleUnaryOperator;

public class ejer02 {
    public static void main(String[] args) {
        tabFunc(-2.0 * Math.PI, 2.0 * Math.PI, Math.PI / 6.0, Math::cos);
        System.out.println("---------------");

        tabFunc(-2.0 * Math.PI, 2.0 * Math.PI, Math.PI / 6.0, ejer01::fb);
        System.out.println("---------------");

        tabFunc(-2.0 * Math.PI, 2.0 * Math.PI, Math.PI / 6.0, (x) -> (-Math.pow(x / Math.PI, 2.0) - 2.0 * x + 5.0 * Math.PI));
        System.out.println("---------------");

        DoubleUnaryOperator f = (x) -> {
            double s = 0.0;
            for (int k = 1; k <= 100; k++) {
                s += Math.pow(x / (Math.PI * k) - 1.0, 2.0);
            }
            return s;
        };

        tabFunc(-2.0 * Math.PI, 2.0 * Math.PI, Math.PI / 6.0, f);
        System.out.println("---------------");


        tabFunc(-2.0 * Math.PI, 2.0 * Math.PI, Math.PI / 6.0, new DoubleUnaryOperator() {


            public double applyAsDouble(double x) {
                if (x < 0) {
                    return 0.25 * Math.sin(x) * Math.sin(x) + 1.0;
                }

                return 0.5 * Math.cos(x) - 1.0;
            }
        });
        System.out.println("---------------");


    }


    public static double fb(double x) {
        return 2.0 * Math.sqrt(Math.abs(x - 1.0)) + 1.0;
    }

    public static void tabFunc(double a, double b, double dx, DoubleUnaryOperator f) {
        for (double x = a; x < b + dx; x += dx) {
            System.out.println(" x = " + x + "\t f(x) = " + f.applyAsDouble(x));
        }
    }
}