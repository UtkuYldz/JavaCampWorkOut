package coffeeShop.Abstract;


import coffeeShop.Concrete.Entities.Customer;

public abstract interface ICustomerCheckService {
	
	void CheckIfRealPerson(Customer customer);

}
