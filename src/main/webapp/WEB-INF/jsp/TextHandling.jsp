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
       $('#console').val(selectText()) ;
    }
</script>

<div class="row" class="col-md-10 col-md-offset-1">
    <input type="text" placeholder="사진의 url을 입력해주세요"/>
    <input type="submit" />
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
<div class="row col-md-12" >
    <input type="text" id="console" class="col-md-5 col-md-offset-1"></div>
    <input type="submit" class="col-md-2" />
</div>

