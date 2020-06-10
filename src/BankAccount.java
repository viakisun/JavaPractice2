public class BankAccount {
	private String mAccount;
	private String mAccountHolder;
	private int mAmount;
	
	public BankAccount(String account, String holder, int amount)
	{
		mAccount = account;
		mAccountHolder = holder;
		mAmount = amount;
	}
	
	public void deposit(int amount)
	{
		mAmount += amount;
		
		String strFormat = "%d 원 입금합니다.%n";
		System.out.printf(strFormat, amount);
		
		printAmount();
	}
	
	public void withDraw(int amount)
	{
		mAmount -= amount;
		
		String strFormat = "%d 원 출금합니다.%n";
		System.out.printf(strFormat, amount);
		
		printAmount();
	}
	
	private void printAmount()
	{
		String strFormat = "잔액: %d 원%n";
		System.out.printf(strFormat, mAmount);
	}
	
	public void printStatus() {
		String strFormat = "계좌 %s (예금주:%s)%n잔액: %d 원%n";
		System.out.printf(strFormat, mAccount, mAccountHolder, mAmount);
	}
}
