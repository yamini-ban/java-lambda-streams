package com.knoldus.model;

@FunctionalInterface
public interface Sum {
    /**
     * The method adds all the parameter values.
     * @param num1 is first number.
     * @param num2 is second number.
     * @param num3 is third number.
     * @param num4 is fourth number.
     * @param num5 is fifth number
     * @return sum of all the numbers.
     */
    int sum(int num1, int num2, int num3, int num4, int num5);
}
