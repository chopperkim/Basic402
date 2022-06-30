package chapter08.exercise.bank;

public abstract class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	/**
	 * 입금
	 * @param amount: 금액
	 */
	public void deposit(int amount) {
		this.balance += amount;
	}
	/**
	 * 출금
	 * @param amount: 금액
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	/**
	 * 이체
	 * @param amount: 금액
	 * @param otherAccount: 계좌번호
	 * @return
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	public abstract String getAccountType();

	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
