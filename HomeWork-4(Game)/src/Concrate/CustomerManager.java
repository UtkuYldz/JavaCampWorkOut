package Concrate;

import java.time.LocalDate;

import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{

	

	@Override
	public void add(Customer customer) {
		System.out.println("Oyuncu Eklendi.. \n"+customer.getFirstName()+
				" "+customer.getLastName()+"\nLevel: "+customer.getLevel()+"\nSevilen Oyun Türü: "
				+customer.getGamertype()+"\nMevcut para: "+customer.getMoney());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Bilgiler silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Bilgiler güncellendi.");
		
	}

	


}
