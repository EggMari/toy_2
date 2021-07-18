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
        <li class="active"><a href="/">Default <span class="sr-only">Main</span></a></li>
        <li><a href="https://github.com/EggMari">깃허브</a></li>
    </ul>
</div>
