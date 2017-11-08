    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;
 import java.util.Scanner;
 import java.text.NumberFormat;
/**
 * A bank where accounts can be opened and customers can 
 * make transactions.
 */
 public class Bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                String firstName;
                String lastName; 
                String address;
                String province; 
                String posCode; 
                String city; 
                
                System.out.println("What city do you live in: ");
                city = input.nextLine(); 
                
                System.out.println("Enter your first name: ");
                firstName = input.nextLine();
                
                System.out.println("Enter your last name");
                lastName = input.nextLine();
                
                System.out.println("Enter your address: ");
                address = input.nextLine(); 
                
                System.out.println("Please enter the provice you live in: ");
                province= input.nextLine(); 
                
                System.out.println("Please enter your postal code :");
                posCode = input.nextLine();  
                
                
                
                Account munozAccount = new Account(250, firstName, lastName, address, city, province, posCode);
		
		double data;
               
                
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
               
                
                
                System.out.println("Enter your postal code: ");
                
                
                
		//System.out.println(munozAccount);
                                		
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));	
	}
}