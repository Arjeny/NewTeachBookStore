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
<title>购物车</title>

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
	</style>

</head>
<body>

		<div class="top">
			<a href="index.jsp">
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
			</span>
		</div>


	<div style="width: 50%; margin: 50px auto;">
		<table class="table table-striped">
			<caption>购物车商品列表</caption>
			<thead>
				<tr>
					<th>书名</th>
					<th>作者</th>
					<th>单价</th>
					<th>数量</th>
					<th>小计</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cartBook" items="${requestScope.cartList }">
					<tr>
						<td><c:out value="《${cartBook.book_name }》"></c:out> </td>
						<td><c:out value="${cartBook.book_author }"></c:out> </td>
						<td><c:out value="${cartBook.book_price }"></c:out></td>
						<td><c:out value="${cartBook.number }"></c:out></td>
						<td>
							<c:out value="${cartBook.book_price*cartBook.number }元"></c:out>
						</td>
						<td><a href="/NewTechBookStore/delete?bookId=${cartBook.book_id }">删除</a></td>
					</tr>
				</c:forEach>
					<tr>
						<td colspan="2">总计</td>
						<td colspan="2"><c:out value="${requestScope.sum }"></c:out> </td>
						<td colspan="2"><a href="/NewTechBookStore/pay.jsp"><input type="button" class="btn btn-primary" value="结算"></a></td>
					</tr>
			</tbody>
		</table>
	</div>
</body>
</html>