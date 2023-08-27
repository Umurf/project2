
        function call_confirm1(){
            if(confirm("글 수정을 취소하시겠습니까?"));
            alert("글 수정이 취소되었습니다.");
            location.href="./readingMy.html";
        }

        function call_confirm2(){
            if(confirm("글을 수정하시겠습니까?")){
                alert("글이 수정되었습니다.");
            }else{
                alert("글 수정이 취소되었습니다.");
            }
        }
    