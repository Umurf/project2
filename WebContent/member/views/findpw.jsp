<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
     <link rel="stylesheet" href="../../css/findpw.css">
<title>비밀번호 찾기</title>
</head>
<body>
<jsp:include page="../../header.jsp"/>
<main><!--메인 시작-->
        <div class="main-container-outline">
            <div class="main-container">
                <div class="main-container-up">
                    <h1>비밀번호 찾기</h1>
                </div>
                <div class="main-container-down">
                    <div class="main-container-down-section01">
                        <div class="main-container-down-section01-box1">
                            이메일
                        </div>
                        <label>
                            <input type="email" name="email" placeholder="이메일" value class="main-container-down-section01-box2">
                        </label>

                    </div>
                    <p class="main-container-down-msg">입력하신 이메일로 임시 비밀번호가 전송됩니다.</p>
                    <div class="main-container-down-section02">
                        <button class="main-container-down-section02-button" name="emailPw" type="button">
                            전  송

                        </button>
                        
                    </div>
                </div>
            </div>
        </div>
    </main> <!-- 메인 끝 --> 
<jsp:include page="../../footer.jsp"/>
</body>
</html>