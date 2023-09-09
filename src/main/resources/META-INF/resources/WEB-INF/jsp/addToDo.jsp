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
  <h1 class="text-center">Add a new To-do</h1>
  <hr>
  <%--@elvariable id="todo" type=""--%>
  <form:form action="add-to-do" method="post" modelAttribute="todo" >

      <div style="height: 600px " class="m-5 d-flex flex-column justify-content-around">
          <span>Username</span>
          <form:input path="id" type="hidden" ></form:input>
          <form:input  path="username" />


          <span>Description</span>

          <form:textarea path="description" id="" cols="30" rows="10" ></form:textarea>

          <span>Date</span>
          <form:input   path="targetDate"/>

          <input class="btn btn-success" type="submit">

      </div>

  </form:form>

  <script src="webjars/bootstrap/4.6.2/js/bootstrap.min.js"></script>
  <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>

