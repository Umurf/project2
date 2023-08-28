<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/headeradmin.css">
<title>headeradmin</title>
</head>
<body>
    <header>
        <div class="header-container">
            <div class="header-box1">
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/index.jsp">
                        <img src="${pageContext.request.contextPath}/img/logo.png" alt="">
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
                        <a href="${pageContext.request.contextPath}/member/views/alarm.jsp">
                            <img src="${pageContext.request.contextPath}/img/bell3.png" alt="" class="header-box2-img">
                            </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/member/views/admin.jsp">관리자 님</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index.jsp">로그아웃</a>
                    </li>
                </ul>
            </div>
        </div>
    </header>
</body>
</html>