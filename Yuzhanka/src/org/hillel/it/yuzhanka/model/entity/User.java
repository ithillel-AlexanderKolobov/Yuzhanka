package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class User extends BaseEntity {
	
	private String email; // ������������ ����. ������ ��������� ������������.
							// ����� �������������� ��� �����������
	private String password; // ������ ����� HASH � �� ��� ������. ���� �������
								// ��������� ����� ��� ����������� ������� ��
								// ����� ������ � ������� ��� ����� �
								// ��������������� �������
	private String lastName;
	private String firstName;
	private String patronymic;
	private Date dateOfBirdh;
	private String homeAddress;
	private String passportSerieAndNumber;
	private String passportWhereAndWhenHanded;
	private ArrayList<Payment>[] payments;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
}