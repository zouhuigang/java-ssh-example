package test;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public String username;
	public String password;

	public String execute() {
		if (!username.equals("admin")) {
			super.addFieldError("username", "�û�������");
			return ERROR;
		}
		if (!password.equals("001")) {
			super.addFieldError("password", "�������");
			return ERROR;
		}
		return SUCCESS;
	}

	public void validate() {
		if (username == null || username.length() == 0) {
			super.addActionError("�û�������Ϊ��");
		}
		if (password == null || password.length() == 0) {
			super.addActionError("���벻��Ϊ��");
		}
	}
}