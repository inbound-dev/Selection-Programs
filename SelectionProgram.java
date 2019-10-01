/*
 * This Program takes a user input on the GUI and calculates, Cost, Taxes, etc.
 * 
 * 
 */

package selection.program;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class SelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);
        System.out.println("How Much Did You Spend?");
        int spent;
        spent = input.nextInt();
        
        // % saved figures
        int savings = 10;
        int savings1 = 20;
        int savings2 = 30;
        int savings3 = 40;
        
        //Savings calculation figures
        int bracket1 = 10 * spent/100;
        int bracket2 = 20 * spent/100;
        int bracket3 = 30 * spent/100;
        int bracket4 = 40 * spent/100;
        
        // Amount spent calculation figures
        int spent1 = spent - bracket1;
        int spent2 = spent - bracket2;
        int spent3 = spent - bracket3;
        int spent4 = spent - bracket4;
        
        if (spent >= 0.01 && spent <= 40.00){
            System.out.println("You Spent: $" + spent1);
            System.out.println("You are Saving %" + savings);
            System.out.println("You are Saving $" + bracket1);
            
        }
        if (spent >= 40.01 && spent <= 80.00){
            System.out.println("You Spent: $" + spent2);
            System.out.println("You are Saving %" + savings1);
            System.out.println("You are Saving $" + bracket2);
        }
        
        if (spent >= 80.01 && spent <= 120.00){
            System.out.println("You Spent: $" + spent3);
            System.out.println("You are Saving %" + savings2);
            System.out.println("You are Saving $" + bracket3);
            
        }
        
        if (spent >= 120){
            System.out.println("You Spent: $" + spent4);
            System.out.println("You are Saving %" + savings3);
            System.out.println("You are Saving $" + bracket4);
        }
        
    }
    
}
