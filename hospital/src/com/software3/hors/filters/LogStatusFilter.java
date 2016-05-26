package com.software3.hors.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software3.hors.constats.CookieName;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.UserDaoInterface;
import com.software3.hors.domain.User;

public class LogStatusFilter implements Filter {

	private UserDaoInterface<User> userDao;
	/**
	 * Default constructor.
	 */
	public LogStatusFilter() {

	}

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		Cookie[] cookies = httpServletRequest.getCookies();
		// 如果cookie有某个数据则在session加入user信息
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals(CookieName.USERID)) {
					String uid = cookies[i].getValue();
					User user = userDao.getOneById(User.class,
							Long.parseLong(uid));
					HttpSession session = httpServletRequest.getSession();
					session.setAttribute(SessionName.USER, user);
					break;
				}
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
	}

	public UserDaoInterface<User> getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoInterface<User> userDao) {
		this.userDao = userDao;
	}

}
