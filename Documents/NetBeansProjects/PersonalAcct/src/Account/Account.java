/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Account;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author imkas2134
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    /**
     * A bank that keeps track of all your personal and business accounts
     * when making transactions
     * 
     */
    public static void main(String[] args) {
        double paData; 
        double baData;
        Scanner input = new Scanner(System.in);
        
        PersonalAcct PA = new PersonalAcct(100); 
        BusinessAcct BA = new BusinessAcct(500);
        
        System.out.println("Your personal account balance is: " + "$" +(PA.getPersonalBal()));
        System.out.println("Your business account balance is: " + "$" +(BA.getBusinessBal()));
       
        System.out.println("Please enter Withdrawl amount for your personal account: ");
        paData =input.nextDouble();  
        PA.withdrawal(paData);
        System.out.println("Balance is: $" + (PA.getPersonalBal())); 
        
        System.out.println("Please enter Deposit amount for your personal account: ");
        paData =input.nextDouble();
        PA.deposit(paData);
        System.out.println("Balance is: $" + (PA.getPersonalBal()));
                
        
        System.out.println("Please enter Deposit amount for your Business account: "); 
        baData = input.nextDouble();
        BA.deposit(baData);
        System.out.println("Balance is: $" + (BA.getBusinessBal()));
        
        System.out.println("Please enter withdrawl amount for your Business account: ");
        baData = input.nextDouble();
        BA.withdrawal(baData); 
        System.out.println("Balance is: $" + (BA.getBusinessBal()));
        
        
        
    }
    
}
