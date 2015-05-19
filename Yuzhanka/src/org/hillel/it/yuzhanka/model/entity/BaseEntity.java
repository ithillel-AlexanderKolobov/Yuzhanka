package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class BaseEntity {
	private int id;
	private Date createdAt;
	private User createdBy; // может быть как менеджер так и сам клиент
}
