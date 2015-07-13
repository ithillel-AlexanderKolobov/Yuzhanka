package org.hillel.it.yuzhanka.model.entity;



import org.hillel.it.yuzhanka.model.enums.Currency;
import org.hillel.it.yuzhanka.model.enums.PaymentMethod;

/**
 * Entity that form bill and way of payment
 * @author Лаборант
 *
 */

public class Payment extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PaymentMethod paymentMethod;// 0 - наличные 1 - картой через интернет 2-картой на месте  3 - денежный перевод...
	
	private int amount;
	
	private Currency currencyId;// 0-uah 1-usd 2-eur
	
	private User client;//как назвать?
	
	
	
	
		
	
	public Payment(PaymentMethod paymentMathod, int amount,
			Currency currencyId, User client) {
		this.paymentMethod = paymentMathod;
		this.amount = amount;
		this.currencyId = currencyId;
		this.client = client;
	}

	public Payment(){
		
	}

	public int getAmount() {
		return amount;
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

	
	
	public PaymentMethod getPaymentMathod() {
		return paymentMethod;
	}

	public void setPaymentMathod(PaymentMethod paymentMathod) {
		this.paymentMethod = paymentMathod;
	}

	public Currency getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Currency currencyId) {
		this.currencyId = currencyId;
	}

	
}
