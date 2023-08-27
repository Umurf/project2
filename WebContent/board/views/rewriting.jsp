<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글 수정</title>
    <link rel="stylesheet" href="../../css/rewriting.css">
    <script defer src="../../js/rewriting.js"></script>
</head>
<body>
    <%@include file ="../../header.jsp" %>
    <main>
        <div class="main-container">
            <div class="main-box1-titlebox">
                <div class="main-box1-title"><div id="title1"><a href="../pro/community.html">커뮤니티</a></div><div id="title2">&gt;</div><div id="title2"><a href="../pro/freeBoard.html">자유게시판</a></div></div>
            </div>
            <div class="content-container">
                <form class="content-form" action="">
                    <div class="content-title">제목 <input type="text"></div>
                    <div class="content-nickname">닉네임 <input class="writer-nickname" value="작성자닉네임고정" readonly></div>
                    <div class="content-content">내용 <textarea name="" id="writing-area"></textarea></div>
                    <div class="addfile">
                        <div class="addfile-text">
                            <div class="addfile-text1">첨부파일</div>
                            <div class="addfile-text2">'png','gif','jpg','jpeg'파일만 업로드가 가능합니다.</div>
                        </div>
                    </div>
                    <div class="addfiles">
                        <div class="addfiles1">
                        <form action="">
                            <input type="file">
                        </form>
                        </div>
                    </div>
                    <div class="buttons"><button id="button1" onclick="call_confirm1()"><a id="button1" href="../views/readingMy.jsp">취소</a></button><button class="button2" onclick="call_confirm2()"><a id="button2" href="../views/readingMy.jsp">수정</a></button></div>
                </form>
            </div>
        </div>
    </main>
    <%@include file ="../../footer.jsp" %>
</body>
</html>