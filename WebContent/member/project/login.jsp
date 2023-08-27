<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel="stylesheet" href="../../css/login.css">
</head>
<body>
    <%@include file ="../../header.jsp" %>
    <main>
        <div class="login-box">
            <div class="login-text">로그인</div>
            <div class="login-input-box">
                <form action="">
                    <div class="input-email-n-pw">
                    <div class="input-email" ><input  id="email" type="email" placeholder="이메일"></div>
                    <div class="input-pw"><input  id="pw" type="password" placeholder="비밀번호"></div>
                    </div>
                    <div class="input-button"><button id="input-box-button">로그인</button></div>
                </form>
            </div>
            <div class="find-pw"><a href="../views/findpw.jsp">비밀번호찾기</a></div>
        </div>
    </main>
    <%@include file ="../../footer.jsp" %>
</body>
</html>