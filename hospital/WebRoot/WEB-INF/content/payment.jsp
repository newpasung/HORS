<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
				<div class="col-md-12">
					<div class="panel panel-default">
					  <div class="panel-body">
					     <p class="text-center">订单详情</p>
					     <p>医院：<a href="hospital/departments?hospitalId=${order.workArrangement.doctor.department.hospital.hid}">${order.workArrangement.doctor.department.hospital.name}</a></p>
					     <p>科室：<a href="doctors?departmentId=${order.workArrangement.doctor.department.did}">${order.workArrangement.doctor.department.name}</a></p>
					     <p>医生：<a href="doctors?departmentId=${order.workArrangement.doctor.department.did}#doctor-1">${order.workArrangement.doctor.name}</a></p>
					     <p>时间：<fmt:formatDate value="${order.date}" pattern="yyyy-MM-dd"/>&nbsp;&nbsp; ${order.workArrangement.start_num}:00~${order.workArrangement.end_num}:00</p>
					     <p style="text-align: right">挂号费：¥${order.workArrangement.doctor.guahaofei}&nbsp;&nbsp; <a href="payment?orderId=${order.orderId}" class="btn btn-primary">支付</a></p>
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
