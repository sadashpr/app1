package com.bulletproof;

public class Customer {

    private static long counter = 1;

    private long id;
    private String firstname;
    private String lastname;
    private String city;

    public Customer(String firstname, String lastname, String city) {

	this.id = counter++;
	// TODO use UUID.randomUUID().toString() later
	this.firstname = firstname;
	this.lastname = lastname;
	this.city = city;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
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

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    @Override
    public String toString() {
	return "Customer [ ID =" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
    }

}
