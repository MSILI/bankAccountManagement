package org.upec;

import java.time.LocalDate;

import org.upec.model.CurrentAccount;
import org.upec.model.Customer;
import org.upec.model.SavingAccount;

public class Application {

	public static void main(String[] args) {
		System.out.println("=== creation d'un client ===");
		Customer customer = new Customer(1L, "DOE", "John", LocalDate.of(1990, 10, 24));
		System.out.println(customer);

		System.out.println("\n\n=== creation d'un compte epargne ===");
		SavingAccount savingAccount = new SavingAccount(1234567L, 10000, LocalDate.now(), customer, 1.6,
				LocalDate.of(2022, 9, 29));
		System.out.println("compte epargne : " + savingAccount);
		System.out.println("retirer 1000 euros du solde du compte epargne : ");
		savingAccount.withDraw(1000);
		System.out.println("nouveau solde compte epargne : " + savingAccount.getSolde() + " euros");
		System.out.println("déposer 3000 euros du solde du compte epargne : ");
		savingAccount.deposit(3000);
		System.out.println("nouveau solde compte epargne : " + savingAccount.getSolde() + " euros");

		System.out.println("\n\n=== creation d'un compte courant ===");
		CurrentAccount currentAccount = new CurrentAccount(2L, 50000, LocalDate.of(1993, 10, 24), customer,
				122234343499986L, 300);
		System.out.println("compte courant : " + currentAccount);
		System.out.println("retirer 10000 euros du solde du compte courant : ");
		currentAccount.withDraw(10000);
		System.out.println("nouveau solde compte courant : " + currentAccount.getSolde() + " euros");
		System.out.println("déposer 5000 euros du solde du compte courant : ");
		currentAccount.deposit(5000);
		System.out.println("nouveau solde compte courant : " + currentAccount.getSolde() + " euros");

	}

}
