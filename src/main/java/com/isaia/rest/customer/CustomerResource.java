package com.isaia.rest.customer;

import java.util.List;

import javax.ejb.EJB;
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

	@GET
	@Path("fetchall")
	public List<Customer> fetchCustomers() {
		return this.customerDB.getCustomers();
	}

	@POST
	@Path("create")
	@Consumes("application/json")
	public void consumeJSON(Customer customer) {
		this.customerDB.add(customer);
	}
}
