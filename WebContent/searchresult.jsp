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
        <title>搜索结果</title>
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
	</style>
	
	<style type="text/css">
		div.search div.searchDiv{
			background-color: #2AABD2;
			width: 400px;
			margin: 50px auto;
			padding: 1px;
			height: 40px;
			display: block;
		}
		div.search div.searchDiv input{
			width: 275px;
			border: 1px solid transparent;
			margin: 1px;
			height: 36px;
			outline: none;
		}
		div.search div.searchDiv button{
			width: 110px;
			border: 1px solid transparent;
			background-color: #2AABD2;
			color: white;
			font-size: 20px;
			font-weight: bold;
		}
		div.search div.searchBelow{
			margin-top: 5px;
			margin-left: -20px;
		}
		div.search div.searchBelow span{
			color: #999;
		}
		div.search div.searchBelow a{
			color: #999;
			font-size: 14px;
			padding: 0px 20px;
		}
		div.search img.logo{
			position: absolute;
			top: 30px;
			left: 0px;
			z-index: -1;
		}
		div.search body{
			font-size: 12px;
			font-family: arial;
		}
		div.search div.searchBelow a:hover{
			color: #2AABD2;
			text-decoration: none;
		}
	</style>
	
	<style type="text/css">
		div.bookBySort{
			background-color: #f5f5f5;
			padding: 50px 110px 50px 110px;
			margin: 10px auto;
			width: 100%;
		}
		div.productItem{
			width: 200px;
			height: 300px;
			border: 1px solid white;
			background-color: white;
			margin: 8px 4px;
			float: left;
			cursor: pointer;
		}
		div.productItem span.productItemDesc{
			font-size: 12px;
			color: #666666;
			display: block;
			padding: 14px;
		}
		div.productItem span.productPrice{
			font-size: 16px;
			color: #ff003a;
			display: block;
			padding-left: 16px;
			margin-top: -10px;
		}
		div.productItem div.btn_add2cart{
			position: relative;
			margin-top: 0px;
			margin-left: 40px;
		}
		div.productItem img{
			width: 187px;
			height: 190px;
		}
		div.productItem img:hover{
			opacity: 0.7;
			filter:alpha(opacity=70);
		}
		div.productItem a.productItemDescLink{
			display: inline-block;
			height: 66px;
		}
		span.categoryTitle{
			font-size: 16px;
			margin-left: 30px;
			color: #646464;
			font-weight: bold;
		}
		div.left-mark{
			display: inline-block;
			height: 20px;
			vertical-align: top;
			width: 5px;
			background-color: #19c8a9;
		}
		div.foot{
			position: relative;
			text-align: center;
			margin: 10px auto;
			color: #686868;
		}
	</style>
	
	<script type="text/javascript">
		function sub(){
			$.ajax({
				cache: false,
				type: "get",
				url: "AddToCartServlet",
				data: {
					'ajaxBookId': $("[name='bookId']").val()
				},
				success: function(msg){
					alert("加购成功！");
				}
			});

		}
		
		$(function(){
			$("#sub").click(function(){
				sub();
			});
		});
	</script>
    
    
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
				<a href="/NewTechBookStore/cart">
					<span class="glyphicon glyphicon-shopping-cart bluecolor"></span>购物车
				</a>
			</span>
		</div>
	
	<!--搜索栏-->
	
	
	<div class="search">
		<!--<a href="#nowhere"><img class="logo" src="http://how2j.cn/tmall/img/site/logo.gif" id="logo"</a>-->
		<div class="searchDiv">
			<form action="SearchServlet" action="get">
				<input type="text" placeholder="檀香刑  蛙 " name="keyword" />
            	<button class="searchButton" type="submit">搜索</button>
			</form>
			<div class="searchBelow">
				<span>
					<a href="#nowhere">世界名著</a><span>|</span>
				</span>
				<span>
					<a href="#nowhere">青春文学</a><span>|</span>
				</span>
				<span>
					<a href="#nowhere">成功励志</a><span>|</span>
				</span>
				<span>
					<a href="#nowhere">教辅用材</a>
				</span>
			</div>
		</div>
	</div>
	
	<div class="bookBySort">
		<div class="eachSort">
			<div class="left-mark"></div>
			<span class="categoryTitle">书单</span>
			<br />
			
			<c:forEach var="books" items="${requestScope.booklist }">
				<div class="productItem">
					<a href="/NewTechBookStore/detail?bookId=${books.book_id }"><img width="100px;" src='<c:out value="${books.book_img }"></c:out>' /></a>
					<a href="/NewTechBookStore/detail?bookId=${books.book_id }" class="productItemDescLink">
						<span class="productItemDesc">
							<c:out value="《${books.book_name }》"></c:out>&nbsp;
							<c:out value="${books.book_author }"></c:out>
						</span>
					</a>
					<span class="productPrice">￥<c:out value="${books.book_price }"></c:out> </span>
					<div class="btn_add2cart">
						<form action="AddToCartServlet" method="get">
							<input type="hidden" name="bookId" value='<c:out value="${books.book_id }"></c:out>'>
							<span class="glyphicon glyphicon-shopping-cart bluecolor">
								<input type="button" class="btn btn-primary btn-sm" id="sub" value="加入购物车" />
							</span>
						</form>
					</div>
				</div>
			</c:forEach>
			
			
			<div style="clear: both;"></div>
		</div>
	</div>
	
	<div class="foot">
		<span>&copy;&nbsp;1997-2018 Arjen 版权所有</span>
	</div>
 	</body>
</html>