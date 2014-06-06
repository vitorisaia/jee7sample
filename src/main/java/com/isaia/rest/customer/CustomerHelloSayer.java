package com.isaia.rest.customer;

import org.apache.log4j.Logger;

public class CustomerHelloSayer {

	public void sayHello() {
		Logger.getLogger(this.getClass()).info("I'm saying hello.");
	}

}
