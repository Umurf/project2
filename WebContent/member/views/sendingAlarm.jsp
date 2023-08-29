<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../../css/sendingAlarm.css">
    <script defer src="../../js/sendingAlarm.js"></script>
    <title>삭제메세지 보내기</title>
</head>
	<body>
	<%@include file ="../../header.jsp" %>
        <main>
            <div class="section-container">
                <div class="section1">
                    <div class="section1-title">· 삭제 사유 ·</div>
                </div>
                <div class="section2">
                    <div class="section2-content">
                        <form action="">
                             <div class="radio"><input type="radio" checked>작성하신 <span>(게시글 제목)</span> 글이 부적절한 내용(광고/선정적/정치)을 포함하고 있어 삭제되었습니다.</div>
                             <div class="radio"><input type="radio">작성하신 <span>(게시글 제목)</span> 글이 잘못된 정보를 포함하고 있어 삭제되었습니다.</div>
                             <div class="radio"><input type="radio">작성하신 <span>(게시글 제목)</span> 글이 도배 등 반복적인 내용을 포함하고 있어 삭제되었습니다.</div>
                             <div class="button"><button onclick="call_confirm()" type="submit">보내기</button></div>
                        </form>
                    </div>
                </div>
            </div>   
        </main>
        <%@include file ="../../footer.jsp" %>
    </body>
</html>