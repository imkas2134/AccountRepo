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

public class BusinessAcct {
    private double businessBal; 
    
    
    /**
     * constructor 
     * Preconditions: none
     * PostConditions: An business account is created with specific parameters
     * @param bal 
     */    
    public BusinessAcct(double bal){
        businessBal = bal;
    }
    /**
     * What this does is that it will return the current balance of the account
     * Pre: none
     * Post: The business account balance will be returned
     * @return 
     */
    public double getBusinessBal() {
	 	return(businessBal);
	}
    
    /**
     * Allows the customer to take money out of the account if there is any
     * Pre: None
     * Post: The balance has been decreased by the amount taken 
     * @param amt 
     */
    public void withdrawal(double amt) {
	 	if (amt <= businessBal) {
                    businessBal -= amt; 
                    takeMoney();
	 	}else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
    
    /**
     * What this does is that it allows for the deposits to be made 
     * Pre: none
     * Post: To add the amount deposit with the current balance.
     * @param amt 
     */
    public void deposit(double amt) {
	 	businessBal += amt;
                
	}
    
    /**
     * What this does is that it charges the customer a specific amount if the accounts value 
     * is less than $500
     * Pre: None
     * Post: The withdrawal amount will deduct an additional $10, only if
     * the accounts value is less than $500
     */
    public void takeMoney () {
        if (businessBal < 500){
            businessBal -=10; 
            
            
        } 
    
    
}
}
