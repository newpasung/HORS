<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="panel panel-primary">
    <div class="panel-heading">
      <h3 class="panel-title">用户登录</h3>
    </div>
    <div class="panel-body">
      <form  action="login" method="post" style="margin-bottom: 0px;">
		  <div class="form-group">
		    <label for="login_username">账号：</label>
		    <input id="login_username" name="account" type="text" class="form-control" placeholder="">
		  </div>
		  <div class="form-group">
		    <label for="login_password">密码：</label>
		    <input id="login_password" type="password" name="password" class="form-control" placeholder="">
		  </div>
		  <a href="">忘记密码？</a>
		  <div class="pull-right">
			  <button class="btn btn-default">注册</button>
			  <button type="submit" class="btn btn-primary">登录</button>
		  </div>
		</form>
    </div>
  </div>