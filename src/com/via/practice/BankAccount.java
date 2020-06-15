package com.via.practice;

/**
* The BankAccount program implements an application that
* can create bank account and deposit, withdraw money.
*
* @author  Vincent Park
* @version 0.1
* @since   2020-06-12 
*/

public class BankAccount {
	private String mAccount;
	private String mAccountHolder;
	private int mAmount;

	public BankAccount(String account, String holder, int amount) {
		mAccount = account;
		mAccountHolder = holder;
		mAmount = amount;
	}

	public boolean deposit(int amount) {
		if (!isPositiveAmount(amount)) return false;
		
		mAmount += amount;

		String strFormat = "%d �� �Ա��մϴ�.%n";
		System.out.printf(strFormat, amount);

		printAmount();
		
		return true;
	}

	public boolean withDraw(int amount) {
		if (!isPositiveAmount(amount)) return false;
		if (!canWithdraw(amount)) return false;
		
		mAmount -= amount;

		String strFormat = "%d �� ����մϴ�.%n";
		System.out.printf(strFormat, amount);

		printAmount();
		return true;
	}

	private void printAmount() {
		String strFormat = "�ܾ�: %d ��%n";
		System.out.printf(strFormat, mAmount);
	}

	public void printStatus() {
		String strFormat = "���� %s (������:%s)%n�ܾ�: %d ��%n";
		System.out.printf(strFormat, mAccount, mAccountHolder, mAmount);
	}
	
	private boolean isPositiveAmount(int amount)
	{
		if (amount < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			return false;
		}
		
		return true;
	}
	
	private boolean canWithdraw(int amount)
	{
		if (mAmount - amount < 0) {
			System.out.println("�����޽��� : [����] �ܾ��� �����մϴ�.");
			return false;
		}
		
		return true;
	}
}
