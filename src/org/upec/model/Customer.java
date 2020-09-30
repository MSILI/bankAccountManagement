package org.upec.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long num;
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private List<Account> accounts = new ArrayList<Account>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long num, String firstName, String lastName, LocalDate birthDay) {
		super();
		this.num = num;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (num ^ (num >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [num=" + num + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay
				+ "]";
	}

}
