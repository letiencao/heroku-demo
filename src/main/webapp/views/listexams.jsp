<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List All Exams</title>
</head>
<body>
<h1>List All Exams:</h1>
<a href="../../home">
  bach home
</a>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Duration</th>
        <th>Create At</th>
        <th>Updated At</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="exam" items="${exams}">
        <tr>
            <td>${exams.getId()}</td>
            <td>${exams.getName()}</td>
            <td>${exams.getDuration()}</td>
            <td>${exams.getDescription()}</td>
            <td>${exams.getCreate_at()}</td>
            <td>${exams.getUpdated_at()}</td>
            <td>
                <a href="../../${exams.getId()}">
                  edit
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>