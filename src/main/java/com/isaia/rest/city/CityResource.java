package com.isaia.rest.city;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("city")
@Produces(MediaType.APPLICATION_JSON)
public class CityResource {

	@GET
	@Path("{cityName}")
	public City fetchCity(@PathParam("cityName") String cityName) {
		return new City(cityName); // just that now
	}
}
