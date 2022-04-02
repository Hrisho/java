
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter Any Number:");
        n = input.nextInt();
         
        for (int i = 0; i <=n; i++) {
            
            if ( i==10){
                
                break;
            
        }
            System.out.println(i);
    }
   
    
}
}
