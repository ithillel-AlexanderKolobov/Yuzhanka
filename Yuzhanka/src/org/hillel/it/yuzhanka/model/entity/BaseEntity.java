package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class BaseEntity {
	protected int id;
	protected Date createdAt;
	protected User createdBy; // может быть как менеджер так и сам клиент
}
