
package javaapplication1;

import java.util.Scanner;


public class ContinueStatement {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter Any Number:");
        n = input.nextInt();
         
        for (int i = 0; i<=n; i=i+3) {
            
            if ( i==10){
                
                continue;
            
        }
            System.out.println(i);
    }
   
    
}
    
}
