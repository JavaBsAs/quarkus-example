package com.jugbsas.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "MEETUP")
public class Meetup extends PanacheEntity implements Serializable {

	private static final long serialVersionUID = -3838072291641777744L;

	private Long id;
	@Column
	@NotBlank
	private String meeetingName;
	@Column
	private String location;
	@Column
	private int assistantQty;
	
	public String getMeeetingName() {
		return meeetingName;
	}
	public void setMeeetingName(String meeetingName) {
		this.meeetingName = meeetingName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAssistantQty() {
		return assistantQty;
	}
	public void setAssistantQty(int assistantQty) {
		this.assistantQty = assistantQty;
	}
	@Override
	public String toString() {
		return "Meetup [meeetingName=" + meeetingName + ", location=" + location + ", assistantQty=" + assistantQty
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
