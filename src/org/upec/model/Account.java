package org.upec.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountNumber;
	private double solde;
	private LocalDate creationDate;
	private Customer customer;

	public Account() {
	}

	public Account(long accountNumber, double solde, LocalDate creationDate, Customer customer) {
		this.accountNumber = accountNumber;
		this.solde = solde;
		this.creationDate = creationDate;
		this.customer = customer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void deposit(double soldeInput) {
		this.setSolde(this.getSolde() + soldeInput);
	}
	
	public void withDraw(double soldeInput) {
		if(this.solde >= soldeInput) {
			this.setSolde(this.getSolde() - soldeInput);
		} else {
			throw new RuntimeException("solde insuffisant pour retirer de l'argent!");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", solde=" + solde + ", creationDate=" + creationDate
				+ ", customer=" + customer + "]";
	}

}
