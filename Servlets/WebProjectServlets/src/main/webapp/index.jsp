<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Portal | Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand fw-bold" href="index.jsp">Student Portal</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#mainNavbar"
				aria-controls="mainNavbar" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="mainNavbar">
				<ul class="navbar-nav ms-auto align-items-lg-center">
					<li class="nav-item"><a class="nav-link active"
						href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#services">Services</a></li>
					<li class="nav-item"><a class="nav-link" href="#about">About
							Us</a></li>
					<li class="nav-item"><a class="nav-link" href="#contact">Contact
							Us</a></li>
				</ul>
				<div
					class="d-flex flex-column flex-lg-row gap-2 ms-lg-3 mt-3 mt-lg-0">
					<a href="login.jsp" class="btn btn-outline-light">Login</a> <a
						href="register.jsp" class="btn btn-primary">Register</a>
				</div>
			</div>
		</div>
	</nav>

	<main>
		<section class="hero-section">
			<div class="container">
				<div class="row align-items-center g-5">
					<div class="col-lg-6">
						<p class="eyebrow">YOUR LEARNING JOURNEY STARTS HERE</p>
						<h1 class="hero-title">
							Welcome to the <span>Student Portal</span>
						</h1>
						<p class="hero-description">A simple platform to create and
							access your student account. Register today and manage your
							student information in one place.</p>
						<div class="d-flex flex-wrap gap-3">
							<a href="register.jsp" class="btn btn-primary btn-lg">Get
								Started</a> <a href="login.jsp" class="btn btn-outline-dark btn-lg">Login
								to Account</a>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="hero-visual text-center">
							<div class="hero-icon" aria-hidden="true">🎓</div>
							<h2 class="h3 fw-bold">Learn. Manage. Grow.</h2>
							<p class="text-muted mb-0">A convenient place for your
								student account.</p>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section id="services" class="section-padding bg-white">
			<div class="container text-center">
				<p class="eyebrow">WHAT YOU CAN DO</p>
				<h2 class="section-title">Our Services</h2>
				<p class="section-description">Simple tools to get started with
					the Student Portal.</p>
				<div class="row g-4 mt-3">
					<div class="col-md-4">
						<article class="service-card">
							<div class="service-icon" aria-hidden="true">📝</div>
							<h3 class="h5 fw-bold">Student Registration</h3>
							<p>Create your student account using our registration form.</p>
						</article>
					</div>
					<div class="col-md-4">
						<article class="service-card">
							<div class="service-icon" aria-hidden="true">🔐</div>
							<h3 class="h5 fw-bold">Account Login</h3>
							<p>Sign in with your registered username and password.</p>
						</article>
					</div>
					<div class="col-md-4">
						<article class="service-card">
							<div class="service-icon" aria-hidden="true">👤</div>
							<h3 class="h5 fw-bold">Student Account</h3>
							<p>Access the student features made available in your
								account.</p>
						</article>
					</div>
				</div>
			</div>
		</section>

		<section id="about" class="section-padding about-section">
			<div class="container text-center">
				<p class="eyebrow">ABOUT THE PORTAL</p>
				<h2 class="section-title">About Us</h2>
				<p class="section-description">Student Portal is a web
					application project designed to demonstrate student registration
					and login using HTML, CSS, Bootstrap, Java Servlets and database
					connectivity.</p>
			</div>
		</section>

		<section id="contact" class="section-padding bg-white">
			<div class="container text-center">
				<p class="eyebrow">WE ARE HERE TO HELP</p>
				<h2 class="section-title">Contact Us</h2>
				<p class="section-description">For questions about this student
					portal, contact the project support team.</p>
				<a href="mailto:support@studentportal.com"
					class="btn btn-primary mt-3">Contact Support</a>
			</div>
		</section>
	</main>

	<footer class="site-footer bg-dark text-white text-center py-4">
		<div class="container">
			<h2 class="h5 fw-bold">Student Portal</h2>
			<p class="mb-1">Simplifying student account management.</p>
			<small>&copy; 2026 Student Portal. All Rights Reserved.</small>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
