package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity ithat represent user of the application
 * 
 * @author Ћаборант
 *
 */
@Entity
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@OneToMany (mappedBy="client")
	private List<Payment> payments;
	@OneToMany (mappedBy="owner")
	private List<Reservation> reservations;
	private boolean admin;
	private boolean active;

	public User() {

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

	}

	public Date getDateOfBirdh() {
		return dateOfBirdh;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassportSerieAndNumber() {
		return passportSerieAndNumber;
	}

	public String getPassportWhereAndWhenHanded() {
		return passportWhereAndWhenHanded;
	}

	public String getPassword() {
		return password;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public void setDateOfBirdh(Date dateOfBirdh) {
		this.dateOfBirdh = dateOfBirdh;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassportSerieAndNumber(String passportSerieAndNumber) {
		this.passportSerieAndNumber = passportSerieAndNumber;
	}

	public void setPassportWhereAndWhenHanded(String passportWhereAndWhenHanded) {
		this.passportWhereAndWhenHanded = passportWhereAndWhenHanded;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", lastName=" + lastName + ", firstName=" + firstName
				+ "]";
	}

}
