<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HelloWorld</title>
</head>
<body>
<div align="center">
    <h2>HELLO WORLD</h2>
    <h1>HelWorld</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Message</th>
        </tr>
        <c:forEach var="hel" items="${helworld}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${hel.message}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>