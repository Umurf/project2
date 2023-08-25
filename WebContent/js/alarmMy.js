
// 체크 박스 전체 체크 시작
var $all = $(".all");
var $inputs = $(".term");

$all.on('click',function(){
    //"all" 클래스를 가진 요소들에 대해 클릭 이벤트 리스너를 등록
    if($(this).is(":checked")){
        $inputs.prop('checked',true);
    }else{
        $inputs.prop('checked',false);
    }
})

// 삭제 컨펌 시작
function call_confirm(){

	if(confirm("정말로 삭제 하시겠습니까?")){
        alert("삭제 되었습니다!");
        window.location.href= "../../member/views/alarm.html";
	}else{
		
	}
}