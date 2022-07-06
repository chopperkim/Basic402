package chapter10.exercise;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	/**
	 * 잔액
	 * SavingsAccount: 5,000원
	 * CheckingAccount: 10,000원
	 * 1. 백지수표로 7,000원짜리 물건을 구매한 경우
	 * 
	 * 2. 백지수표로 13,000원짜리 물건 구매한 경우
	 * SavingsAccount - (amount - CheckingAccount)
	 * CheckingAccount는 0원으로 만든다.
	 */
	@Override
	public boolean withdraw(int amount) {
		if (!super.withdraw(amount)) {
			protectedBy.withdraw(amount - this.balance);
//			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		}
		return true;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}

}
