<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Portal | Register</title>
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
				<ul class="navbar-nav ms-auto">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="index.jsp#services">Services</a></li>
					<li class="nav-item"><a class="nav-link"
						href="index.jsp#about">About Us</a></li>
					<li class="nav-item"><a class="nav-link"
						href="index.jsp#contact">Contact Us</a></li>
				</ul>
				<a href="login.jsp"
					class="btn btn-outline-light ms-lg-3 mt-3 mt-lg-0">Login</a>
			</div>
		</div>
	</nav>

	<main class="form-page">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-sm-10 col-md-8 col-lg-6 col-xl-5">
					<section class="form-card">
						<div class="text-center mb-4">
							<p class="eyebrow">JOIN OUR PORTAL</p>
							<h1 class="h2 fw-bold">Create Account</h1>
							<p class="text-muted mb-0">Enter your details to register.</p>
						</div>

						<form method="post" action="StudentController">
							<div class="mb-3">
								<label for="first" class="form-label">First Name</label> <input
									type="text" class="form-control" id="first" name="first"
									placeholder="Enter first name" autocomplete="given-name"
									required>
							</div>

							<div class="mb-3">
								<label for="last" class="form-label">Last Name</label> <input
									type="text" class="form-control" id="last" name="last"
									placeholder="Enter last name" autocomplete="family-name"
									required>
							</div>

							<div class="mb-3">
								<label for="username" class="form-label">Username</label> <input
									type="text" class="form-control" id="username" name="username"
									placeholder="Choose a username" autocomplete="username"
									required>
							</div>

							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" id="password"
									name="password" placeholder="Enter password"
									autocomplete="new-password" required>
							</div>

							<div class="mb-4">
								<label for="re-password" class="form-label">Confirm
									Password</label> <input type="password" class="form-control"
									id="re-password" name="re-password"
									placeholder="Re-enter password" autocomplete="new-password"
									required>
							</div>

							<button type="submit"
								class="btn btn-primary w-100 form-submit-btn">REGISTER</button>
						</form>

						<p class="text-center mt-4 mb-0">
							Already have an account? <a href="login.jsp" class="text-link">Login
								here</a>
						</p>
						<p class="text-center mt-3 mb-0">
							<a href="index.jsp" class="back-link">← Back to Home</a>
						</p>
					</section>
				</div>
			</div>
		</div>
	</main>

	<footer class="site-footer bg-dark text-white text-center py-3">
		<small>&copy; 2026 Student Portal. All Rights Reserved.</small>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
