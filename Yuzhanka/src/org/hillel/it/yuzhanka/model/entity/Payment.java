package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class Payment extends BaseEntity{
	private int paymentMethodId;// 0 - �������� 1 - ������ ����� �������� 2-������ �� �����  3 - �������� �������...
	private int amount;
	private int currencyId;// 0-uah 1-usd 2-eur
	private User client;//��� �������?
	
		
	public int getAmount() {
		return amount;
	}

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public void setPaymentMethodId(int paymentMethod) {
		this.paymentMethodId = paymentMethod;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	
	String getPaymentMethodName() {
		switch (paymentMethodId) {
		case 0:
			return "��������";
		case 1:
			return "������ ������ ����� ��������";
		case 2:
			return "������ ������ �� �����";
		case 3:
			return "�������� �������";	
		}
		System.out.println("����������� ������ ������");
		return null;	
	}
	
	String getCurrencyName() {
		switch (currencyId) {
		case 0:
			return "UAH";
		case 1:
			return "USD";
		case 2:
			return "EUR";	
		}
		System.out.println("����������� ������");
		return null;	
	}
	
}
