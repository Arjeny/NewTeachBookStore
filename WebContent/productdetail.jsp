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
<link href="css/fore/productdetail.css" rel="stylesheet" />
<title>书籍详情</title>

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

<!--  	<script type="text/javascript">
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
	</script>     -->

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
				<a href="/NewTechBookStore/cart">
					<span class="glyphicon glyphicon-shopping-cart bluecolor"></span>购物车
				</a>
			</span>
		</div>
	
		<div class="imgAndInfo">
			<div class="imgInImgAndInfo">
				<img class="bigImg" src='<c:out value="${book.book_img }"></c:out>' />
			</div>
			<div class="infoInImgAndInfo">
				<div class="titleOfProduct">
					<span><c:out value="《${book.book_name }》"></c:out>&nbsp;<c:out value="${book.book_author }"></c:out> </span>
				</div>
				<div class="subTitleOfProduct">
					<c:out value="${book.book_description }"></c:out>
				</div>
				<div class="productPrice">
					<div class="juhuasuan">
						<span class="juhuasuan">巨划算</span>
						<span>此商品即将参加巨划算，<span class="time">1天19小时</span><span>后开始</span></span>
					</div>
					<div class="productPriceDiv">
						<div class="shoppingCoupon">
  							<img class="coupon" src="img/ngouwujuan.png" />
							<span>全New Tech国内书目通用</span>
						</div>
						<div class="originalPriceDiv">
							<span class="originalPriceDesc">价格</span>
							<span class="originalPriceIcon">¥</span>
							<span class="originalPrice">199.00</span>
						</div>
						<div class="presentPriceDiv">
							<span class="presentPriceDesc">促销价</span>
							<span class="presentPriceIcon">¥</span>
							<span class="presentPrice"><c:out value="${book.book_price }"></c:out> </span>
						</div>
					</div>
					<div class="saleVolumeAndCommentDiv">
							<span class="saleVolume">
								<span>销量:</span>
								<span class="numberOfSale">1663</span>
							</span>
							<span class="comment">
								<span>累计评价:</span>
								<span class="numOfComment">2580</span>
							</span>
						</div>
						<div class="productNum">
							<span>数量</span>
							<span>
								<input class="productNumSetting" type="text" value="1" />
							</span>
							<span class="stock">
								件 库存<span class="numOfStock">365</span>件
							</span>
						</div>
						<div class="servicePromision">
							服务承诺 <span>正品保证 极速退款 赠运费险 七天无理由退换</span>
						</div>
						<div class="buyDiv">
							<form action="AddCartInDetailServlet" method="get">
								<input type="hidden" name="bookId" value='<c:out value="${book.book_id }"></c:out>'>
								<span class="glyphicon glyphicon-shopping-cart bluecolor">
									<input type="submit" class="btn btn-primary btn-lg" id="sub" value="加入购物车" />
								</span>
							</form>
						</div>
				</div>
			</div>
		</div>
	</body>
</html>