  //모달창 js
  const body = document.querySelector('body');
  const modal = document.querySelector('.modal');
  const btnOpenPopup = document.querySelector('.btn-open-popup');
  
  btnOpenPopup.addEventListener('click', () => {
   modal.classList.toggle('show');
  //모달 on
  
  if (modal.classList.contains('show')) {
  body.style.overflow = 'hidden';
  //모달 off
  }
  });
  
  modal.addEventListener('click', (event) => { if (event.target === modal) {
  modal.classList.toggle('show');
  //class를 이용한 모달 on/off
  
  if (!modal.classList.contains('show')) {
  body.style.overflow = 'auto';
  }
  }
  });
  //모달창 js 끝
  
  //타이머 js
  var time = 300; //기준시간 작성
    var min = ""; //분
    var sec = ""; //초
  
    //setInterval(함수, 시간) : 주기적인 실행
    var x = setInterval(function() {
      //parseInt() : 정수를 반환
      min = parseInt(time/60); //몫을 계산
      sec = time%60; //나머지를 계산
  
      document.getElementById("time").innerHTML = min + "분" + sec + "초";
      time--;
  
      //타임아웃 시
      if (time < 0) {
        clearInterval(x); //setInterval() 실행을 끝냄
        document.getElementById("time").innerHTML = "시간초과";
      }
    }, 1000);
  //타이머 js 끝

  // 카카오 로그인 js
  Kakao.init('9d2c7e5807b33c53f10c923cd24b2fbb'); 
  //사용하려는 앱의 JavaScript 키 입력

  function loginWithKakao() {
    Kakao.Auth.authorize({
      redirectUri: 'http://localhost:8888/oww_team_project/index.jsp',
      state: 'userme',
    });
  }
  
  function requestUserInfo() {
    Kakao.API.request({
      url: '/v2/user/me',
    })
      .then(function(res) {
        //사용자 정보 처리
        // alert(JSON.stringify(res));

        // var useremail = res.properties.email;

        // //사용자 정보를 페이지에 표시
        // document.getElementById('user-email').textContent = useremail;
      
      })
      .catch(function(err) {
        alert(
          'failed to request user information: ' + JSON.stringify(err)
        );
      });
  }
  
  // 아래는 데모를 위한 UI 코드입니다.
  displayToken()
  function displayToken() {
    var token = getCookie('authorize-access-token');
  
    if(token) {
      Kakao.Auth.setAccessToken(token);
      document.querySelector('#token-result').innerText = 'login success, ready to request API';
      document.querySelector('button.api-btn').style.visibility = 'visible';
      //버튼을 보이게 함.
    }
  }
  
  function getCookie(name) {
    var parts = document.cookie.split(name + '=');
    if (parts.length === 2) { return parts[1].split(';')[0]; }
  }

    // 카카오 로그인 js 끝
    
/*-----비밀번호 확인 js 시작-----*/
/*        function check_pw(){
            var pw = document.getElementById('pw').value;
            var SC = ["!","@","#","$","%","^","&","*","(",")","~","`","?"];
            var check_SC = 0;
 
            if(pw.length < 8 || pw.length>12){
                window.alert('비밀번호는 8글자 이상, 12글자 이하만 이용 가능합니다.');
                document.getElementById('pw').value='';
            }
            for(var i=0;i<SC.length;i++){
                if(pw.indexOf(SC[i]) != -1){
                    check_SC = 1;
                }
            }
            if(check_SC == 0){
                window.alert('!,@,#,$,% 등의 특수문자가 들어가 있지 않습니다.')
                document.getElementById('pw').value='';
            }
            if(document.getElementById('pw').value !='' && document.getElementById('pw2').value!=''){
                if(document.getElementById('pw').value==document.getElementById('pw2').value){
                    document.getElementById('check').innerHTML='비밀번호가 일치합니다.'
                    document.getElementById('check').style.color='blue';
                }
                else{
                    document.getElementById('check').innerHTML='비밀번호가 일치하지 않습니다.';
                    document.getElementById('check').style.color='red';
                }
            }
        }*/
/*-----비밀번호 확인 js 종료----- */
/*-----유효성 검사의 시작-----*/
    // 유효성 검사 메서드
    function Validation() {
        //변수에 저장
        var pw = document.getElementById("pw")
        var cpw = document.getElementById("cpw")
        var mail = document.getElementById("mail")
        var name = document.getElementById("uname")
        var hobby = document.getElementsByName("consent")
        var joinForm = document.joinForm;

        // 정규식
        // id, pw
        var regIdPw = /^[a-zA-Z0-9]{8,12}$/;
        // 이름
        var regName = /^[가-힣a-zA-Z]{2,15}$/;
        // 이메일
        var regMail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;

        //메일주소 확인
        if(mail.value.length == 0){
            alert("메일주소를 입력하세요.")
            mail.focus();
            return false;
        }
        
        //이름 확인 = 한글과 영어만 가능하도록
        if(name.value == ""){
            alert("닉네임을 입력하세요.")
            name.focus();
            return false;
        }

        else if(!regName.test(name.value)){
            alert("닉네임을 최소 2글자 이상, 한글과 영어만 입력하세요.")
            name.focus();
            return false;
        }
        
        
        //비밀번호 확인
        if(pw.value == ""){
            alert("비밀번호를 입력하세요.")
            pw.focus();
            return false;
        }
        //비밀번호 영어 대소문자 확인
        else if(!regIdPw.test(pw.value)){
            alert("비밀번호를 8~12자 영문 대소문자, 숫자만 입력하세요.")
            pw.focus();
            return false;
        }

        //비밀번호 확인
        if(cpw.value !== pw.value){
            alert("비밀번호와 동일하지 않습니다.")
            cpw.focus();
            return false;
        }



        else if(!regMail.test(mail.value)){
            alert("잘못된 이메일 형식입니다.")
            mail.focus();
            return false;
        }


        //개인정보처리동의서 확인
        if(!checkedHobby(hobby)){
            alert("개인정보처리동의서를 체크하세요.")
            hobby.focus();
            return false;
        }



    //관심분야 체크 확인
    function checkedHobby(arr){
        for(var i=0; i<arr.length; i++){
            if(arr[i].checked == true){
                return true;
            }
        }
        return false;
    }
    
     // 유효성 문제 없을 시 폼에 submit
       document.joinForm.submit();
    }
/*-----유효성 검사의 종료-----*/












