package coffeeShop;

import java.time.LocalDate;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Adapters.MernisServiceAdapter;
import coffeeShop.Concrete.StarbuckCustomerManager;
import coffeeShop.Concrete.Entities.Customer;
import coffeeShop.Concrete.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		
		customerManager.Save(new Customer ("Utku", "Yýldýz", "12312312312",
				LocalDate.of(1992, 11, 5), "5071239152"));
		

		
		
		
		

	}

}
