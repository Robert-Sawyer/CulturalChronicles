<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista autorów</title>
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link rel="stylesheet" href="../../../media/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

</head>
<body>
<jsp:include page="../home/header.jsp"></jsp:include>
<div class="pageContainer">
    <div class="authorsList">
        <ul>
            <c:forEach items="${authors}" var="author">
                <li>
                    <table>
                        <tr>
                            <td>${author.name}</td>
                            <td>${author.books}</td>
                            <td>${author.birthDate}</td>
                            <td>${author.deathDate}</td>
                        </tr>
                    </table>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<jsp:include page="../home/footer.jsp"></jsp:include>

</body>
</html>
