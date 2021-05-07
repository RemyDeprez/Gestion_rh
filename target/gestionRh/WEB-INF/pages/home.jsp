
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="/css/style.css" rel="stylesheet">

<jsp:include page="/pages/publicheader.jsp"/>
<body>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab">Sign In</label> <input id="tab-2"
				type="radio" name="tab" class="for-pwd"><label for="tab-2"
				class="tab">Forgot Password</label>
			<div class="login-form">
				<form method="post" action="listemployee.html">
					<div class="sign-in-htm">
						<div class="group">
							<label for="user" class="label">Username or Email</label> <input
								id="user" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label> <input id="pass"
								type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<input type="submit" class="button" value="Sign In">
						</div>
						<div class="hr"></div>
					</div>
					<div class="for-pwd-htm">
						<div class="group">
							<label for="user" class="label">Username or Email</label> <input
								id="user" type="text" class="input">
						</div>
						<div class="group">
							<input type="submit" class="button" value="Reset Password">
						</div>
						<div class="hr"></div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<jsp:include page="/pages/footer.jsp" />