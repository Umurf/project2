<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/headeradmin.css">
<title>headeradmin</title>
</head>
<body>
    <header>
        <div class="header-container">
            <div class="header-box1">
                <div class="logo">
                    <a href="./index.jsp">
                        <img src="./img/logo.png" alt="">
                    </a>
                </div>
                <div class="header-nav">
                    <ul class="header-nav">
                        <li>
                            <a href="../../hmap/hmap.jsp">우리동네 헬스장</a>
                        </li>
                        <li>
                            <a href="../../board/project/community.jsp">커뮤니티</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="header-box2">
                <ul class="header-box2">
                    <li>
                        <a href="./member/views/alarm.jsp">
                            <img src="./img/bell3.png" alt="" class="header-box2-img">
                            </a>
                    </li>
                    <li>
                        <a href="./member/views/admin.jsp">관리자</a>
                    </li>
                    <li>
                        <a href="./main/project/main.jsp">로그아웃</a>
                    </li>
                </ul>
            </div>
        </div>
    </header>
</body>
</html>