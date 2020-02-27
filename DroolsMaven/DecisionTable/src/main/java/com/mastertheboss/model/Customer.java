package com.mastertheboss.model;


import java.util.List;

public class Customer {

	private int age;
	private int discount;
	private String name;

	public com.mastertheboss.model.nestedCustomer getNestedCustomer() {
		return nestedCustomer;
	}

	public void setNestedCustomer(com.mastertheboss.model.nestedCustomer nestedCustomer) {
		this.nestedCustomer = nestedCustomer;
	}

	private nestedCustomer nestedCustomer;

	public List<String> getPurposes() {
		return purposes;
	}

	public void setPurposes(List<String> purposes) {
		this.purposes = purposes;
	}

	private List<String> purposes;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return name + ", " + nestedCustomer.getNestedName() + "," + getPurposes();
	}

}