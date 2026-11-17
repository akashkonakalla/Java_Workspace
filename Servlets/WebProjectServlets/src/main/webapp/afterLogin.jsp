<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
    response.setHeader("Cache-Control", "no-store");

    Object usernameAttribute = session.getAttribute("username");

    if (usernameAttribute == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }

    String username = usernameAttribute.toString()
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&#39;");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Student Portal | Dashboard</title>

    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
        rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>

<body class="d-flex flex-column min-vh-100 bg-light">

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark"
         aria-label="Main navigation">
        <div class="container">
            <a class="navbar-brand fw-bold" href="afterlogin.jsp">
                Student Portal
            </a>

            <button class="navbar-toggler" type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#mainNavbar"
                    aria-controls="mainNavbar"
                    aria-expanded="false"
                    aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="mainNavbar">
                <ul class="navbar-nav ms-auto align-items-lg-center">
                    <li class="nav-item">
                        <a class="nav-link active" href="afterlogin.jsp"
                           aria-current="page">
                            Dashboard
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#account">My Account</a>
                    </li>
                </ul>

                <a href="<%= request.getContextPath() %>/LogoutController"
                   class="btn btn-outline-light ms-lg-3 my-2 my-lg-0">
                    Logout
                </a>
            </div>
        </div>
    </nav>

    <main class="flex-grow-1">
        <section class="hero-section py-5" aria-labelledby="welcomeTitle">
            <div class="container">
                <div class="row align-items-center g-5">
                    <div class="col-lg-6">
                        <p class="eyebrow text-primary fw-semibold">
                            YOUR STUDENT DASHBOARD
                        </p>

                        <h1 class="hero-title" id="welcomeTitle">
                            Welcome back,
                            <span class="text-break"><%= username %></span>!
                        </h1>

                        <p class="hero-description">
                            Welcome to your dashboard. Access your student
                            account and view your account information in one
                            place.
                        </p>

                        <a href="#account" class="btn btn-primary">
                            View My Account
                        </a>
                    </div>

                    <div class="col-lg-6">
                        <div class="hero-visual text-center bg-white
                                    rounded-4 shadow-sm p-5">
                            <div class="hero-icon display-3 mb-3"
                                 aria-hidden="true">
                                🎓
                            </div>
                            <h2 class="h3 fw-bold">Learn. Manage. Grow.</h2>
                            <p class="text-secondary mb-0">
                                A convenient place for your student account.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="pb-5" id="account" aria-labelledby="accountTitle">
            <div class="container">
                <div class="card border-0 shadow-sm rounded-4">
                    <div class="card-body p-4">
                        <h2 class="h4 fw-bold mb-4" id="accountTitle">
                            My Account
                        </h2>

                        <dl class="row mb-0">
                            <dt class="col-sm-3">Username</dt>
                            <dd class="col-sm-9 text-break">
                                <%= username %>
                            </dd>

                            <dt class="col-sm-3">Session status</dt>
                            <dd class="col-sm-9 mb-0">
                                <span class="badge text-bg-success">
                                    Signed in
                                </span>
                            </dd>
                        </dl>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <footer class="site-footer bg-dark text-white text-center py-4">
        <div class="container">
            <h2 class="h5 fw-bold">Student Portal</h2>
            <p class="mb-1">Simplifying student account management.</p>
            <small>&copy; 2026 Student Portal. All rights reserved.</small>
        </div>
    </footer>

    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js">
    </script>
</body>
</html>