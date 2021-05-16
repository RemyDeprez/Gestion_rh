<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="style.css" rel="stylesheet">
<title><spring:message code="label.home" /></title>
<jsp:include page="publicheader.jsp"/>
<body>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab"><spring:message code="label.signin" /></label> <input id="tab-2"
				type="radio" name="tab" class="for-pwd"><label for="tab-2"
				class="tab"><spring:message code="label.forgotusername" /></label>
			<div class="login-form">
			
			
			
			<!-- <a href="getlist">Connection</a> -->
			
			
			
 				<form:form action="getlist" method="get" modelAttribute="string">
					<div class="sign-in-htm">
						<div class="group">
							<label for="user" class="label"><spring:message code="label.useror" /></label> <input
								id="user" type="text" class="input" name ="login" path="login"></input>
						</div>
						<div class="group">
							<label for="pass" class="label"><spring:message code="label.password" /></label> 
							<input id="pass"
								type="password" class="input" data-type="password" name="password" path="password"></input>
						</div>
						<div class="group">
							<input type="submit" class="button" value="<spring:message code="label.signin" />">
						</div>
						<div class="hr"></div>
					</div>
					<div class="for-pwd-htm">
						<div class="group">
							<label for="user" class="label"><spring:message code="label.useror" /></label> <input
								id="user" type="text" class="input">
						</div>
						<div class="group">
							<input type="submit" class="button" value="<spring:message code="label.reset" />">
						</div>
						<div class="hr"></div>
					</div>
				</form:form> 
			</div>
		</div>
	</div>
</body>
<jsp:include page="footer.jsp" />