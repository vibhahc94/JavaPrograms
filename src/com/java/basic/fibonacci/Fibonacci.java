//Program to print Fibonacci series
package com.java.basic.fibonacci;

public class Fibonacci {
    public static void main(String[] args)
    {
        int n1 = 0, n2 = 1, n3, n=10;
        System.out.print( n1 +" "+n2);
        for(int i=2;i<n;i++)
        {
            n3= n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }
    }


}
