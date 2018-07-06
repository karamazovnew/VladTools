/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vladsoft.tools.math;

import java.util.ArrayList;

/**
 * Small library of various math functions
 *
 * @author Vlad
 */
public abstract class Series {

    /**
     * Returns ArrayList of sums of first n integers.
     * <br>
     * <i>example: nSum(5) = 0, 1, 3, 6, 10, 15</i>
     * <br>
     *
     * @param number nTh number to calculate to. Can be negative.
     * @param asArray size of the returned array:
     * <ul>
     * <li> {@code true}, return the entire array.</li>
     * <li> {@code false}, return just the final sum in first element.<br>
     * <i>{@link #nSum(int)} for an alternative</i></li></ul>
     *
     * @return Array of sums
     * @see #nSum(int)
     */
    public static ArrayList<Long> nSum(int number, boolean asArray) {
        ArrayList<Long> result = new ArrayList<>();
        int sign = 1;
        if (number == 0) {
            result.add(0L);
            return result;
        }
        if (number < 0) {
            sign = -1;
        }
        long sum = 0L;
        if (asArray) {
            for (int i = 1; i <= number * sign; i++) {
                sum += (long)(i * sign);
                result.add(sum);
            }
        } else {
            for (int i = 1; i <= number * sign; i++) {
                sum += (long)(i * sign);
            }
            result.add(sum);
        }
        return result;
    }

    /**
     * Returns sum of first n integers.
     * <br>
     * <i>example: nSum(4) = 10</i>
     * <br>
     *
     * @param number nTh number to calculate to. Can be negative.
     * @return sum as integer
     * @see #nSum(int, boolean)
     */
    public static long nSum(int number) {
        long result = 0L;
        int sign = 1;
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            sign = -1;
        }
        for (int i = 1; i <= number * sign; i++) {
            result += (long)(i * sign);
        }
        return result;
    }

    /**
     * Returns ArrayList of products of first n integers.
     * <br>
     * <i>example: factorial(5) = 0, 1, 2, 6, 24, 120</i>
     * <br>
     *
     * @param number nTh number to calculate to. Can be negative.
     * @param asArray size of the returned array:
     * <ul>
     * <li> {@code true}, return the entire array.</li>
     * <li> {@code false}, return just the final products in first element.<br>
     * <i>{@link #factorial(int)} for an alternative</i></li></ul>
     *
     * @return Array of factorial products.
     * @see #factorial(int)
     */
    public static ArrayList<Long> factorial(int number, boolean asArray) {
        ArrayList<Long> result = new ArrayList<>();
        int sign = 1;
        if (number == 0) {
            result.add(0L);
            return result;
        }
        if (number < 0) {
            sign = -1;
        }
        long product = 1L;
        if (asArray) {
            for (int i = 1; i <= number * sign; i++) {
                product = product * (long)(i * sign);
                result.add(product);
            }
        } else {
            for (int i = 1; i <= number * sign; i++) {
                product = product * (long)(i * sign);
            }
            result.add(product);                    
        }
        return result;
    }

    /**
     * Returns product of first n integers.
     * <br>
     * <i>example: factorial(4) = 24</i>
     * <br>
     *
     * @param number nTh number to calculate to. Can be negative.
     * @return Factorial product as integer.
     * @see #factorial(int, boolean)
     */
    public static long factorial(int number) {
        long result = 1L;
        int sign = 1;
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            sign = -1;
        }
        for (int i = 1; i <= number * sign; i++) {
            result = result * (long)(i * sign);
        }
        return result;
    }

    /**
     * Returns ArrayList of first n Fibonacci numbers.
     * <br>
     * <i>example: fibonacci(5) = 0, 1, 1, 2, 3, 5</i>
     * <br>
     *
     * @param number nTh number to calculate to. Must be positive.
     * @param asArray size of the returned array:
     * <ul>
     * <li> {@code true}, return the entire array.</li>
     * <li> {@code false}, return just the final number in first element.<br>
     * <i>{@link #fibonacci(int)} for an alternative</i></li></ul>
     *
     * @return Array of Fibonacci numbers.
     * @see #fibonacci(int)
     */
    public static ArrayList<Long> fibonacci(int number, boolean asArray) {
        ArrayList<Long> result = new ArrayList<>();
        if (number <= 0) {
            result.add(0L);
            return result;
        }
        else if(number==1){
            if(asArray) result.add(0L);
            result.add(1L);
            return result;
        }
        else{
            long fibo = 0L;
            long prev1 = 1L;
            long prev2 = 0L;
            if(asArray){
                result.add(0L);
                result.add(1L);
                for (int i = 2; i <= number; i++) {
                    fibo = prev1 + prev2;
                    prev2 = prev1;
                    prev1 = fibo;
                    result.add(fibo);
                }                
            } else {
                for (int i = 2; i <= number; i++) {
                    fibo = prev1 + prev2;
                    prev2 = prev1;
                    prev1 = fibo;                    
                }                
                result.add(fibo);                
            }
            return result;
        } 
    }

    /**
     * Returns nth Fibonacci number.
     *
     * @param number nTh number to calculate to. Must be positive.
     * @return nth Fibonacci number.
     * @see #fibonacci(int, boolean)
     */
    public static long fibonacci(int number) {
        long result = 0L;
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            long prev1 = 1L;
            long prev2 = 0L;
            for (int i = 2; i <= number; i++) {
                result = prev1 + prev2;
                prev2 = prev1;
                prev1 = result;
            }
            return result;
        }
    }

}
