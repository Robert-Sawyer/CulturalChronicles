<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Twój Profil</title>
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

<div class="pageContainer">


    <div class="pageHeader">
        <jsp:include page="../home/header.jsp"/>
    </div>

    <div class="pageContent">

        <div class="usernameContainer"></div>

        <div class="personalUserMenu"></div>

        <div class="mainPageContainer">
            <div class="leftSidePanel">

                <div class="profileAvatar"> </div>

                <div id="sinceWhen"></div>

                <div class="friends"></div>

            </div>

            <div id="lastRated"></div>

            <div id="highestRates"></div>

        </div>
    </div>

    <div class="pageFooter">
        <jsp:include page="../home/footer.jsp"/>
    </div>

</div>
</body>
</html>
