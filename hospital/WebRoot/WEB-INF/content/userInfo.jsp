<%@page import="com.software3.hors.constats.SessionName"%>
<%@page import="com.software3.hors.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	User user = (User)session.getAttribute(SessionName.USER);
%>
<div class="panel panel-primary">
    <div class="panel-heading">
      <h3 class="panel-title">用户信息</h3>
    </div>
    <div class="panel-body">
      <p>账号：<% out.append(user.getName()); %></p>
      <p><a href="ordermyOrders.action">我的订单</a></p>
    </div>
  </div>