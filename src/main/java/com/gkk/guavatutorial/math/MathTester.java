package com.gkk.guavatutorial.math;

import com.google.common.math.IntMath;

import java.math.RoundingMode;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class MathTester {
    public static void main(String args[]) {
        MathTester tester = new MathTester();
        tester.testIntMath();
    }

    private void testIntMath() {
        try {
            System.out.println(IntMath.checkedAdd(Integer.MAX_VALUE, Integer.MAX_VALUE));

        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(IntMath.divide(100, 5, RoundingMode.UNNECESSARY));
        try {
            //exception will be thrown as 100 is not completely divisible by 3
            // thus rounding is required, and RoundingMode is set as UNNESSARY
            System.out.println(IntMath.divide(100, 3, RoundingMode.UNNECESSARY));

        }catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Log2(2): " + IntMath.log2(2, RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + IntMath.log10(10, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + IntMath.sqrt(IntMath.pow(10,2), RoundingMode.HALF_EVEN));

        System.out.println("gcd(100,50): " + IntMath.gcd(100,50));

        System.out.println("modulus(100,50): " + IntMath.mod(100,50));

        System.out.println("factorial(5): " + IntMath.factorial(5));
    }
}
