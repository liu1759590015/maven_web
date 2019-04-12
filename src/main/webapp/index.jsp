<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
    <tr>
        <th>图书编号</th>
        <th>图书名称</th>
        <th>图书作者</th>
        <th>出版时间</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.author}</td>
            <td>${list.publishTime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
