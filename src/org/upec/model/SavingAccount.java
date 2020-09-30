package org.upec.model;

import java.time.LocalDate;

public class SavingAccount extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double rate;
	private LocalDate availableAt;

	public SavingAccount() {
		super();
	}

	public SavingAccount(long accountNumber, double solde, LocalDate creationDate, Customer customer, double rate,
			LocalDate availableAt) {
		super(accountNumber, solde, creationDate, customer);
		this.rate = rate;
		this.availableAt = availableAt;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public LocalDate getAvailableAt() {
		return availableAt;
	}

	public void setAvailableAt(LocalDate availableAt) {
		this.availableAt = availableAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((availableAt == null) ? 0 : availableAt.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (availableAt == null) {
			if (other.availableAt != null)
				return false;
		} else if (!availableAt.equals(other.availableAt))
			return false;
		if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SavingAccount [rate=" + rate + ", availableAt=" + availableAt + ", accountNumber="
				+ this.getAccountNumber() + ", solde=" + this.getSolde() + ", creationDate="
				+ this.getCreationDate().toString() + ", customer" + this.getCustomer() + "]";
	}

}
