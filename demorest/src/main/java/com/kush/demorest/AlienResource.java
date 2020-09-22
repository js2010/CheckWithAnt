package com.kush.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.*;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();
	//@PUT- To update a Resource
	//@DELETE - To delete a Resource
	
	//To fetch Resource
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alien> getAliens()
	{
		System.out.println("getAliens Called...");

		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id")int id)
	{
		return repo.getAlien(id);
	}
	
	//To create a Resource OR send Data
	@POST
	@Path("alien")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien createAlien(Alien a)
	{
		System.out.println("createAlien called.. "+a);
		repo.create(a);
		return a;
	}
	
	//MySQL + JDBC
	
}
