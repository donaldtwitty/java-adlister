<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads</h1>
<c:forEach items="${ads}" var="ad">
    <p>${ad.title}</p>
    <p>${ad.description}</p>
    <p>${ad.datePosted}</p>
</c:forEach>

</body>
</html>
