package Adapters;

import Entities.Customer;

public class Edevlet {
	public void CheckPerson(Customer customer) {
		
		if(customer.getNationalNum().length() == 11) {
			System.out.println("Oyuncu doğrulandı.");
		}else {
			System.out.println("Oyuncu doğrulanmadı.");
		}
		
		
		
	}
	

	

}
