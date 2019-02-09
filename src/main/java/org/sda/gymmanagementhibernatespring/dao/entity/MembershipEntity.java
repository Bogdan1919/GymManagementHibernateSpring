package org.sda.gymmanagementhibernatespring.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "memberships")
public class MembershipEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private ClientEntity clientEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "membership_type_id")
	private MembershipTypeEntity membershipTypeEntity;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "transaction_date")
	private Date transactionDate;

	public MembershipEntity() {

	}

	public int getId() {
		return id;
	}

	public ClientEntity getClientEntity() {
		return clientEntity;
	}

	public MembershipTypeEntity getMembershipTypeEntity() {
		return membershipTypeEntity;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setClientEntity(ClientEntity clientEntity) {
		this.clientEntity = clientEntity;
	}

	public void setMembershipTypeEntity(MembershipTypeEntity membershipTypeEntity) {
		this.membershipTypeEntity = membershipTypeEntity;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
