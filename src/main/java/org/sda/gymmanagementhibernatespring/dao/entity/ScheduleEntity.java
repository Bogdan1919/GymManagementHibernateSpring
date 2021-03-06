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
@Table(name = "schedule")
public class ScheduleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class-id")
	private ClassEntity classEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainer_id")
	private TrainerEntity trainerEntity;
	
	@Column(name = "date_time")
	private Date createdDateTime;
	
	private int availability;
	
	@Column(name = "subscribe_start_time")
	private Date subscribeStartTime;

	public ScheduleEntity() {

	}

	public int getId() {
		return id;
	}

	public ClassEntity getClassEntity() {
		return classEntity;
	}

	public TrainerEntity getTrainerEntity() {
		return trainerEntity;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public int getAvailability() {
		return availability;
	}

	public Date getSubscribeStartTime() {
		return subscribeStartTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setClassEntity(ClassEntity classEntity) {
		this.classEntity = classEntity;
	}

	public void setTrainerEntity(TrainerEntity trainerEntity) {
		this.trainerEntity = trainerEntity;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public void setSubscribeStartTime(Date subscribeStartTime) {
		this.subscribeStartTime = subscribeStartTime;
	}

}
