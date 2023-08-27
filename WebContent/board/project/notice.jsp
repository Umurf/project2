<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항</title>
    <link rel="stylesheet" href="../../css/notice.css">
</head>
<body>
    <%@include file ="../../header.jsp" %>
    <main>
        <div class="main-container">
            <div class="main-box1">
                <div class="main-box1-titlebox">
                    <div class="main-box1-title">최근글목록</div>
                </div>
                <div class="main-box1-content">
                    <div class="main-box1-content-button">
                        <a href="./freeBoard.jsp">
                            <img class="img1" src="../../img/002.png" alt="">
                            <img class="img2" src="../../img/004.png" alt=""></a>
                    </div>
                    <div class="main-box1-content-button">
                        <a href="./notice.jsp">
                            <img class="img1" src="../../img/001.png" alt="">
                            <img class="img2" src="../../img/005.png" alt=""></a>
                    </div>
                </div>
            </div>
            <div class="main-box2">
                <div class="main-box2-titlebox">
                    <div class="main-box2-title"><a href="./community.jsp">커뮤니티</a><div id="title2">&gt;</div><div id="title2">공지사항</div></div>
                </div>
                <div class="main-box2-content">
                    <div class="main-box2-content-content" id="content-category">
                        <div class="main-box2-content-title">글제목</div>
                        <div class="main-box2-content-nickname">닉네임</div>
                        <div class="main-box2-content-date">작성날짜</div>
                        <div class="main-box2-content-count">조회수</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title"><a href="./readingNT.jsp">[공지사항]공지1</a></div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지2</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지3</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지4</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지5</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지6</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지7</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지8</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content">
                        <div class="main-box2-content-title">[공지사항]공지9</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                    <div class="main-box2-content-content" id="last_list">
                        <div class="main-box2-content-title">[공지사항]공지10</div>
                        <div class="main-box2-content-nickname">관리자</div>
                        <div class="main-box2-content-date">2023-08-22</div>
                        <div class="main-box2-content-count">5</div>
                    </div>
                </div>
            </div>
            <div class="main-box3">
                <div class="main-box3-pagesbox">
                    <div class="main-box3-pages">
                        <span><a href="#">&lt; 이전</a></span>
                        <span><a href="#">1</a></span>
                        <span><a href="#">2</a></span>
                        <span><a href="#">3</a></span>
                        <span><a href="#">다음 &gt;</a></span>
                    </div>
                </div>
                <div class="main-box3-searchpart">
                    <div class="main-box3-searchbox">
                        <select name="search-target" id="">
                            <option value="title">제목</option>
                            <option value="writer">작성자</option>
                            <option value="content">내용</option>
                        </select>
                        <input type="text">
                        <button>검색</button>
                    </div>
                </div>
            </div>
            <!-- <div class="main-box4">
                <button><a id="writing-button" href="./adminWriting.html">글쓰기</a></button>
            </div> -->
        </div>
    </main>
    <%@include file ="../../footer.jsp" %>
</body>
</html>