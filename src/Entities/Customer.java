package Entities;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	private int id;
	private String firstname;
	private String lastname;
	private int dateofbirth;
	private String nationalityid;
	
	
	public Customer () {}


	public Customer(int id, String firstname, String lastname, int dateofbirth, String nationalityid) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.nationalityid = nationalityid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public String getNationalityid() {
		return nationalityid;
	}


	public void setNationalityid(String nationalityid) {
		this.nationalityid = nationalityid;
	}
	
	

}
