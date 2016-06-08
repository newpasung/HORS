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
				<div class="col-md-8">
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					  <!-- Indicators -->
					  <ol class="carousel-indicators">
					    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
					  </ol>
					
					  <!-- Wrapper for slides -->
					  <div class="carousel-inner" role="listbox">
					    <div class="item active">
					      <img src="assets/images/banner1.jpg" alt="...">
					    </div>
					    <div class="item">
					      <img src="assets/images/banner2.jpg" alt="...">
					    </div>
					    <div class="item">
					      <img src="assets/images/banner3.jpg" alt="...">
					    </div>
					    <div class="item">
					      <img src="assets/images/banner4.jpg" alt="...">
					    </div>
					  </div>
					</div>
				</div>
				<div class="col-md-4">
					<jsp:include page="loginForm.jsp" flush="true"/> 
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="findByHospital.jsp" flush="true"/> 
<jsp:include page="findByDisease.jsp" flush="true"/> 

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>

</body>
</html>
