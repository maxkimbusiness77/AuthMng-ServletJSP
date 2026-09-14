<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Maximize Your Potential</title>
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/index.css">
</head>
<body>
<!-- header -->
<header class="layout-header">
    <h1><a href="./">Maximize Your Potential</a></h1>
    <div>
        <a href="./profile.jsp">프로필</a>
        <a href="./login.jsp">로그인</a>
        <button type="button">로그아웃</button>
    </div>
</header>

<!-- main -->
<main class="login">
    <h2 class="main-title">로그인</h2>
    <p class="main-desc">아이디와 비밀번호를 입력하고 로그인하세요</p>

    <form class="main-form" method="POST" action="./profile.jsp">
        <section class="flex-input">
            <label class="user-id">아이디</label>
            <input id="user-id" class="user-id" name="user-id" type="text" required>
        </section>

        <section class="flex-input">
            <label class="user-pw">비밀번호</label>
            <input id="user-pw" class="user-pw" name="user-pw" type="password" required>
        </section>

        <section class="btn-section">
            <button id="login-btn" class="login-btn" type="submit">로그인</button>
        </section>
    </form>
</main>

<!-- footer -->
<footer class="layout-footer">
    Copyright 2026. MaximizeYour Potential.
</footer>
</body>
</html>