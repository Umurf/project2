<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<title>header</title>
</head>
<body>
    <header>
        <div class="header-container">
            <div class="header-box1">
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/index.jsp">
                        <img src="https://ifh.cc/g/WZSvkh.png" alt="팀 로고">
                    </a>
                </div>
                <div class="header-nav">
                    <ul class="header-nav">
                        <li>
                            <a href="${pageContext.request.contextPath}/hmap/hmap.jsp">우리동네 헬스장</a>
                        </li>
                        <li>

                            <a href="${pageContext.request.contextPath}/board/project/community.jsp">커뮤니티</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="header-box2">
                <ul class="header-box2">
                    <li>
                        <a href="${pageContext.request.contextPath}/member/project/login.jsp">로그인</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/member/project/join.jsp">회원가입</a>
                    </li>
                </ul>
            </div>
        </div>
    </header> 
</body>
</html>