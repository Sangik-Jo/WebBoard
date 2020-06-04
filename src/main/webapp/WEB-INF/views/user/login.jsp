<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<%@include file="../common/common_top.jsp"%>

<link href="${pageContext.request.contextPath }/resources/css/login.css" rel="stylesheet">
</head>
<body>
<%
String u_id = null;
String u_pwd = null;
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) {
	if(c.getName().equals("u_id")) u_id = c.getValue();
	if(c.getName().equals("u_pwd")) u_pwd = c.getValue();
	response.addCookie(c);
}
%>
<div class="container wrapper">
	<form class="text-center border border-light p-5" action="login" method="post">
	    <p class="h2 mb-4"><a href="index">Board Main</a></p>
		<p class="h4 mb-4">로그인</p>
		
	    <!-- ID -->
	    <input type="text" name="u_id" class="form-control mb-4" placeholder="ID" value="<%=u_id %>">
	
	    <!-- Password -->
	    <input type="password" name="u_pwd" class="form-control mb-4" placeholder="Password" value="<%=u_pwd %>">
		
		<p class="text-danger" style="font-size: 13px">${alert }</p>
	    <div class="d-flex justify-content-around">
	        <div>
	            <!-- Remember me -->
	            <div class="custom-control custom-checkbox text-left">
	                <input type="checkbox" class="custom-control-input" id="rememberMe" name="rememberMe">
	                <label class="custom-control-label" for="rememberMe">Remember me</label>
	            </div>
	        </div>
	    </div>
	
	    <!-- Sign in button -->
	    <button class="btn btn-info btn-block my-4" type="submit">Sign in</button>
	
	    <!-- Register -->
	    <p>Not a member?
	        <a href="signUp">Register</a>
	    </p>
	</form>
</div>

<%@include file="../common/common_bottom.jsp"%>
</body>
</html>