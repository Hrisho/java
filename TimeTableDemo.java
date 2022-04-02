
package javaapplication1;

import java.util.Scanner;


public class TimeTableDemo {
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in);
        int num;
        System.out.println("Enter Any Number :");
         num = input.nextInt();
         for (int i = 0; i < 10; i++) {
             
             System.out.println(num+" X "+i + "="+num*i);
        }
         
    }
}
