<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script defer src="${pageContext.request.contextPath}/js/main.js"></script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<title>main</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<main class="main-outline"><!--main시작-->
        <div class="main-outline-container">
            <div class="main-outline-container-banner-container"><!--main-banner의 시작-->
	  <!-- <div class = "arrow prev">&lt;</div> -->
              <div class = "banner">
                <a href="${pageContext.request.contextPath}/board/project/community.jsp">
                    <div class ='img'>
                        <img src = "https://ifh.cc/g/ChphJd.jpg">
                    </div> 
                    <div class = "img">
                        <img src = "https://ifh.cc/g/cKagym.jpg">
                    </div>
                    <div class = "img">
                        <img src = "https://ifh.cc/g/SattyA.jpg">
                    </div>
                </a>
              </div>
              <!-- <div class="arrow next">&gt;</div> -->
            </div><!--banner 종료-->
        </div>
        <div class="main-outline-community-container">
            <div class="main-outline-community-container-section">
                <section class="main-outline-community-container-sec01">
                    <div class="main-communitybox">
                        <div class="main-communitybox-title"><a href="${pageContext.request.contextPath}/board/project/freeBoard.jsp"><h1>&nbsp;자유게시판</h1></a></div>
                        <div class="main-communitybox-contentbox">
                            <div class="main-communitybox-titleline"><a href="${pageContext.request.contextPath}/board/project/readingFB.jsp">&nbsp;&nbsp;글의 제목이 들어갑니다.</a></div>
                            <div class="main-communitybox-nickname">닉네임</div>
                        </div>
                        <div class="main-communitybox-contentbox">
                            <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                            <div class="main-communitybox-nickname">닉네임1</div>
                        </div>
                        <div class="main-communitybox-contentbox">
                            <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                            <div class="main-communitybox-nickname">닉네임2</div>
                        </div>
                        <div class="main-communitybox-contentbox">
                            <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                            <div class="main-communitybox-nickname">닉네임3</div>
                        </div>
                        <div class="main-communitybox-contentbox">
                            <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                            <div class="main-communitybox-nickname">닉네임4</div>
                        </div>
                    </div>
                
                </section>
                <section class="main-outline-community-container-sec02">
                        <div class="main-communitybox">
                            <div class="main-communitybox-title"><a href="${pageContext.request.contextPath}/board/project/notice.jsp"><h1>&nbsp;공지사항</h1></a></div>
                            <div class="main-communitybox-contentbox">
                                <div class="main-communitybox-titleline"><a href="${pageContext.request.contextPath}/board/project/readingNT.jsp">&nbsp;&nbsp;글의 제목이 들어갑니다.</a></div>
                                <div class="main-communitybox-nickname">관리자</div>
                            </div>
                            <div class="main-communitybox-contentbox">
                                <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                                <div class="main-communitybox-nickname">관리자</div>
                            </div>
                            <div class="main-communitybox-contentbox">
                                <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                                <div class="main-communitybox-nickname">관리자</div>
                            </div>
                            <div class="main-communitybox-contentbox">
                                <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                                <div class="main-communitybox-nickname">관리자</div>
                            </div>
                            <div class="main-communitybox-contentbox">
                                <div class="main-communitybox-titleline">&nbsp;&nbsp;안녕하세요 저는 오운완팀입니다.</div>
                                <div class="main-communitybox-nickname">관리자</div>
                            </div>
                        </div>
                </section>
            </div>
        </div>
    </main><!--main종료-->
    <jsp:include page="footer.jsp"/>
</body>
</html>