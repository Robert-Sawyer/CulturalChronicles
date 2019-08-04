<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<header class="page-header">
    <nav class="header-nav-mainlogoContent">
        <a href="/" class="navbar-brand main-logo">
            <div id="mainLogo">
                <p class="logoText">CulturalChronicles (MoGaBo)</p>
            </div>
        </a>
        <div class="search-mainDiv">
            <form class="searching-main">
                <input type="text" name="mainSearching">
                <input type="submit">
            </form>
        </div>
        <div>
            <ul>
                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item ml-4">
                        <a class="nav-link color-header" href='<c:url value="/login" />'>Logowanie</a>
                    </li>
                    <li class="nav-item ml-4">
                        <a class="nav-link color-header" href='<c:url value="/register" />'>Rejestracja</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <div class="user-main-navigation-corner">
                        <div class="user-avatar-main">
                            <p>Avatar</p>
                        </div>
                        <div class="user-nickname">
                            <p>Nazwa użytkownika</p>
                        </div>
                        <div class="user-navigation">
                            <p>Nawigacja - ustawienia, wyloguj</p>
                        </div>
                    </div>
                </sec:authorize>
            </ul>
        </div>
    </nav>
</header>

