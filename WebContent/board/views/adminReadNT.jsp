<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>(관리자)공지사항 내 글 보기</title>
    <link rel="stylesheet" href="../../css/adminReadNT.css">
    <script defer src="../../js/adminReadNT.js"></script>
</head>
<body>
   <%@include file ="../../header.jsp" %>
    <main>
        <div class="main-container">
            <div class="main-box1">
                <div class="main-box1-titlebox">
                    <div class="main-box1-title"><div id="title1"><a href="../pro/community.jsp">커뮤니티</a></div><div id="title2">&gt;</div><div id="title2"><a href="../pro/notice.jsp">공지사항</a></div></div>
                </div>
                <div class="writing-title-box">
                    <div class="writing-title">글제목</div>
                </div>
                <div class="main-box1-infobox">
                    <div class="writer">관리자</div>
                    <div class="date">2023-08-18</div>
                </div>
                <div class="main-box1-contentbox">
                    <div class="main-box1-content">글내용</div>
                </div>
            </div> 
            <div class="main-box2">
                <div class="main-box2-list-button">
                    <button id="listbutton1"><a id="" href="../pro/notice.html">목록</a></button>
                    <button id="listbutton2"><a id="" href="./adminRewriting.html">수정</a></button>
                    <button id="listbutton3" onclick="call_confirm()"><a id="" href="../pro/notice.jsp">삭제</a></button>
                </div>
            </div>
    </main>
    <%@include file ="../../footer.jsp" %>
</body>
</html>