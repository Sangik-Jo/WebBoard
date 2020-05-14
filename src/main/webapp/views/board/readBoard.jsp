<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/views/common/common_top.jsp" %>
<%@include file="/views/module/top.jsp" %>
<link href="${pageContext.request.contextPath }/resources/css/board.css" rel="stylesheet"> 
</head>
<body>
<div class="container wrapper">
<!-- Default form contact -->
<form class="text-center border border-light p-5" action="#!">

    <p class="h4 mb-4">Read Board</p>

    <!-- Name -->
    <div id="defaultContactFormName" class="text-left mb-4" ><i class="fas fa-user prefix"></i> 작성자 이름</div>

    <!-- Email -->
    <div id="defaultContactFormEmail" class="text-left mb-4"><i class="fas fa-envelope prefix"></i> 작성자 이메일</div>
	
	<hr>
    <!-- Category -->
    <div id="defaultContactFormEmail" class="text-left mb-4"><i class="fas fa-clone"></i> 카테고리</div>
	
	<!-- Title -->
    <input type="email" id="defaultContactFormEmail" class="form-control mb-4" placeholder="Title">
    
    <!-- Content -->
    <div class="form-group mb-5">
        <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="10" placeholder="Content"></textarea>
    </div>
    
    
    <div class="text-left mb-3">전체 댓글</div>
	<table class="table">
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td>Mark</td>
	      <td>Otto</td>
	      <td>@mdo</td>
	    </tr>
	    <tr>
	      <th scope="row">2</th>
	      <td>Jacob</td>
	      <td>Thornton</td>
	      <td>@fat</td>
	    </tr>
	    <tr>
	      <th scope="row">3</th>
	      <td>Larry</td>
	      <td>the Bird</td>
	      <td>@twitter</td>
	    </tr>
	  </tbody>
	</table>
	
</form>
<!-- Default form contact -->
</div>
<%@include file="/views/module/bottom.jsp" %>
<%@include file="/views/common/common_bottom.jsp" %>
</body>s
</html>