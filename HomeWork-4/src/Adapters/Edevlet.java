package Adapters;

import Entities.Customer;

public class Edevlet {
	public void CheckPerson(Customer customer) {
		
		if(customer.getNationalNum().length() == 11) {
			System.out.println("Oyuncu do�ruland�.");
		}else {
			System.out.println("Oyuncu do�rulanmad�.");
		}
		
		
		
	}
	

	

}
