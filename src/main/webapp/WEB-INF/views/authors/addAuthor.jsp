<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Dodaj nowego autora</title>
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link rel="stylesheet" href="../../../media/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

</head>
<body>
<jsp:include page="../home/header.jsp"></jsp:include>

<div class="pageContainer">

    <div class="registerPageTitle">
        <h2>DODAJ NOWY FILM DO BAZY MOGABO</h2>
    </div>
    <div class="formContainer">
        <form:form method="post" modelAttribute="newAuthor">
            <form:errors path="*"/><br>
            Imię i nazwisko: <form:input path="name"/><br>
            Data urodzenia: <form:input path="birthDate"/><br>
            Miejsce urodzenia: <form:input path="birthPlace"/><br>
<%--            Czy żyjący?--%>
            Data śmierci:  <form:input path="deathDate"/><br>
            Miejsce śmierci: <form:input path="deathPlace"/><br>
            <input type="submit" value="Dodaj">

        </form:form>
    </div>
</div>

<jsp:include page="../home/footer.jsp"></jsp:include>

</body>
</html>
