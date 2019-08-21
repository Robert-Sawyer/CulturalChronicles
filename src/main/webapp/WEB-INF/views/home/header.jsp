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
                                <a class="search-link">
                                    <img class="search-icon" src="../../../media/images/search-icon.png">
                                </a>
                            </button>
                        </fieldset>
                    </form>
                    <div id="search-results">

                    </div>
                </div>
            </div>
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
        </div>
        <div class="header-bottom">
            <ul class="menu-bottom-list">
                <li class="menu-bottom-homepage menu-bottom-item">
                    <a href="/" class="menu-item">
                        <span>GŁÓWNA</span>
                    </a>
                </li>

                <li class="menu-bottom-cockpite menu-bottom-item">
                    <a href="/cockpite" class="menu-item">
                        <span>KOKPIT</span>
                    </a>
                </li>

                <li class="menu-bottom-base menu-bottom-item">
                    <a href="/base" class="menu-item">
                        <span>BAZA</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-items">
                            <li class="menu-submenu-item sumbenu-bottom-movies">FILMY</li>
                            <li class="menu-submenu-item sumbenu-bottom-filmmakers">TWÓRCY FILMOWI</li>
                            <li class="menu-submenu-item sumbenu-bottom-games">GRY</li>
                            <li class="menu-submenu-item sumbenu-bottom-gamemakers">TWÓRCY GIER</li>
                            <li class="menu-submenu-item sumbenu-bottom-books">KSIĄŻKI</li>
                            <li class="menu-submenu-item sumbenu-bottom-bookscreators">AUTORZY</li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-society menu-bottom-item">
                    <a href="/community" class="menu-item">
                        <span>SPOŁECZNOŚĆ</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-items">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>

                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-multimedia menu-bottom-item">
                    <a href="/multimedia" class="menu-item">
                        <span>MULTIMEDIA</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-items">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-news menu-bottom-item">
                    <a href="/news" class="menu-item">
                        <span>NEWSY</span>
                    </a>
                </li>

                <li class="menu-bottom-add-element menu-bottom-item">
                    <a href="/addToBase" class="menu-item">
                        <span>DODAJ DO BAZY</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-items">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-adapt-content menu-bottom-item">
                    <a href="/adjustContent" class="menu-item">
                        <span>DOPASUJ TREŚĆ</span>
                    </a>
                    <div class="header-bottom-submenu">
                        <ul class="submenu-items">
                            <li class="menu-submenu-item sumbenu-bottom-movies"></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-bottom-appguide menu-bottom-item">
                    <a href="/guide" class="menu-item">
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

