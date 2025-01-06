package oop_project;

import java.util.Scanner;
import java.util.Date;


public abstract  class Shape implements Drawable
 {
	private Date dateCreated;
	private String color;
	
	public Shape ()
	{
		this.dateCreated = new Date();
		this.color="red";
	}
	
	
	public Shape(String color) {
		super();
		this.color = color;
		this.dateCreated = new Date();
	}
	public Shape(Date dateCreated, String color) {
		super();
		this.dateCreated = dateCreated;
		this.color = color;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();

	





	public static void main(String[] args) {
		

	}

}

