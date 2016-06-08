<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
				<div class="col-md-12">
					<div class="panel panel-default">
					  <div class="panel-body">
					     <p class="text-center">我的订单</p>
					     <s:iterator value="myOrders" id="order" status="st">
						     <p>医院：<a href="hospital/departments?hospitalId=<s:property value="#order.workArrangement.doctor.department.hospital.hid"/>">
						     	<s:property value="#order.workArrangement.doctor.department.hospital.name"/></a>
						     </p>
						     
						     <p>科室：<a href="doctors?departmentId=<s:property value="#order.workArrangement.doctor.department.did"/>">
						     <s:property value="#order.workArrangement.doctor.department.name"/></a>
						     </p>
						     
						     <p>医生：<a href="doctors?departmentId=<s:property value="#order.workArrangement.doctor.department.did"/>#doctor-<s:property value="#order.workArrangement.doctor.docId"/>">
						     <s:property value="#order.workArrangement.doctor.name"/></a>
						     </p>
						     <p>时间：<s:date name="#order.date"  format="yyyy-MM-dd"/>&nbsp;&nbsp; <s:property value="#order.workArrangement.start_num"/>:00~<s:property value="#order.workArrangement.end_num"/>:00</p>
						     <p id="status-<s:property value="#order.orderId"/>">状态：
						     	<s:if test='#order.status.toString() == "WAITFORPAY"'>待付款</s:if>
						     	<s:if test='#order.status.toString() == "WAITFORCURE"'>已付款，请在预约时间前往就诊</s:if>
						     	<s:if test='#order.status.toString() == "FINISH"'>已完成</s:if>
						     	<s:if test='#order.status.toString() == "CANCEL"'>已取消</s:if>
						     	<s:if test='#order.status.toString() == "EXPIRED"'>已过期</s:if>
						     </p>
						     
						     <p style="text-align: right">挂号费：¥<s:property value="#order.workArrangement.doctor.guahaofei"/>&nbsp;&nbsp;
						     <s:if test='#order.status.toString() == "WAITFORPAY"'>
								<a href="payment?orderId=<s:property value="#order.orderId"/>" class="btn btn-primary">支付</a>
							 </s:if>
							 <s:if test='#order.status.toString() == "WAITFORCURE"'>
								<a href="#" class="btn btn-primary" data-toggle="modal" data-target="#cancelModal" data-id="<s:property value="#order.orderId"/>">取消预约</a>
							 </s:if>
						     </p>
						     
						     <s:if test="!#st.last">
								<hr style="BORDER-RIGHT: #00686b 1px dotted; BORDER-TOP: #00686b 1px dotted; BORDER-LEFT: #00686b 1px dotted; BORDER-BOTTOM: #00686b 1px dotted" noShade SIZE=1>
							</s:if>
					     </s:iterator>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="cancelModal" tabindex="-1">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">通知</h4>
      </div>
      <div class="modal-body">
       取消成功
      </div>
    </div>
  </div>
</div>
   
   	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	$('#cancelModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget);
		  var orderId = button.data('id');
		  var modal = $(this);
		  //modal.find('.modal-title').text(doctorId + "  " + dayId);
		  $.get("cancelOrder", {orderId: orderId}, function(data, textStatus){
			  if (textStatus == "success") {
				  var json = eval('(' + data + ')');
				  modal.find('.modal-body').html(json.message);
				  if(json.success=="1") {
					  $("#status-"+orderId).html("状态：已取消");
					  button.remove();
				  }
			  }
		  });
	})
	</script>
</body>
</html>
