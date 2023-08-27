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
      redirectUri: 'http://127.0.0.1:5501/main/pro/main.html',
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