package com.via.practice;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class BankAccountManager {
	private ArrayList<BankAccount> mBankAccounts;

	public BankAccountManager() {
		mBankAccounts = new ArrayList<BankAccount>();
	}

	public boolean addAccount(String account, String holder, int amount) {
		// TODO:vincent : Check duplicated account
		for (BankAccount ba : mBankAccounts) {
			if (ba.getAccountName() == account)
				System.out.println(CommonMessage.MSG_BANK_ERROR_DUPLICATE);
				return false;
		}

		BankAccount ba = new BankAccount(account, holder, amount);
		mBankAccounts.add(ba);
		return true;
	}

	public void removeAccount(String account) {

	}

	public BankAccount getAccount(String account) {
		return null;
	}
}
