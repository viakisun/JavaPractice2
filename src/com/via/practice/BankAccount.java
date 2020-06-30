package com.via.practice;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * The BankAccount program implements an application that can create bank
 * account and deposit, withdraw money.
 *
 * @author Vincent Park
 * @version 0.1
 * @since 2020-06-12
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
		if (!isPositiveAmount(amount))
			return false;

		mAmount += amount;
		System.out.printf(CommonMessage.MSG_BANK_DEPOSIT, convertToDecimalFormat(amount));

		printAmount();

		return true;
	}

	public boolean withDraw(int amount) {
		if (!isPositiveAmount(amount))
			return false;
		if (!canWithdraw(amount))
			return false;

		mAmount -= amount;
		System.out.printf(CommonMessage.MSG_BANK_WITHDRAW, convertToDecimalFormat(amount));

		printAmount();
		return true;
	}

	private void printAmount() {
		System.out.printf(CommonMessage.MSG_BANK_AMOUNT, convertToDecimalFormat(mAmount));
	}

	public void printStatus() {
		System.out.printf(CommonMessage.MSG_BANK_STATUS, mAccount, mAccountHolder, convertToDecimalFormat(mAmount));
	}

	public String getAccountName() {
		return mAccount;
	}

	private boolean isPositiveAmount(int amount) {
		if (amount < 0) {
			System.out.println(CommonMessage.MSG_BANK_ERROR_NEGATIVE);
			return false;
		}

		return true;
	}

	private boolean canWithdraw(int amount) {
		if (mAmount - amount < 0) {
			System.out.println(CommonMessage.MSG_BANK_ERROR_NOT_ENOUGH);
			return false;
		}

		return true;
	}

	private String convertToDecimalFormat(int amount) {
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
		nf.setMaximumFractionDigits(3);
		return nf.format(amount);
	}
}
