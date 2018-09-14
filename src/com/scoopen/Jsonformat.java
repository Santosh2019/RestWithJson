package com.scoopen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class Jsonformat {

	
	@GET
	@Path("/{cusNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer produceDetails(@PathParam("cusNo") int no) {
		
		 Customer cust = new Customer();        
         cust .setCustNo(no);
         cust .setCustName("Santoshfsdf");
         cust .setCustCity("Limbale");
         		return cust;
		
		
		
	}
		
		
	
	
	
}
