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