<%--
  Created by IntelliJ IDEA.
  User: Robert
  Date: 11.07.2019
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Logowanie</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link rel="stylesheet" href="../../../media/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="pageContainer">
    <div class="pageContent">
        <div class="registerPageTitle">
            <h2>LOGOWANIE</h2>
        </div>
        <div class="formContainer">
            <form method="post" action="/login">
                <c:if test="${param.error != null}">
                    <span>Nieprawidłowe dane</span>
                </c:if>
                <c:if test="${param.logout != null}">
                    <span>Zostałeś wylogowany</span>
                </c:if>
                Login: <input type="text" name="login" required min="3" max="20"/><br>
                Hasło: <input type="password" name="password" required min="3" max="20"/><br>
                Zapamiętaj mnie: <input type="checkbox" name="remember-me"/> <br>
                <input type="submit" name="login" value="Zaloguj">

            </form>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
