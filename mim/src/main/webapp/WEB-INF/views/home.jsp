<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<style>
	#profileImage{
		width: 50px;
		height: 50px;
		border: 1px solid #cecece;
		border-radius: 50%;
	}
</style>
<body>
<div class="container">
<h1>메인 페이지</h1>

	<c:choose>
		<c:when test="${empty id }">
		
			<a href="${pageContext.request.contextPath }/users/loginform.do">로그인</a>
			<a href="${pageContext.request.contextPath }/users/signup_form.do">회원가입</a>
		</c:when>
		<c:otherwise>
			<img id="profileImage" 
							src="${pageContext.request.contextPath }${dto.profile }"/>
			<a href="${pageContext.request.contextPath }/users/private/info.do"><strong>${id }</strong></a> 님 로그인중...
			<a href="${pageContext.request.contextPath }/users/logout.do">로그아웃</a>
		</c:otherwise>
	</c:choose>
	<ul>
		<li><a href="${pageContext.request.contextPath }/shop/list.do">상품 목록 보기</a></li>
	</ul>
</div>
</body>
</html>





