package Week0.Day2;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        /*
         * int n;
         * Scanner sc = new Scanner (System.in);
         * System.out.println("enter the number of elements:");
         * n = sc.nextInt();
         * 
         * for( int i=0; i<n;i++){
         * System.out.print(" *" + " ");
         */
        /*
         * int n =5 ;
         * for(int i= 1; i <n; i++){
         * for (int j= 1; j <n; j++){
         * System.out.print("*");
         * }
         * System.out. println("*");
         */
        int n = 5;
        /*
         * for(int i=0; i<n;i++){
         * System.out .print( "*" +"");
         * for (int j=1; j<=i; j++);{
         * System.out.println("*");
         */
        for (int i = n; i < n; i++) {
            for (int k= 1; k<=(n-i); k++){
                System.out.print("*");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
            }
        }
}