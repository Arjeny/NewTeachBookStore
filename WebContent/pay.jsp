<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery/2.0.0/jquery.min.js"></script>
<script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
<link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet" />
<title>支付订单</title>
</head>

	<style type="text/css">
		div{
			font-size: 12px;
			font-family: arial;
		}.bluecolor{
			color: #2AABD2 !important;
		}
		div.top{
			position: relative;
			margin-top: -1;
			color: #999;
			background-color: #f2f2f2;
			padding-top: 5px;
			padding-bottom: 5px;
			border-bottom: 1px solid #e7e7e7;
		}
		div.top span,div.top a{
			color: #999;
			margin: 0px 10px 0px 10px;
		}
		div.top a:hover{
			color: #2AABD2;
			text-decoration: none;
		}
		div.father{
			width: 35%;
			margin: 20px auto;
		}
		
	</style>


<body>

		<div class="top">
			<a href="index。jsp">
				<span class="glyphicon glyphicon-home bluecolor"></span>New Teach
			</a>
			<span>欢迎来到New Tech书店</span>
			
			<c:if test="${empty username }">
				<span>
					<a href="login.html">登陆</a>
					<a href="register.html">注册</a>
				</span>
			</c:if>
			<span>
				<span>${username }</span>
			</span>
			
			<span class="pull-right">
				<a href="#nowhere">我的订单</a>
				<a href="/NewTechBookStore/cart">
					<span class="glyphicon glyphicon-shopping-cart bluecolor"></span>购物车
				</a>
			</span>
		</div>

<div class="father">
	<form action="CheckServlet" method="post" class="form-horizontal" role="form">
		<div class="form-group">
		    <label for="totalPrice" class="col-md-3 control-label">总金额：<c:out value="${sessionScope.sum }"></c:out></label>
		</div>
		<div class="form-group">
		    <label for="card" class="col-md-3 control-label">请输入信用卡号：</label>
		    <div class="col-md-7">
		      <input type="text" class="form-control" name="cardId" placeholder="卡号">
		    </div>
		</div>
		<div class="form-group">
		    <div class="col-md-offset-4 col-md-8">
		      <input type="submit" class="btn btn-default" value="确认支付"></input>
		    </div>
		</div>
	</form>
</div>
</body>
</html>