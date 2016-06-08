package com.software3.hors.actions;

import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.constats.CookieName;
import com.software3.hors.constats.SessionName;

public class LogoutAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		//删除cookie
		Cookie cookie = new Cookie(CookieName.USERID, "");
		cookie.setMaxAge(0);
		ServletActionContext.getResponse().addCookie(cookie);
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.remove(SessionName.USER);
		ActionContext.getContext().setSession(sessionMap);
		return SUCCESS;
	}
}
