package org.hillel.it.yuzhanka.model.entity;

/**
 * Entity that form bill and way of payment
 * @author Лаборант
 *
 */

public class Payment extends BaseEntity{
	
	private int paymentMethodId;// 0 - наличные 1 - картой через интернет 2-картой на месте  3 - денежный перевод...
	
	private int amount;
	
	private int currencyId;// 0-uah 1-usd 2-eur
	
	private User client;//как назвать?
	
	
	
	
		
	public Payment(int paymentMethodId, int amount, int currencyId, User client) {
		this.paymentMethodId = paymentMethodId;
		this.amount = amount;
		this.currencyId = currencyId;
		this.client = client;
	}
	public Payment(){
		
	}

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
			return "Наличные";
		case 1:
			return "Оплата картой через интернет";
		case 2:
			return "Оплата картой на месте";
		case 3:
			return "Денежный перевод";	
		}
		System.out.println("Неизвестный способ оплаты");
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
		System.out.println("Неизвестная валюта");
		return null;	
	}
	
}
