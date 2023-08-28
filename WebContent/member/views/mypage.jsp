<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/mypage.css">
<script defer src ="../../js/mypage.js"></script>
<title>MYPAGE</title>
</head>
<body>
<jsp:include page="../../header.jsp"/>
<main>
        <div class="main-container-outline"><!--메인 시작-->
            <div class="main-container">
                <div class="main-container-up">
                    <h1>회원정보 수정</h1>
                </div>
                <div class="main-container-down">
                    <div class="main-container-down-section01">
                        <div class="main-container-down-section01-box">
                            <button onclick="call_confirm()" class="main-container-down-section01-box-button">회원탈퇴</button>
                        </div>
                    </div>
                    <div class="main-container-down-section02">
                        <div class="main-container-down-section02-box1">
                            <strong>이메일</strong>
                        </div>
                        <label>
                            <input type="emall" name="email" placeholder="이메일" value class="main-container-down-section02-box2">
                        </label>
                    </div>
                    <div class="main-container-down-section03">
                        <div class="main-container-down-section03-box1">
                            <strong>닉네임</strong>
                        </div>
                        <div class="main-l1-d1">
                            다른 유저와 겹치지 않도록 입력해주세요. (2~15자)
                        </div>
                        <label>
                            <input type="nickname" name="nickname" placeholder="닉네임" value class="main-container-down-section03-box2">
                        </label>
                    </div>
                    <div class="main-container-down-section04">
                        <div class="main-container-down-section04-box1">
                            <strong>비밀번호</strong>
                        </div>
                        <div class="main-l1-d1">
                            영문, 숫자를 포함한 8~12자리의 비밀번호를 입력해주세요.
                        </div>
                        <label>
                            <input type="password" name="password" placeholder="비밀번호" value class="main-container-down-section04-box2">
                        </label>
                    </div>
                    <div class="main-container-down-section05">
                        <div class="main-container-down-section05-box1">
                            <strong>비밀번호 확인</strong>
                        </div>
                        <div class="main-l1-d1">
                            비밀번호를 한 번 더 입력해 주세요.
                        </div>
                        <label>
                            <input type="password" name="password" placeholder="비밀번호 확인" value class="main-container-down-section05-box2">
                        </label>
                    </div>
                    <div class="main-container-down-section07">

                    </div>
                    <div class="main-container-down-section06">
                        <button class="main-container-down-section06-button"  type="button">
                            수  정
                        </button>
                        <button class="main-container-down-section06-button"  type="button">
                            <a href="../../index.jsp">취  소</a>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </main>
<jsp:include page="../../footer.jsp"/>
</body>
</html>