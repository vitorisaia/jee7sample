package com.isaia.rest.customer;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class CustomerDBBean {

	private List<Customer> customers;

	public CustomerDBBean() {
	}

	@PostConstruct
	public void load() {
		System.out.println("Construction of " + this);
		customers = new ArrayList<Customer>();

		customers.add(new Customer("biro biro", "urubull"));
		customers.add(new Customer("old garey", "franch"));
		customers.add(new Customer("two times", "mauritius"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.isaia.rest.customer.ICustomerDB#getCustomers()
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.isaia.rest.customer.ICustomerDB#add(com.isaia.rest.customer.Customer)
	 */
	public void add(final Customer customer) {
		customers.add(customer);
	}
}