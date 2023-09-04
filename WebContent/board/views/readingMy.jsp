<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내 글 보기</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/readingMy.css">
    <script defer src="${pageContext.request.contextPath}/js/readingMy.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <%@include file="../../header.jsp" %>
    <main>
        <div class="main-container">
            <div class="main-box1">
                <div class="main-box1-titlebox">
                    <div class="main-box1-title">
                        <div id="title1"><a href="../pro/community.jsp">커뮤니티</a></div>
                        <div id="title2">&gt;</div>
                        <div id="title2"><a href="../pro/freeBoard.jsp">자유게시판</a></div>
                    </div>
                </div>
                <div class="writing-title-box">
                    <div class="writing-title">${fboard.getFboardTitle()}</div>
                </div>
                <div class="main-box1-infobox">
                    <div class="writer">${fboard.getUserNickname()}</div>
                    <div class="date">${fboard.getFboardDate()}</div>
                </div>
                <div class="main-box1-contentbox">
                    <div class="main-box1-content">${fboard.getFboardContent()}</div>
                </div>
            </div>
            <div class="main-box2">
                <div class="main-box2-list-button">
                    <button class="list-btn" id="listbutton1" type="button"  data-boardnumber="${fboard.getFboardNumber()}">목록</button>
                    <c:if test="${fboard.getUserNumber() == sessionScope.userNumber}">
                       <button id="listbutton2">
                           <a id="" href="${pageContext.request.contextPath}/board/views/fboardUpdate.fb?fboardNumber=${fboard.getFboardNumber()}">수정</a></button>
                       <button class="delete-btn" id="listbutton3" onclick="call_confirm1()">삭제</button>
                    </c:if>
                </div>
            </div>
            <div class="main-box3">
                <div class="total-comments-box">
                    <span class="comments-text">댓글</span>
                    <span class="total-comments-text">1</span>
                </div>
                <div class="comments-box">
                    <div class="comments-info-box">
                        <div class="name-n-date">
                            <div class="writer-name">작성자</div>
                            <div class="written-date">2023-08-18 15:30:13</div>
                        </div>
                        <div class="comments-content-box">
                            <div class="comments-content">
                                댓글내용
                            </div>
                        </div>
                    </div>
                </div>
                <div class="write-commentsbox">
                    <div class="comment-writer">
                        <div class="comment-writer-box">
                            <div class="comment-writer-text">닉네임</div>
                            <div class="comment-writer-name">작성자</div>
                        </div>
                    </div>
                    <div class="commentbox">
                        <form action="" class="writing-comment">
                           <textarea class="writing-comment-box" name="" id="commentbox"></textarea>
                            <div class="comment-button-box">
                                <div class="comment-savebutton">
                                    <button><a id="commentbutton" href="../views/readingMy.jsp">댓글등록</a></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <%@include file="../../footer.jsp" %>
</body>
</html>