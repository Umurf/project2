<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>오운완_관리자</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <script defer src ="${pageContext.request.contextPath}/js/admin.js"></script>
</head>
<body>
	
	<jsp:include page="../../header.jsp"/>

    <main>
        <div class="main-container">

                <div class="main-box1-titlebox">
                    <div class="main-box1-title">관리자 &gt; 게시글 관리 </div>
                    <a href="${pageContext.request.contextPath}/member/views/admin.jsp"><span>회원 관리</span></a>
                </div>
                <form class="main-box1-content" action="${pageContext.servletContext.contextPath}/project/adminb.me" method="post">
                            <div class="main-box3-searchbox">
                                    <div>
                                        <span>
                                            ⊙ 검 색 어 :
                                        </span>
                                    </div>
                                <select name="searchType" id="">
                                    <option value="email">이메일</option>
                                    <option value="nickname">닉네임</option>
                                </select>
                                <input type="text" name="keyword">
                                <button>검 색</button>
                            </div>
                </form>

                <!-- 회원 글관리 시작-->
            <div class="main-box2">
                
                <div class="main-box2-title">
                    <div class="main-box2-content-content">
                        <div class="main-box2-2-content-number">번호</div>
                        <div class="main-box2-2-content-nickname">닉네임</div>
                        <div class="main-box2-2-content-title">제목</div>
                        <div class="main-box2-2-content-date">작성일</div>
                        <div class="main-box2-2-content-views">조회수</div>
                        <div class="main-box2-2-content-management">관리</div>
                    </div>
                </div>

                <div class="main-box2-content">
					<c:choose>
		                <c:when test = "${not empty userList}">
							<c:forEach var="user" items="${userList}">
							    <div class="main-box2-content-content">
							        <div class="main-box3-1-content-number">${user.getFboardNumber()}</div>
							        <div class="main-box3-1-content-nickname">${user.getUserNickname()}</div>
							        <div class="main-box3-1-content-title"><a href="">${user.getFboardTitle()}</a></div>
							        <div class="main-box3-1-content-date">${user.getFboardDate()}</div>
							        <div class="main-box3-1-content-management">${user.getFboardCount()}</div>
                        			<div class="main-box3-1-content-management"><button onclick="call_confirm2()"  class="management_b">글삭제</button></div>
							    </div>
							</c:forEach>
		                </c:when>
		                
			         	<c:otherwise>
			          		<tr>
			          			<td colspan = "5" align = "center"> &emsp;&emsp;&emsp;&emsp;등록된 게시물이 없습니다 </td>
			          		</tr>
		          		</c:otherwise>
		         	</c:choose>
                </div>
               <!-- 회원 게시글 끝 -->
            </div>

            <div class="main-box3">
                <div class="main-box3-pagesbox">
                    <div class="main-box3-pages">
                        <a href="">
                            <span>
                            &lt; 이전
                            </span>
                        </a>
                        <a href="">
                            <span>1</span>
                        </a>
                        <a href="">
                            <span>2</span>
                        </a>
                        <a href="">
                            <span>3</span>
                        </a>
                        <a href="">
                            <span>
                            다음 &gt;
                            </span>
                        </a>
                    </div>
                </div>

            </div>
            <div class="main-box4">

            </div>
        </div>
        </div>
    </main>
    
	<jsp:include page="../../footer.jsp"/>
</body>
</html>