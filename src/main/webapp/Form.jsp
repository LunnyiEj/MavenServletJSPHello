<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LunnyiEj
  Date: 30.11.2017
  Time: 2:37
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Form + jstl</title>
</head>
<body>
<c:set var="test" value="5" scope="request"/>
<h2>В кружке <c:out value="${test}"/> глотков</h2>
<h2>В кружке <c:out value="${'test'}"/> глотков</h2>
<h2>В кружке <c:out value="${test}" escapeXml="false"/> глотков</h2>
<h2>В кружке <c:out value="${'test'}" escapeXml="false"/> глотков</h2>
${test} ${"test"}

<c:out value="cup.getSipCount()"/>

</body>
</html>
