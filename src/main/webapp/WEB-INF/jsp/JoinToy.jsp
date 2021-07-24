<%--
  Created by IntelliJ IDEA.
  User: subin
  Date: 2021-07-24
  Time: 오후 5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-md-5 col-md-offset-3">
    <form>
        <div class="form-group">
            <label for="id">아이디</label>
            <input type="email" class="form-control" id="id" placeholder="아이디를 입력하세요">
        </div>
        <div class="form-group">
            <label for="pwd">암호</label>
            <input type="password" class="form-control" id="pwd" placeholder="암호">
        </div>
        <div class="form-group">
            <label for="exampleInputFile">파일 업로드</label>
            <input type="file" id="exampleInputFile">
            <p class="help-block">여기에 블록레벨 도움말 예제</p>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox"> 입력을 기억합니다
            </label>
        </div>
        <button type="submit" class="btn btn-default">제출</button>
    </form>
</div>

</body>
</html>
