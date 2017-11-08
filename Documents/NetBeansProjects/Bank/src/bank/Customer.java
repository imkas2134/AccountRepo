/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;
/**
 * Customer class.
 */
public class Customer {
	private String firstName, lastName, street, city, province, postal;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	
        public Customer(String fName, String lName, String str, String c, String pr, String p) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		province = pr;
		postal = p;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
                
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + province + "  " + postal + "\n";
	 	return(custString);
	}
}
