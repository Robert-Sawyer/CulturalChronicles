<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<header>
    <div class="page-header">
        <div class="header-top">
            <div class="logo-container">
                <a class="header-logo" href="/" title="Cultural Chronicles - MoGaBo">
                    <div id="main-Logo">
                        <p class="logoText">CulturalChronicles <br>(MoGaBo)</p>
                    </div>
                </a>
            </div>
            <div class="search-container">
                <div class="search-Main">
                    <form id="search-form">
                        <fieldset class="search-fiedset">
                            <input id="input-search-main" class="form-input"
                                   placeholder="Szukaj filmów, gier, lub książek">
                            <button class="search-button">
                                <img class="search-icon" src="../../../media/images/search-icon.png">
                            </button>
                        </fieldset>
                    </form>
                    <div id="search-results">

                    </div>
                </div>
            </div>
            <sec:authorize access="!isAuthenticated()">
                <div class="header-top-login">
                    <ul class="not-login-list">
                        <li class="not-login-item">
                            <a class="not-login-link" href='<c:url value="/login" />'>LOGOWANIE</a>
                        </li>
                        <li class="not-login-item">
                            <a class="not-login-link" href='<c:url value="/register" />'>REJESTRACJA</a>
                        </li>
                    </ul>
                </div>
            </sec:authorize>

            <sec:authorize access="isAuthenticated()">
                <div class="user-header-panel">
                    <div id="userHeaderButton">
                        <a href="/user/Robert_Sawyer" class="user-profile__wrapper">
                                <span class="user__avatar ">
                                    <img src="https://1.fwcdn.pl/u/44/35/1974435/1974435.2.jpg"
                                         alt="Robert Sawyer - avatar">
                                </span>

                            <div class="user__profile__wrapper">
                                    <span class="user__name-wrap">
                                        <span class="user__name">Robert Sawyer</span>
                                    </span>
                            </div>
                        </a>

                        <span id="userMenuToggle" class="user-menu_toggle">
                                <i class="ico ico--arrowDown"></i>
                                <span id="userCounter" class="user-menu_toggle__notifications hide"></span>
                            </span>
                        <div id="userMenu">
                            <ul class="list">
                                <li class="item-user item-extra">
                                    <div class="user-extra">
                                        <ul class="list list__display--inline">
                                            <li class="item">
                                                <button class="user-extra-button"
                                                        id="assistantOpener"
                                                        href="#">ASYSTENT
                                                </button>
                                                <span class="badge badge__primary hidden-md-down hide"
                                                      id="assistantCounter"></span></li>
                                            <li class="item">
                                                <button class="user-extra-button"
                                                        id="notificatonsOpener"
                                                        href="#">POWIADOMIENIA
                                                </button>
                                                <span class="badge badge__primary hidden-md-down hide"
                                                      id="notificationsCounter"></span></li>
                                        </ul>
                                    </div>
                                </li>

                                <li class="item-user"><a id="ga_AssistantMail"
                                                         href="/messages">POCZTA</a><span
                                        class="badge badge__primary hidden-md-down hide"
                                        id="messagesCounter"></span></li>
                                <li class="item-user"><a id="ga_AssistantSettings" href="/settings">USTAWIENIA</a>
                                </li>
                                <li class="item-user"><a id="ga_AssistantLogout"
                                                         href="/logout">WYLOGUJ</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </sec:authorize>
        </div>

        <div class="header-bottom">
            <ul class="menu-bottom-list">
                <li class="menu-bottom-homepage menu-bottom-item">
                    <a href="/" class="menu-link">
                        <span>GŁÓWNA</span>
                    </a>
                </li>

                <li class="menu-bottom-cockpite menu-bottom-item">
                    <a href="/cockpite" class="menu-link">
                        <span>KOKPIT</span>
                    </a>
                </li>

                <li class="menu-bottom-base menu-bottom-item">
                    <a href="/base" class="menu-link">
                        <span>BAZA</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-bottom-list">
                            <li class="menu-submenu-item sumbenu-bottom-movies">
                                <a href="/movies" class="submenu-link">
                                    <span>FILMY</span>
                                </a>
                            </li>
                            <li class="menu-submenu-item sumbenu-bottom-filmmakers">
                                <a href="/moviemakers" class="submenu-link">
                                    <span>TWÓRCY FILMOWI</span>
                                </a>
                            </li>
                            <li class="menu-submenu-item sumbenu-bottom-games">
                                <a href="/games" class="submenu-link">
                                    <span>GRY</span>
                                </a>
                            </li>
                            <li class="menu-submenu-item sumbenu-bottom-gamemakers">
                                <a href="/gamemakers" class="submenu-link">
                                    <span>TWÓRCY GIER</span>
                                </a>
                            </li>
                            <li class="menu-submenu-item sumbenu-bottom-books">
                                <a href="/books" class="submenu-link">
                                    <span>KSIĄŻKI</span>
                                </a>
                            </li>
                            <li class="menu-submenu-item sumbenu-bottom-bookscreators">
                                <a href="/bookcreators" class="submenu-link">
                                    <span>AUTORZY</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-society menu-bottom-item">
                    <a href="/community" class="menu-link">
                        <span>SPOŁECZNOŚĆ</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-bottom-list">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>

                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-multimedia menu-bottom-item">
                    <a href="/multimedia" class="menu-link">
                        <span>MULTIMEDIA</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-bottom-list">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-news menu-bottom-item">
                    <a href="/news" class="menu-link">
                        <span>NEWSY</span>
                    </a>
                </li>

                <li class="menu-bottom-add-element menu-bottom-item">
                    <a href="/addToBase" class="menu-link">
                        <span>DODAJ DO BAZY</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-bottom-list">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-adapt-content menu-bottom-item">
                    <a href="/adjustContent" class="menu-link">
                        <span>DOPASUJ TREŚĆ</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-bottom-list">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-appguide menu-bottom-item">
                    <a href="/guide" class="menu-link">
                        <span>PRZEWODNIK PO SERWISIE</span>
                    </a>
                </li>
            </ul>
        </div>

        <div class="header-main-panel">
        </div>
    </div>
