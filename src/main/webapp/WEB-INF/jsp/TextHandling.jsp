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

<div class="row" >
    <input type="text" placeholder="사진의 url을 입력해주세요"/>
    <input type="submit" />
</div>


<div class="row" >

    <textarea id="textarea" style="height: 300px;" class="col-md-8 col-md-offset-1">
asddsfasdfasdfsdfsdfsdf
afsdfsadfsdfadsvrvjyuk
asdfsdafsadfsadfsdfsdaf
    </textarea>

</div>
<div class="row" >
    <input type="text" id="console" class="col-md-8 col-md-offset-1"></div>
</div>

