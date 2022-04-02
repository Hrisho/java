
package javaapplication1;

import java.util.Scanner;


public class SumofNumber {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("Enter Any Number:");
        n = input.nextInt();
        
        System.out.println("Enter Any Number:");
        int  m;
        m = input.nextInt();
         for (int i = m; i <=n; i++) {
             
             sum = sum +i;
            
        }
           System.out.println("the sum is :"+sum);
                
    }
    
}
