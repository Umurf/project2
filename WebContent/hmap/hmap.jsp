<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/hmap.css">
<script defer src ="../js/hmap.js"></script>
<title>hmap</title>
</head>
<body>
<%@ include file="../header.jsp" %>
    <main>
        <div class="main-container">
           
            <div class="main-container-up-section1">
                <h1>우리동네 헬스장</h1>
                <div class="section1-img"><img src="../img/hmap1.png" alt=""></div>
            </div>
            <div class="main-container-text">검색창에 위치를 입력하면 근처 헬스장을 찾아드려요!</div>
            <div class="main-container-up-section2">
                <form onsubmit="searchPlaces(); return false;">
                    <img class="main-container-up-section2-img" src="../img/glass.png">
                    <input type="text" value="노원" id="keyword" size="15" class="main-container-up-section2-searchbox"> 
                    <button class="main-container-up-section2-button" type="submit">검색</button>
                </form>
            </div>   
            <div class="main-container-up-section3">
                <div>
                    <div id="menu_wrap" class="bg_white">
                       <div class="placelist"><ul id="placesList"></ul></div> 
                        <div id="pagination"></div>
                    </div>
                </div>
                <div id="map"></div>
            </div>
    </div>
    </main>
<%@ include file="../footer.jsp" %>
</body>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=ae95d73b26d78be40345423aca839fb3&libraries=services"></script>
</html>