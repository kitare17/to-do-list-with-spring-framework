<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.6.2/css/bootstrap.min.css">
</head>
<body>
<table class="table">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Description</th>
        <th>Target Date</th>
        <th>Done</th>
    </tr>

    <c:forEach var="i" items="${listToDo}">


        <tr>
            <td>${i.id}</td>
            <td>${i.username}</td>
            <td>${i.description}</td>
            <td>${i.targetDate}</td>
            <td>${i.done}</td>
            <td><button class="btn btn-warning">Delete</button></td>
        </tr>

    </c:forEach>
</table>
<button class="btn btn-success m-5 " ><a class="text-white" href="add-to-do">Add</a>
</button>



<script src="webjars/bootstrap/4.6.2/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>
