package com.internousdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.DTO.LoginDTO;
import com.internousdev.webproj4.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private List<com.internousdev.webproj4.DTO.LoginDTO> LoginDTOList = new ArrayList<LoginDTO>();

	public String execute() {
		String ret = ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginDAO dao = new LoginDAO();
		LoginDTOList = dao.select(username, password);
		if(this.username.contentEquals(LoginDTOList.get(0).getUsername()) &&
		this.password.equals(LoginDTOList.get(0).getPassword())) {
			ret = SUCCESS;
		}else {
			ret=ERROR;
		}
		return ret;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<LoginDTO> getLoginDTOList(){
		return LoginDTOList;
	}

	public void setLoginDTOList(List<LoginDTO> loginDTOList){
		LoginDTOList = loginDTOList;
	}

}
