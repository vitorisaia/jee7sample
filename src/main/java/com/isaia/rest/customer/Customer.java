package com.isaia.rest.customer;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	// required
	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}

	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}

	private String name;

	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
