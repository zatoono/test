package com.internousdev.webproj3.action;

//おそらくtestDAOの名前が原因
import com.internousdev.webproj3.dao.testDAO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private String username;
	private String password;

	public String execute() {
		String ret=ERROR;
		testDAO dao = new testDAO();
		int count = dao.insert(username,password);
		if(count > 0) {
			ret = SUCCESS;
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

}
