package com.learn.spring.autowiring.assingment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	@Autowired
	private Reservation reserve;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reserve=" + reserve + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReserve() {
		return reserve;
	}

	public void setReserve(Reservation reserve) {
		this.reserve = reserve;
	}

	public Customer(String name, Reservation reserve) {
		super();
		this.name = name;
		this.reserve = reserve;
	}

}
