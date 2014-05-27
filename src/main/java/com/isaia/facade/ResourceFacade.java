package com.isaia.facade;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Stateless
public class ResourceFacade {

	private Client client;

	@PostConstruct
	public void init() {
		client = ClientBuilder.newClient();
	}

	public <T> T fetchResource(T desired, String target, String... path) {
		WebTarget resource = client.target(target);

		for (String thePath : path) {
			resource = resource.path(addPath(thePath));
		}

		return desired;
	}

	private String addPath(String thePath) {
		return "{".concat(thePath).concat("}");
	}

	@PreDestroy
	public void destroy() {
		client.close();
	}

}
