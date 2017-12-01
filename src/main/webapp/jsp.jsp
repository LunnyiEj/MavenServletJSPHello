<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>
            JSP Hello
        </title>
    </head>
    <body>
        <h2>Hello from JSP and SERVLET together</h2>
        <c:set value="param.need" var="need" />
            <p>Would you like a cup of
                <c:out value="${param.need}" default="tea" escapeXml="false"/> ?
                <c:out value="${need}" default = "tea" escapeXml="false"/> ?
                <c:out value="${'need'}" default = "tea" escapeXml="false"/> ?
            <p><a href="/MavenServletJSPHello/JSPServlet?need=coffee"> try need=coffee</a></p>
            <c:if test="${param.need == 'tea'}" > Good choice! </c:if>
    </body>
</html>