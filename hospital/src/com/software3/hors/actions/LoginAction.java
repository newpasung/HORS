package com.software3.hors.actions;

import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.constats.CookieName;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.UserDaoInterface;
import com.software3.hors.domain.User;

public class LoginAction extends ActionSupport {

	private UserDaoInterface<User> userDao;
	private String account;
	private String password;

	/* 登录成功会添加userid到cookie，并在session里添加user对象 ,登录失败会在request里面存入 */
	@Override
	public String execute() throws Exception {
		User user = userDao.login(account, password);
		if (user == null) {
			return "faile";
		}
		Cookie cookie = new Cookie(CookieName.USERID, user.getId() + "");
		cookie.setMaxAge(60 * 60 * 24 * 7);// 记住登陆七天
		cookie.setPath(password);
		ServletActionContext.getResponse().addCookie(cookie);
		Map<String, Object> sessionMap = ActionContext.getContext()
				.getSession();
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
