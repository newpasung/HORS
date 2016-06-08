<%@page import="com.software3.hors.domain.User"%>
<%@page import="com.software3.hors.constats.SessionName"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<jsp:include page="head.jsp" flush="true"/> 
  
<body>
<jsp:include page="header.jsp" flush="true"/> 
<jsp:include page="navigation.jsp" flush="true"/> 
<div class="container">
	<div class="row">
		<div class="col-md-10 col-md-offset-1">
			<div class="row">
				<!-- 医院简介 -->
				<div class="col-md-4">
					<div class="panel panel-default">
					  <div class="panel-body">
  						<p class="text-center"><s:property value="hospital.name"/></p>
  						<div class="thumbnail">
     						 <img src='<s:property value="hospital.picture"/>'>
     					</div>
     					<p>等级：<s:property value="hospital.level"/></p>
     					<p>电话：<s:property value="hospital.phone"/></p>
     					<p>简介：<s:property value="hospital.description"/></p>
					  </div>
					</div>
				</div>
				<!-- 科室 -->
				<div class="col-md-8">
					<div class="panel panel-default">
					  <div class="panel-body">
					    <p class="text-center">科室</p>
					    <ul class="list-inline">
				    	<s:iterator value='departments' id="current" status="st">
				    		<li>
								<s:a href="doctors?departmentId=%{did}"><s:property value="name"/></s:a>
							</li>
				    	</s:iterator>
				    	</ul>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
