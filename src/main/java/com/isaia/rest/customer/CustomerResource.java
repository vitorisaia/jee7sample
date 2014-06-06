package com.isaia.rest.customer;

import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

	@EJB
	private CustomerDBBean customerDB;

	@Inject
	private CustomerHelloSayer customerHelloSayer;

	@GET
	@Path("fetchall")
	public List<Customer> fetchCustomers() {
		customerHelloSayer.sayHello();
		return this.customerDB.getCustomers();
	}

	@POST
	@Path("create")
	@Consumes("application/json")
	public void consumeJSON(Customer customer) {
		this.customerDB.add(customer);
	}
}
