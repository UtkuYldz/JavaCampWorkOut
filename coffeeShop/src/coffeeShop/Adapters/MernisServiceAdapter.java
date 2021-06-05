package coffeeShop.Adapters;

import java.rmi.RemoteException;

import coffeeShop.Abstract.ICustomerCheckService;
import coffeeShop.Concrete.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter  implements ICustomerCheckService {

	
	public void CheckIfRealPerson(Customer customer) {

		if(customer.getNationalNum().length()==11) {
			
			System.out.println("Bilgiler doðrulandý.");
			
		}else {
			System.out.println("Bilgiler doðrulanamadý.");
		}
	
	

		
	}

}
