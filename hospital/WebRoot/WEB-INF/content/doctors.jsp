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
				<div class="col-md-12">
					<div class="panel panel-default">
					  <div class="panel-body">
					     <p class="text-center">医生</p>
					  <s:iterator value="doctors" id="doctor" status="st">
					    	<div class="media">
							  <div class="media-left">
							      <img class="media-object" src="http://www.guahao.gov.cn/images/doctor.jpg" alt="...">
							  </div>
							  <div class="media-body">
							    <h4 class="media-heading"><s:property value="Name"/></h4>
							    <p><s:property value="jobTitle"/></p>
							    <p>简介：<s:property value="description"/></p>
							  </div>
							  <div class="media-right" style="vertical-align:middle">
							  	<button type="button" class="btn btn-primary toggle-table-btn" data-id="<s:property value="docId"/>">查看排班表</button>
							  </div>
							</div>
							<div id="table-<s:property value="docId"/>" style="display:none;margin-top:10px">
								<table class="table table-striped table-bordered">
							      <thead>
							        <tr>
							          <s:iterator value="daysList" id="day">
							            <th><s:property value="day"/></th>
							          </s:iterator>
							        </tr>
							      </thead>
							      <tbody>
							        <tr>
							        	<s:iterator value="hasArrangements.get(docId)" id="hasArrangement" status="st">
							        	<td>
							        	<s:if test="#hasArrangement">
							        		<a class="btn btn-primary order-btn" data-toggle="modal" data-target="#orderModal" data-did='<s:property value="docId"/>' data-day='<s:property value="#st.count"/>'>预约</a>
							        	</s:if>
							        	<s:else>
							        		&nbsp;
							        	</s:else>
							        	</td>
							        	</s:iterator>
							        </tr>
							      </tbody>
							    </table>
							</div>
							<s:if test="!#st.last">
								<HR style="BORDER-RIGHT: #00686b 1px dotted; BORDER-TOP: #00686b 1px dotted; BORDER-LEFT: #00686b 1px dotted; BORDER-BOTTOM: #00686b 1px dotted" noShade SIZE=1>
							</s:if>
						</s:iterator>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="orderModal" tabindex="-1">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">时段选择</h4>
      </div>
      <div class="modal-body">
       asd
      </div>
    </div>
  </div>
</div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script type="text/javascript">
$('.toggle-table-btn').click(function(event){
  var doc_id = $(event.target).data("id");
  if($('#table-'+doc_id).css('display') == "none"){
    $(event.target).html("隐藏排班表");
    $('#table-'+doc_id).css('display','block');
  } else {
    $(event.target).html("查看排班表");
    $('#table-'+doc_id).css('display','none');
  }
});

$('#orderModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget);
  var doctorId = button.data('did');
  var dayId = button.data('day');
  var modal = $(this);
  modal.find('.modal-title').text(doctorId + "  " + dayId);
  $.get("workArrangementData", {doctorId: doctorId, dayId:dayId}, function(data, textStatus){
	  if (textStatus == "success") {
		  console.log(data);
	  }
  });
})
</script>
</body>
</html>