</header>
<%--<header>--%>
<%--    <nav class="header-nav-mainlogoContent">--%>
<%--        <a href="/" class="navbar-brand main-logo">--%>
<%--            <div id="mainLogo">--%>
<%--                <p class="logoText">CulturalChronicles (MoGaBo)</p>--%>
<%--            </div>--%>
<%--        </a>--%>
<%--        <div class="search-mainDiv">--%>
<%--            <form class="searching-main">--%>
<%--                <input type="text" name="mainSearching">--%>
<%--                <input type="submit">--%>
<%--            </form>--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <ul>--%>
<%--                <sec:authorize access="!isAuthenticated()">--%>
<%--                    <li class="nav-item ml-4">--%>
<%--                        <a class="nav-link color-header" href='<c:url value="/login" />'>Logowanie</a>--%>
<%--                    </li>--%>
<%--                    <li class="nav-item ml-4">--%>
<%--                        <a class="nav-link color-header"--%>
<%--                           href='<c:url value="/register" />'>Rejestracja</a>--%>
<%--                    </li>--%>
<%--                </sec:authorize>--%>
<%--                <sec:authorize access="isAuthenticated()">--%>
<%--                    <div class="user-main-navigation-corner">--%>
<%--                        <div class="user-avatar-main">--%>
<%--                            <p>Avatar</p>--%>
<%--                        </div>--%>
<%--                        <div class="user-nickname">--%>
<%--                            <p>Nazwa użytkownika</p>--%>
<%--                        </div>--%>
<%--                        <div class="user-navigation">--%>
<%--                            <p>Nawigacja - ustawienia, wyloguj</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </sec:authorize>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--    </nav>--%>
<%--</header>--%>

