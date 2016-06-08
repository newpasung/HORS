<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="container">
	<div class="row">
		<div class="col-md-10 col-md-offset-1">
			<div class="panel panel-primary">
				<div class="panel-heading">按照医院找医生</div>
				<div class="panel-body">
			    	<ul class="nav nav-tabs"  style="margin-bottom:15px">
					    <li class="active"><a href="#gz" data-toggle="tab">广州市</a></li>
					    <li><a href="#lw" data-toggle="tab">荔湾区</a></li>
					    <li><a href="#zc" data-toggle="tab">增城区</a></li>
					    <li><a href="#yx" data-toggle="tab">越秀区</a></li>
					    <li><a href="#hz" data-toggle="tab">海珠区</a></li>
					    <li><a href="#th" data-toggle="tab">天河区</a></li>
					    <li><a href="#hp" data-toggle="tab">黄浦区</a></li>
					    <li><a href="#py" data-toggle="tab">番禺区</a></li>
					    <li><a href="#hd" data-toggle="tab">花都区</a></li>
					    <li><a href="#by" data-toggle="tab">白云区</a></li>
					    <li><a href="#ns" data-toggle="tab">南沙区</a></li>
					</ul>
				  	<div class="tab-content">
					    <div class="tab-pane active" id="gz">
							<ul class="list-inline">
							<s:iterator value="hospitals" id="hospitals" status="st">
								<s:iterator value="#hospitals.value" id="hospital" status="h_st">
									<li>
										<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
									</li>
								</s:iterator>
							</s:iterator>
							</ul>
						</div>
					    <div class="tab-pane" id="lw">
					    	<ul class="list-inline">
					   			<s:iterator value='hospitals.get("荔湾")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="zc">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("增城")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="yx">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("越秀")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="hz">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("海珠")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="th">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("天河")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="hp">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("黄埔")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="py">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("番禺")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="hd">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("花都")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
					    </div>
					    <div class="tab-pane" id="by">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("白云")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
								</li>
					    	</s:iterator>
					    	</ul>
						</div>
					    <div class="tab-pane" id="ns">
					    	<ul class="list-inline">
					    	<s:iterator value='hospitals.get("南沙")' id="hospitals" status="st">
					    		<li>
									<s:a href="departments?hospitalId=%{hid}"><s:property value="name"/></s:a>
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