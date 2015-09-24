package org.hillel.it.yuzhanka.model.entity;



import javax.persistence.Entity;
import javax.persistence.ManyToOne;


import org.hillel.it.yuzhanka.model.enums.Currency;
import org.hillel.it.yuzhanka.model.enums.PaymentMethod;

/**
 * Entity that form bill and way of payment
 * @author Лаборант
 *
 */
@Entity
public class Payment extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PaymentMethod paymentMethod;// 0 - наличные 1 - картой через интернет 2-картой на месте  3 - денежный перевод...
	
	private int amount;
	
	private Currency currencyId;// 0-uah 1-usd 2-eur
	@ManyToOne
	private User client;
	
			
	
	public Payment(){
		super();
	}

	public Payment(PaymentMethod paymentMathod, int amount,
			Currency currencyId, User client) {
		this.paymentMethod = paymentMathod;
		this.amount = amount;
		this.currencyId = currencyId;
		this.client = client;
	}

	public int getAmount() {
		return amount;
	}

	

	public User getClient() {
		return client;
	}

	public Currency getCurrencyId() {
		return currencyId;
	}

	public PaymentMethod getPaymentMathod() {
		return paymentMethod;
	}

	
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public void setCurrencyId(Currency currencyId) {
		this.currencyId = currencyId;
	}

	public void setPaymentMathod(PaymentMethod paymentMathod) {
		this.paymentMethod = paymentMathod;
	}

	
}
