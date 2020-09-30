package org.upec.model;

import java.time.LocalDate;

public class CurrentAccount extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long creditCardNumber;
	private double overDaft;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, double solde, LocalDate creationDate, Customer customer,
			long creditCardNumber, double overDaft) {
		super(accountNumber, solde, creationDate, customer);
		this.creditCardNumber = creditCardNumber;
		this.overDaft = overDaft;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public double getOverDaft() {
		return overDaft;
	}

	public void setOverDaft(double overDaft) {
		this.overDaft = overDaft;
	}

	public void simulateSaving() {
		System.out.println("je ne sais pas quoi implémenter ici !");
	}

	@Override
	public void withDraw(double soldeInput) {
		if (this.getSolde() - soldeInput >= -overDaft) {
			setSolde(this.getSolde() - soldeInput);
		} else {
			throw new RuntimeException("vous avez droit jusqu'à " + overDaft + " euros en découvert seulement");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = (int) (prime * result + creditCardNumber);
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
		CurrentAccount other = (CurrentAccount) obj;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditCardNumber=" + creditCardNumber + ", overDaft=" + overDaft + ", accountNumber="
				+ this.getAccountNumber() + ", solde=" + this.getSolde() + ", creationDate="
				+ this.getCreationDate().toString() + ", customer" + this.getCustomer() + "]";
	}

}
