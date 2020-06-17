package com.via.practice;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

//TODO:vincent : Use ArrayList
//TODO:vincent : Use Dictionary

public class BankAccountManager {
	// private BankAccount[] mBankAccounts = new BankAccount[100];
	private ArrayList<BankAccount> mBankAccounts;
	// private Dictionary mBankDic;

	public BankAccountManager() {
		mBankAccounts = new ArrayList<BankAccount>();
		// mBankDic = new Hashtable();
	}

	public boolean addAccount(String account, String holder, int amount) {
		// TODO:vincent : Check duplicated account
		for (BankAccount ba : mBankAccounts) {
			if (ba.getAccountName() == account)
				System.out.println("error msg");
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
