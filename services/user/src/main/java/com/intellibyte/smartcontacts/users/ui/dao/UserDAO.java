package com.intellibyte.smartcontacts.users.ui.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


public class UserDAO {

	private String Id;
	private String name;
	private String email;
	private String password;
	private String aboutUser;
	private enum role{user,admin};
	private File image;
	
	private List<UserDAO> userList = new ArrayList<>();
			
	public UserDAO(String id, String name, String email, String password, String aboutUser, File image) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.aboutUser = aboutUser;
		this.image = image;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAboutUser() {
		return aboutUser;
	}
	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}

	public List<UserDAO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDAO> userList) {
		this.userList = userList;
	}
	
	

}
