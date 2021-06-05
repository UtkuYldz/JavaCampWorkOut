package coffeeShop.Abstract;

import coffeeShop.Concrete.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public  void Save(Customer customer) {
		
		if(customer.getNationalNum().length()==11) {
		System.out.println("Saved to db : " + "\n"+"\n"+customer.getFirstName() +" "+
				customer.getLastName()+"\n"+ customer.getNationalNum()+"\n"+
				customer.getPhoneNum()+"\n"+
				customer.getLocaldate());
		}else {
			System.out.println("Bilgiler doðrulanamadý.");
		}
		}

	
}
