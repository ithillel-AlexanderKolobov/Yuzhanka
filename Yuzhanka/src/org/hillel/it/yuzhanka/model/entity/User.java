package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class User {
	private int id;
	private String email; // ������������ ����. ������ ��������� ������������.
							// ����� �������������� ��� �����������
	private String password; // ������ ����� HASH � �� ��� ������. ���� �������
								// ��������� ����� ��� ����������� ������� ��
								// ����� ������ � ������� ��� ����� �
								// ��������������� �������
	private Date createdAt;
	private String lastName;
	private String firstName;
	private String patronymic;
	private Date dateOfBirdh;
	private String homeAddress;
	private String passportSerieAndNumber;
	private String passportWhereAndWhenHanded;
}
