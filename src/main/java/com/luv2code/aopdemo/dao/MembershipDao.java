package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
	
	public void addAccount() {
		System.out.println(getClass() + ": Doing my DB work - adding an account");
	}

}
