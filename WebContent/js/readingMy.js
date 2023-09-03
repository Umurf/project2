
function call_confirm1(){
    if(confirm("글을 삭제하시겠습니까?")){
        alert("글이 삭제되었습니다.");
    }
}

//목록 삭제 수정 버튼 이벤트
let $listBtn = $('.list-btn');
let $modifyBtn = $('.modify-btn');
let $deleteBtn = $('.delete-btn');

// 자바스크립트에서 data 속성을 소문자로 인식함**
let fboardNumber = $('.list-btn').data("fboardnumber");
console.log(fboardNumber);

$listBtn.on('click', ()=>{
window.location.href = '/board/boardListOk.bo';
});

$modifyBtn.on('click', ()=>{
window.location.href = `/board/boardUpdate.bo?boardNumber=${fboardNumber}`;
});

$deleteBtn.on('click', ()=>{
window.location.href = `/board/boardDeleteOk.bo?boardNumber=${fboardNumber}`;
});