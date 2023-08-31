<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>join</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/join.css">
    <script defer src ="${pageContext.request.contextPath}/js/join.js"></script>
  <%--    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>  --%>  
</head>
<body style="overflow: auto">

	<jsp:include page="../../header.jsp"/>
    
  <main>
    <div class="main-container-outline"><!--메인 시작-->
        <div class="main-container">
            <div class="main-container-up">
                <h1>회원가입</h1>
            </div>
            
            <form action="${pageContext.request.contextPath}/project/joinOk.me" 
            method="post" class="main-container-down"
            name="joinForm" onsubmit="return join()">
              
                <div class="main-container-down-section01"></div>

                <div class="main-container-section">
                  <label class="main-label1">
                    이메일
                  </label>
                  <label>
                    <input type="email" name="userEmail" 
                    placeholder="이메일" 
                    class="main-label1-input" id="mail">
                  </label>
                  <div class="checkEmail-result"></div>
       				</div>
                 <!-- 이메일 인증 추후 추가 예정!
                 <div>
                    <button class="main-b1" name="emailAuth" type="button">
                      이메일 인증하기
                    </button>
                  </div> 
                </div>

                <div class="main-container-section2">
                  <div class="main-c-s-d1">
                    <input type="emall" name="email" placeholder="인증번호" value class="main-label1-input2">
                    <div class="main-time" id="time"></div>
                    <button class="main-b3">확 인</button>
                  </div>
                </div>
                -->

                <div class="main-container-section">

                  <label class="main-label1">
                    닉네임
                  </label>
                  <div class="main-l1-d1">
                    다른 유저와 겹치지 않도록 입력해주세요. (2~15자)
                  </div>
                  <label>
                    <input type="text" name="userNickname" 
                    placeholder="닉네임" 
                    class="main-label1-input" id="uname">
                  </label>
					<div class="checkNickname-result"></div>
                </div>
				
                
                <div class="main-container-section">

                  <label class="main-label1">
                    비밀번호
                  </label>
                  <div class="main-l1-d1">
                    8~12자리의 비밀번호를 입력해주세요.
                  </div>
                  <label>
                    <input type="password" name="userPassword" 
                    placeholder="비밀번호" onchange="check_pw()"
                    class="main-label1-input" id="pw">
                  </label>

                </div>

                <div class="main-container-section">

                  <label class="main-label1">
                    비밀번호 확인
                  </label>
                  <div class="main-l1-d1">
                    비밀번호를 한 번 더 입력해 주세요.
                  </div>
                  <label>
                    <input type="password" name="userPassword" 
                    placeholder="비밀번호 확인" onchange="check_pw()"
                    class="main-label1-input" id="cpw">
                    <span id="check"></span>
                  </label>
                </div>

<!-- 카카오 API 시작 (일딴 나중에)
<script src="https://t1.kakaocdn.net/kakao_js_sdk/2.3.0/kakao.min.js"
integrity="sha384-70k0rrouSYPWJt7q9rSTKpiTfX6USlMYjZUtr1Du+9o4cGvhPAWxngdtVZDdErlh" crossorigin="anonymous">
</script><!-- 자바스크립트 SDK를 불러오는 코드 
<div class="kakao-box">
<a  id="kakao-login-btn" href="javascript:loginWithKakao()">
<img src="https://k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg" width="222"
alt="카카오 로그인 버튼" class="kakao-img"/>
</a>

<p id="token-result"></p>
<button class="api-btn" onclick="requestUserInfo()" style="visibility:hidden">
사용자 정보 가져오기
</button>

</div>

카카오 API 끝 -->

      
                <div class="main-container-section">
                  <label class="main-label1">
                    약관동의
                  </label>
                  <hr>

                  <div class="main-c-s">
                    <input type="checkbox" value="false" class="main-checkbox" name="consent">




<!--  모달 창 들어 가는 부분  -->
                    <div class="modal">
                      <div class="modal_body">
                        <strong>
                          개인정보처리동의서
                        </strong>
                        <br>
                        <br>
<span class="modal_span">
&nbsp;오운완(이하 '회사'라고 합니다)은 개인정보보호법 등 관련 법령상의 개인정보보호 규정을 준수하며 귀하의 개인정보보호에 최선을 다하고 있습니다. 회사는 개인정보보호법에 근거하여 다음과 같은 내용으로 개인정보를 수집 및 처리하고자 합니다.
<br>
<br>


&nbsp;다음의 내용을 자세히 읽어보시고 모든 내용을 이해하신 후에 동의 여부를 결정해주시기 바랍니다.
<br>
<br>



