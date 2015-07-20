package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Entity ithat represent user of the application
 * 
 * @author Ћаборант
 *
 */
public class User extends BaseEntity {

	private String email; // об€зательное поле. ƒолжно сохран€ть уникальность.
							// Ѕудет использоватьс€ дл€ авторизации
	private String password; // скорее всего HASH а не сам пароль. ≈сли человек
								// оставл€ет бронь без регистрации выслать на
								// почту письмо с данными дл€ входа и
								// сгенерированным паролем
	private String lastName;
	private String firstName;
	private String patronymic;
	private Date dateOfBirdh;
	private String homeAddress;
	private String passportSerieAndNumber;
	private String passportWhereAndWhenHanded;
	private ArrayList<Payment> payments;
	private boolean admin;
	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public User(String email, String password, String lastName, String firstName, String patronymic, Date dateOfBirdh,
			String homeAddress, String passportSerieAndNumber, String passportWhereAndWhenHanded) {

		this.email = email;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.dateOfBirdh = dateOfBirdh;
		this.homeAddress = homeAddress;
		this.passportSerieAndNumber = passportSerieAndNumber;
		this.passportWhereAndWhenHanded = passportWhereAndWhenHanded;
		payments = new ArrayList<>();
	}

	public User() {
		payments = new ArrayList<>();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getDateOfBirdh() {
		return dateOfBirdh;
	}

	public void setDateOfBirdh(Date dateOfBirdh) {
		this.dateOfBirdh = dateOfBirdh;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPassportSerieAndNumber() {
		return passportSerieAndNumber;
	}

	public void setPassportSerieAndNumber(String passportSerieAndNumber) {
		this.passportSerieAndNumber = passportSerieAndNumber;
	}

	public String getPassportWhereAndWhenHanded() {
		return passportWhereAndWhenHanded;
	}

	public void setPassportWhereAndWhenHanded(String passportWhereAndWhenHanded) {
		this.passportWhereAndWhenHanded = passportWhereAndWhenHanded;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password
				+ ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	

}
