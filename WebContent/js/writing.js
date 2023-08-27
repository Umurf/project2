function call_confirm1(){
    if(confirm("글 작성을 취소하시겠습니까?")){
        alert("글 작성이 취소되었습니다.");
    }else{

    }
}
    function call_confirm2(){
    if(confirm("글을 등록하시겠습니까?")){
        alert("글이 등록되었습니다.");
        location.href="./readingMy.html";
    }else{

    }
}
