package com.javatechie.multiple.ds.api.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_TB")
public class User {
	@Id
	private int id;
	private String userName;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	
}
