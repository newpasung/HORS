package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.software3.hors.constats.CookieName;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.UserDaoInterface;
import com.software3.hors.domain.User;

public class LoginAction extends BasicAction {

	private UserDaoInterface<User> userDao;
	private String account;
	private String password;

	@Override
	public String execute() throws Exception {
		if (getAccount() == null || getPassword() == null || getAccount().equals("") || getPassword().equals("")) {
			List<String> errors = new ArrayList<String>();
			errors.add("请输入参数");
			setActionErrors(errors);
			return "error";
		}
		User user = userDao.login(account, password);
		if (user == null) {
			setActionErrors(strs2List("登陆失败"));
			return "error";
		}
		Cookie cookie = new Cookie(CookieName.USERID, user.getId() + "");
		cookie.setMaxAge(60 * 60 * 24 * 7);// 一个星期
		cookie.setPath(password);
		ServletActionContext.getResponse().addCookie(cookie);
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.put(SessionName.USER, user);
		ActionContext.getContext().setSession(sessionMap);
		return SUCCESS;
	}

	public UserDaoInterface<User> getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoInterface<User> userDao) {
		this.userDao = userDao;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
