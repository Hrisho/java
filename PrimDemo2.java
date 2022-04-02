
package javaapplication1;

import java.util.Scanner;


public class PrimDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Any Numbner:");
        int num = input.nextInt();
        int count=0,m = 0;
        
        for (int i =m; i <num; i++) {
            
        
           for (int j = 2; i <i-1; j++) {
            
            if (num%i==0){
                count++;
                break;
            }
        }
            if(count==0){
                System.out.println("prime number");
            }
            else{
                System.out.println("not a prime number");
            }
            
        }
    
  }
}
