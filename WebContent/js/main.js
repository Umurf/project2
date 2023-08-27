const btns = document.querySelectorAll("button.btn");
const banner = document.querySelector("div.banner");
const arrows = document.querySelectorAll("div.arrow");
var count = 0;

btns.forEach(function(value, index, ar){
    ar[index].addEventListener("click", function(){
        count = index;
        banner.style.transform = "translate(-" + count * 980 + "px )";
    })
});

//이전, 다음 버튼 클릭시 알맞은 배너로 이동
arrows.forEach((arrow) => {
    arrow.addEventListener("click", function(){
        let arrowType = arrow.classList[1];
        if(arrowType == 'prev' && count != 0){
            count --;
        }else if(arrowType == 'next' && count != 3 - 1){
            count ++;
        }else{
            if(count == 3 - 1){
                count = 0;
            }else{
                count = 2;
            }
        }
        banner.style.transform = "translate(-" + count * 980 + "px )";
    });
});

//setInterval 함수에 첫번째 전달된 익명함수가 3초마다 실행, 이미지가 좌우로 슬라이드 되는 효과
var time = setInterval(function (){
    count++;
    count = count == 3? 0 : count;
    banner.style.transform = "translate(-" + count * 980 + "px )";
}, 3000);