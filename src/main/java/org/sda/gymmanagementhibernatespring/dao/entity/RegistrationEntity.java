package org.sda.gymmanagementhibernatespring.dao.entity;

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
@Table(name = "registration")
public class RegistrationEntity {
	@Id
	@Column(name = "registration_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registrationNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schedule_id")
	private ScheduleEntity scheduleEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private ClientEntity clientEntity;
	
	public RegistrationEntity() {
		
	}

	public int getRegistrationNo() {
		return registrationNo;
	}

	public ScheduleEntity getScheduleEntity() {
		return scheduleEntity;
	}

	public ClientEntity getClientEntity() {
		return clientEntity;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public void setScheduleEntity(ScheduleEntity scheduleEntity) {
		this.scheduleEntity = scheduleEntity;
	}

	public void setClientEntity(ClientEntity clientEntity) {
		this.clientEntity = clientEntity;
	}
	
	

}
