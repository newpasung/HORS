package com.software3.hors.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebFilter(description = "这只是一个代理类，为了从spring中得到bean，用于从cookie中获取uid并设置session，如果user不存在", urlPatterns = { "/*" })
@WebInitParam(name = "targetFilter", value = "logstatusfilter")
public class LogStatusFilterProxy implements Filter {

	private Filter realFilter;
	private String targetFilter;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		realFilter.doFilter(request, response, chain);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		setTargetFilter("logstatusfilter");
		ServletContext servletContext = filterConfig.getServletContext();
		WebApplicationContext wac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletContext);
		realFilter = (Filter) wac.getBean(getTargetFilter());
		realFilter.init(filterConfig);
	}

	public Filter getRealFilter() {
		return realFilter;
	}

	public void setRealFilter(Filter realFilter) {
		this.realFilter = realFilter;
	}

	public String getTargetFilter() {
		return targetFilter;
	}

	public void setTargetFilter(String targetFilter) {
		this.targetFilter = targetFilter;
	}

}
