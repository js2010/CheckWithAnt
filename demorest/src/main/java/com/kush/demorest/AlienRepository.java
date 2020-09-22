package com.kush.demorest;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class AlienRepository {
	
	List<Alien> aliens;
	//This is assumed to be a database
	public AlienRepository() {
		aliens = new ArrayList();
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Jyoti");
		a1.setPoints(79);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("Shivam");
		a2.setPoints(69);
		
		aliens.add(a1);
		aliens.add(a2);
		
	}
	
	public List<Alien> getAliens() {
		return aliens;
	}
	
	public Alien getAlien(int id) {		
		for(Alien a : aliens)
		{
			if(a.getId()==id)
			{
				return a;
			}
		}
		return null;
	}

	public void create(Alien a) {
		aliens.add(a);
	}

}
