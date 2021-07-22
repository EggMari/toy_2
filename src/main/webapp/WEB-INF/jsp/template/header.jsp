<%--
  Created by IntelliJ IDEA.
  User: subin
  Date: 2021-07-10
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav">
        <li class="active"><a href="./">토이프로젝트</a></li>
         <c:forEach items="${menus}" var="menu">
             <li><a href="${menu.menuSrc}">${menu.menuName}</a></li>
         </c:forEach>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
            Launch demo modal
        </button></li>
        <li class="active"><a href="/">Default <span class="sr-only">Main</span></a></li>
        <li><a href="https://github.com/EggMari">깃허브</a></li>
    </ul>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="userid" class="control-label">아이디</label>
                        <input type="text" class="form-control" id="userid">
                    </div>
                    <div class="form-group">
                        <label for="userpwd" class="control-label">비밀번호</label>
                        <input type="text" class="form-control" id="userpwd">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <a href="/joinToy">회원가입</a>
                <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                <button type="button" class="btn btn-primary">로그인</button>
            </div>
        </div>
    </div>
</div>