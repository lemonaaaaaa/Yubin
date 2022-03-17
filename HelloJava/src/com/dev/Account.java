package com.dev;

public class Account {
	// 계좌정보, 예금주, 예금액
	private String accNo;
	private String accName;
	private int money;

	// constructor (생성자). 목적은 필드의 초기값을 지정
	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}

	// method.
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
