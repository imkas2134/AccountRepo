/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Account;

/**
 *
 * @author imkas2134
 */
/**
 * The personal account class will accept deposits and withdrawals 
 * @author imkas2134
 */
public class PersonalAcct {
    private double personalBal;
    
    /**
     * constructor 
     * pre: none
     * Post: A personal account is created. The account has been initialized with parameters 
     * @param bal 
     */
    public PersonalAcct(double bal){
        personalBal = bal;
    }
    /**
     * This will get the personal accounts balance 
     * Pre: none
     * Post: the account balance has been returned 
     * @return 
     */
    public double getPersonalBal() {
	 	return(personalBal);
	}
    
    /**
     * Allows the customer to take money out of their account if their is enough 
     * money
     * pre: none
     * Post: The balance will decrease by amount taken out
     * @param amt 
     */
    
    public void withdrawal(double amt) {
	 	if (amt <= personalBal) {
                    personalBal -= amt; 
                    takeMoney();
	 	}else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
    
    /**
     * Allows the customer to save money into the account 
     * pre: none
     * Post: The balance will increase by the amount deposited 
     * @param amt 
     */
    public void deposit(double amt) {
	 	personalBal += amt;
                
	}
     /** 
	 * A charging is made from the account if balance is less than $100.
	 * pre: none
	 * post: The balance will be charged $2 if the amount is less than $100.
	 */        
    
    public void takeMoney () {
        if (personalBal < 100){
            personalBal -=2; 
            
            
        } 
        
        
    }
    
  

    
}
