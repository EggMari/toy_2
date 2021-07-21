<%--
  Created by IntelliJ IDEA.
  User: subin
  Date: 2021-07-19
  Time: 오후 7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    function selectText() {
        var selectionText = "";
        if (document.getSelection) {
            selectionText = document.getSelection();
        } else if (document.selection) {
            selectionText = document.selection.createRange().text;
        }
        return selectionText;
    }

    document.onmouseup = function() {
        $('#console').val(selectText());
    }
    $( document ).ready(function() {
        $('#imgSrc').on('click', function (){
            let imgsrc = $('#imgUrl').val();
                console.log('구글에서 번역중');
                $.ajax({
                    url: '/veisonAPI', //request 보낼 서버의 경로
                    type: 'get', // 메소드(get, post, put 등)
                    data : {'src' : imgsrc},
                    dataType: 'text',
                    success: function (data) {
                        $('#textarea').val(data);
                        console.log(data);
                    },
                    error: function (err) {
                        alert(err);
                    }
                });
        });

    });

</script>

<div class="row">
    <input type="text" id="imgUrl" placeholder="사진의 url을 입력해주세요" class="col-md-5 col-md-offset-2"/>
    <input type="button" id="imgSrc" value="번역하기" class="col-md-2 col-md-offset-1" />
</div>


<div class="row" >

    <textarea id="textarea" style="height: 300px;" class="col-md-8 col-md-offset-1">
여기있는
        메세지를
        긁으면
        밑에
        복사가 됩니다
        엔터는 없애고요
        여기에는
        구글 비전 OCR API를 통해 나온 텍스트가
        들어올  예정입니다
    </textarea>

</div>
<div class="row" >
    <input type="text" placeholder="긁은 메세지가 나옵니다" id="console" class="col-md-5 col-md-offset-2">
    <input type="submit" value="저장하기" class="col-md-1 col-md-offset-1" />
</div>

