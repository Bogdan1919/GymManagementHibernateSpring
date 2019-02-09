package org.sda.gymmanagementhibernatespring.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membership_types")
public class MembershipTypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "type-name")
	private String typeName;
	
	@Column(name = "price")
	private double price;

	public MembershipTypeEntity() {

	}

	public int getId() {
		return id;
	}

	
	public String getTypeName() {
		return typeName;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
