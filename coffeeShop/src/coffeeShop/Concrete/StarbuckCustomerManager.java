package coffeeShop.Concrete;
import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Abstract.ICustomerCheckService;
import coffeeShop.Abstract.ICustomerService;
import coffeeShop.Concrete.Entities.Customer;



public class StarbuckCustomerManager extends BaseCustomerManager implements ICustomerCheckService {
	
	private ICustomerCheckService customerCheckService;
	
	
	BaseCustomerManager base;

	@Override
	public void CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	
	



	

	
}
