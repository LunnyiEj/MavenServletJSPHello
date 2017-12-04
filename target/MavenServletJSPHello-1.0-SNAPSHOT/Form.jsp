<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
    <style>
        body {
            background: #e09c3e; /* Цвет фона */
            color: #490001; /* Цвет текста */
        }
    </style>
</head>
<body>
<center><br><br>
<h2>В кружке <c:out value="${cup.getSipCount()}"/> глотков чая.</h2>
<form method="post">Ваши действия? <br>
    <input type="submit" value="Налить полную кружку" name="fillTheCup"/>

    <input type="submit" value="Отхлебнуть" name="sip"/>

    <br />
</form>
</center>
</body>
</html>
