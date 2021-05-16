<link href="/style/style.css" rel="stylesheet">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<header>
	<nav
		class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="gethome">
						<i class="fa fa-home"></i><spring:message code="label.home" /> </li>
				<li class="nav-item"><a class="nav-link" href="getcontact">
						<i class="fa fa-envelope-o"> </i> <spring:message code="label.contact" />
				</a></li>
				<li class="nav-item"><a class="nav-link " href="getwho">
						<i class="fa fa-envelope-o"> </i><spring:message code="label.who" />
				</a></li>
		</div>
	</nav>
</header>