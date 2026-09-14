<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
 request.setCharacterEncoding("UTF-8");
 String id = request.getParameter("user-id");
 
 if (id == null) {
	 id = "";
 }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Maximize Your Potential</title>
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/profile.css">
</head>
<body>
<!-- header -->
<header class="layout-header">
    <h1><a href="./">Maximize Your Potential</a></h1>
    <div>
        <a href="./jspprofile.jsp">프로필</a>
        <a href="./jsplogin.jsp">로그인</a>
        <button type="button">로그아웃</button>
    </div>
</header>

<!-- main -->
<main class="profile">
    <section class="welcome-section">
        <img src="./img/image.png" alt="프로필이미지" class="profile-img">
        <h2><%= id %>님 환영합니다!</h2>
        <p>로그인에 성공하였습니다. 환영합니다!!</p>
        <p>오늘도 즐거운 하루 보내세요!!</p>
    </section>
</main>

<!-- footer -->
<footer class="layout-footer">
    Copyright 2026. MaximizeYour Potential.
</footer>
</body>
</html>