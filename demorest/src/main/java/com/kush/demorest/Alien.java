package com.kush.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	private String name;
	private int id;
	private int points;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + ", points=" + points + "]";
	}


	
	
}
