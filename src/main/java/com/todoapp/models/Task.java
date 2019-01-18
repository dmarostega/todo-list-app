package com.todoapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull (message = "Campo não estar vazio")
	@Size(min=2, max=100, message="Minimo 2 letras") 
	private String title;
	
	@NotEmpty
	private String date;
	
	@NotEmpty
	private String time;
	private String ps;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}
	
}
