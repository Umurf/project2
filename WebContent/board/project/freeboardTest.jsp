<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>자유게시판</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/freeboard.css">
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
                        <a href="./freeBoard.html">
                            <img class="img1" src="${pageContext.request.contextPath}/img/002.png" alt="">
                            <img class="img2" src="${pageContext.request.contextPath}/img/004.png" alt=""></a>
                    </div>
                    <div class="main-box1-content-button">
                        <a href="./notice.html">
                            <img class="img1" src="${pageContext.request.contextPath}/img/001.png" alt="">
                            <img class="img2" src="${pageContext.request.contextPath}/img/005.png" alt=""></a>
                    </div>
                </div>
            </div>

                <div class="main-box2-titlebox">
                    <div class="main-box2-title"><a href="${pageContext.request.contextPath}/community.html">커뮤니티</a><div id="title2">&gt;</div><div id="title2">자유게시판</div></div>
                
                
                    <table class="board-table">
                        <thead>
                          <tr>
                            <th>제목</th>
                            <th>작성자</th>
                            <th>날짜</th>
                            <th>조회수</th>
                          </tr>
                        </thead>
                        <tbody>
                          <!-- ========== 게시글 목록 예시 =========== -->
                          <c:choose>
                              <c:when test = "${not empty fboardList}">
                               <c:forEach var="fboard" items="${fboardList}">
                                   <tr>
                                       <td><c:out value = "${fboard.getFboardNumber()}"/></td>
                                       <td><c:out value = "${fboard.getFboardTitle()}"/></td>
                                       <td><c:out value = "${fboard.getUserNickname()}"/></td>
                                       <td><c:out value = "${fboard.getFboardDate()}"/></td>
                                       <td><c:out value = "${fboard.getFboardCount()}"/></td>
                                   </tr>
                            </c:forEach>
                              </c:when>
                              <c:otherwise>
                                  <tr>
                                      <td colspan = "5" align = "center" > 등록된 게시물이 없습니다 </td>
                                  </tr>
                              </c:otherwise>
                          </c:choose>
                          <!-- ========== /게시글 목록 예시 =========== -->
                        </tbody>
                      </table>

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
            
  
            <div class="main-box4">
                <button><a id="writing-button" href="./writing.jsp">글쓰기</a></button>
            </div>


		</div>
    </main>
    <%@include file ="../../footer.jsp" %>
</body>
</html>
