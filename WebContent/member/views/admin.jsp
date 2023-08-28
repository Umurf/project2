<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>오운완_관리자</title>
    <link rel="stylesheet" href="../../css/admin.css">
    <script defer src ="../../js/admin.js"></script>
</head>
<body>
	
	<jsp:include page="../../headeradmin.jsp"/>

    <main>
        <div class="main-container">

                <div class="main-box1-titlebox">
                    <div class="main-box1-title">
                        관리자 &gt; 회원 & 게시 글 관리 </div>
                    </div>
                <div class="main-box1-content">
                            <div class="main-box3-searchbox">
                                    <div>
                                        <span>
                                            ⊙ 검 색 어 :
                                        </span>
                                    </div>
                                <select name="search-target" id="">
                                    <option value="title">이메일</option>
                                    <option value="writer">닉네임</option>
                                </select>
                                <input type="text">
                                <button>검 색</button>
                            </div>
                </div>

                <!-- 회원 정보 창 시작-->
                <div class="main-box1-1">
                
                    <div class="main-box2-title">
                        <div class="main-box2-content-content">
                            <div class="main-box2-content-title">
                            회원번호
                            </div>
                            <div class="main-box2-content-email">
                            이메일
                            </div>
                            <div class="main-box2-content-nickname">닉네임</div>
                            <div class="main-box2-content-date">가입일</div>
                            <div class="main-box2-content-management">관리</div>
                        </div>
                    </div>

                    <div class="main-box2-1-title">
                        <div class="main-box2-content-content">
                            <div class="main-box2-content-title">
                            123123
                            </div>
                            <div class="main-box2-content-email">
                            euijin1028@gmail.com
                            </div>
                            <div class="main-box2-content-nickname">냐하하핳</div>
                            <div class="main-box2-content-date">2023-08-22</div>
                            <div class="main-box2-content-management">
                            <button onclick="call_confirm()" class="management_b">삭제</button>
                            </div>
                        </div>
                    </div>

                <!-- 회원 정보 창 끝-->
            <div class="main-box2">
                
                <div class="main-box2-title">
                    <div class="main-box2-content-content">
                        <div class="main-box2-2-content-number">
                        번호
                        </div>
                        <div class="main-box2-2-content-nickname">
                        닉네임
                        </div>
                        <div class="main-box2-2-content-title">제목</div>
                        <div class="main-box2-2-content-date">작성일</div>
                        <div class="main-box2-2-content-views">조회수</div>
                        <div class="main-box2-2-content-management">관리</div>
                    </div>
                </div>

                <div class="main-box2-content">


                <div class="main-box3-1-title">
                    <div class="main-box2-content-content">
                        <div class="main-box3-1-content-number">
                        1
                        </div>
                        <div class="main-box3-1-content-nickname">
                        냐하하핳
                        </div>

                            <div class="main-box3-1-content-title">
                            <a href="../../board/views/adminReadNT.jsp">
                                요즘 근손실 너무 심한데 저 어떻하죠? ㅜㅜ
                            </a>
                            </div>
                        <div class="main-box3-1-content-date">2023-08-22</div>
                        <div class="main-box3-1-content-views">11만</div>
                        <div class="main-box3-1-content-management"><button onclick="call_confirm2()"  class="management_b">
                        글삭제
                        </button></div>
                    </div>
                </div>

                <div class="main-box3-1-title">
                    <div class="main-box2-content-content">
                        <div class="main-box3-1-content-number">
                        2
                        </div>
                        <div class="main-box3-1-content-nickname">
                        냐하하핳
                        </div>
                        <div class="main-box3-1-content-title">
                        <a href="../../board/views/adminReadNT.jsp">
                            헬린이 여자 근유통이 빡센데 원래 이런가요
                        </a>
                        </div>
                        <div class="main-box3-1-content-date">2023-08-22</div>
                        <div class="main-box3-1-content-views">5</div>
                        <div class="main-box3-1-content-management"><button onclick="call_confirm2()"  class="management_b">
                        글삭제
                        </button></div>
                    </div>
                </div>

                <div class="main-box3-1-title">
                    <div class="main-box2-content-content">
                        <div class="main-box3-1-content-number">
                        3
                        </div>
                        <div class="main-box3-1-content-nickname">
                        냐하하핳
                        </div>
                        <div class="main-box3-1-content-title">
                        <a href="../../board/views/adminReadNT.jsp">
                            오늘 가입 했어요 >_< 잘부탁드립니다
                        </a>
                        </div>
                        <div class="main-box3-1-content-date">2023-08-21</div>
                        <div class="main-box3-1-content-views">90만</div>
                        <div class="main-box3-1-content-management"><button onclick="call_confirm2()"  class="management_b">
                        글삭제
                        </button></div>
                    </div>
                </div>
                
                <!-- 회원 게시글 끝 -->
                </div>
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
    </main>
    
	<jsp:include page="../../footer.jsp"/>
</body>
</html>