제1조(개인정보 수집 및 이용 목적)
<br>
&nbsp;이용자가 제공한 모든 정보는 다음의 목적을 위해 활용하며, 목적 이외의 용도로는 사용되지 않습니다.
<br>
- 본인확인
<br>
<br>


제2조(개인정보 수집 및 이용 항목)
<br>
&nbsp;회사는 개인정보 수집 목적을 위하여 다음과 같은 정보를 수집합니다.
<br>
- 이메일
<br>
<br>

제3조(개인정보 보유 및 이용 기간)
<br>
&nbsp;수집한 개인정보는 수집·이용 동의일로부터  3년간  보관 및 이용합니다.
&nbsp;개인정보 보유기간의 경과, 처리목적의 달성 등 개인정보가 불필요하게 되었을 때에는 지체없이 해당 개인정보를 파기합니다.
<br>
<br>


제4조(동의 거부 관리)
<br>
&nbsp;귀하는 본 안내에 따른 개인정보 수집·이용에 대하여 동의를 거부할 권리가 있습니다. 다만, 귀하가 개인정보 동의를 거부하시는 경우에 서비스 이용 일부 불가의 불이익이 발생할 수 있음을 알려드립니다.
<br>

&nbsp;본인은 위의 동의서 내용을 충분히 숙지하였으며,위와 같이 개인정보를 수집·이용하는데 동의합니다.
<br>
<br>
개인정보 수집 및 이용에 동의함
<br>
<br>
<br>
<br>


 성명 : 오운완 (서명 또는 인)
</span>
                      </div>
                    </div>
                 <button type="button" class="btn-open-popup">
                      개인정보수집 및 이용동의<p class="span-p">(필수)</p>
                    </button>

<!--모달 창 들어 가는 부분 끝 -->

                  </div>
                </div>

                <div class="main-container-section">
                  <input class="main-b2" name="emailAuth"
                  onclick="Validation()" 
                  type="button" value="회원가입하기">
                  <!-- <input type="reset" onclick="alert('초기화 했습니다.')" value="다시 입력"> -->
                </div>

            </form>
            
        </div>
    </div>
</main>
    
	<jsp:include page="../../footer.jsp"/>
	
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
 <script type="text/javascript">
 //이메일 중복검사
		 $('#mail').on('change',function(){
		     //$(여기 에있는 값이 변경 되면) 아래 내용을 체그 하겠다.
		     //HTML 문서의 .id 클래스에 속한 <input> 요소가 변경되면 아래의 함수가 실행됩니다.
		     //$(this)를 통해 변경된 <input> 요소의 값을 가져와 id 변수에 저장
		     let mail = $(this).val();
		     //이벤트의 값을 가져와서 id에 저장
		     // $(this) : 이벤트가 발생한 요소 자체
		     //val() input 태그에 들어온 요소를 반환 하는 
		     
		     console.log(this);
		     console.log(mail);
		     //변경된 요소와 id 값을 console.log()를 통해 출력

 		
 	      $.ajax({
 	         //$.ajax() 함수를 사용하여 AJAX 요청을 생성
 	         //ajax를 이용해서 key : value 값을 
 	            url : "${pageContext.request.contextPath}/project/checkEmailOk.me",
 	            //ajax 요청을 보낼 url
 	            type : "get",
 	            //get 메소드 형식
 	            data : {"mail" : mail},
 	            //data의 형식
 	            //서버 측에서 받아 처리할 데이터
 	            success : function(result){
 	            //요청이 성공적으로 완료되면 ->콜백함수
 	               console.log(result)
 	            //result 를 반환
 	               $('.checkEmail-result').text(result);
 	            //success 콜백 함수는 요청이 성공적으로 완료되었을 때 실행됩니다.
 	            //서버에서 반환한 결과를 result 변수에 저장하고, 그 결과를 콘솔에 출력합니다.
 	            //또한 .checkId-result 클래스를 가진 요소의 텍스트를 result로 설정하여 결과를 화면에 출력합니다.
 	            }
 	         })
 	});
		 
		//닉네임 중복검사
		 $('#uname').on('change',function(){
		  let uname = $(this).val();
		     
		  console.log(this);
		  console.log(uname);

 		
 	      $.ajax({
 	      url : "${pageContext.request.contextPath}/project/checkNicknameOk.me",
 	      type : "get",
 	      data : {"uname" : uname},
 	      success : function(result){
 	      console.log(result)
 	      $('.checkNickname-result').text(result);
 	      }
 	     })
 	    });
		 
		 
		 
 </script>
	
</body>

</html>