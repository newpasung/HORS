<%@page import="com.software3.hors.domain.User"%>
<%@page import="com.software3.hors.constats.SessionName"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	User user = (User)session.getAttribute(SessionName.USER);
%>
<header class="navbar" id="top" role="banner"  style="background:#f8f8f8; border-width:0 0 1px; border-style:solid; border-color:#ddd">
  <div class="container">
  <div class="col-md-10 col-md-offset-1">
    <div class="navbar-header">
      <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#bs-navbar" aria-controls="bs-navbar" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a href="./" class="navbar-brand">在线预约挂号系统</a>
    </div>
    <nav id="bs-navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav navbar-right">
      <%
      if (user == null) {
  	  %>
  		<li>
          <a href="#">注册</a>
        </li>
        <li>
          <a href="#">登录</a>
        </li>
  		<%
  	} else {
    	%>
    	<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><% out.append(user.getName()); %><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li> <a href="#">个人中心</a></li>
            <li><a href="ordermyOrders.action">我的订单</a></li>
            <li class="divider"></li>
            <li><a href="./logout">退出</a></li>
          </ul>
        </li>
    	<%
      }
      %>
        <li>
          <a href="#">预约指南</a>
        </li>
      </ul>	
    </nav>
    </div>
  </div>
</header>
<%
out.flush();
%>