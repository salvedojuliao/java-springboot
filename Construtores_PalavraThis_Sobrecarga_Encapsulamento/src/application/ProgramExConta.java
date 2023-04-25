package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ExConta;

public class ProgramExConta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double depositValue = 0;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n?)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
			System.out.println();
		}
		
		ExConta account1 = new ExConta(accountNumber, accountName, depositValue);
		
		System.out.println("Account data: ");
		System.out.println(account1);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		account1.setBalance(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(account1);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account1.withdrawBalance(withdrawValue);
		
		System.out.println("Updated accoun data:");
		System.out.println(account1);
	
		
		sc.close();
		
	}
}