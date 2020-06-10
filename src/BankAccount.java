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
		
		String strFormat = "%d �� �Ա��մϴ�.%n";
		System.out.printf(strFormat, amount);
		
		printAmount();
	}
	
	public void withDraw(int amount)
	{
		mAmount -= amount;
		
		String strFormat = "%d �� ����մϴ�.%n";
		System.out.printf(strFormat, amount);
		
		printAmount();
	}
	
	private void printAmount()
	{
		String strFormat = "�ܾ�: %d ��%n";
		System.out.printf(strFormat, mAmount);
	}
	
	public void printStatus() {
		String strFormat = "���� %s (������:%s)%n�ܾ�: %d ��%n";
		System.out.printf(strFormat, mAccount, mAccountHolder, mAmount);
	}
}
