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

<jsp:include page="header.jsp" />
<body>
	<div style="margin: auto; padding: auto; text-align: center;">
		<div class="container">
			<div class="col-md-5">
				<div class="form-area">
					<form:form id="monform" action="save" modelAttribute="employee">
						<br style="clear: both">
						<h3>Add an Employee</h3>
						<div class="form-group">
							<form:input type="text" class="form-control" path="firstName"
								name="name" placeholder="First Name" />
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control" path="lastName"
								name="lastName" placeholder="Last Name" />
						</div>
						<%-- 						<div class="form-group">
							<form:input type="date" class="form-control" path="startDate"
								name="startdate" placeholder="Start Date" />
						</div>  --%>
						<div class="form-group">
							<form:input type="text" class="form-control" path="title"
								name="subject" placeholder="Title" />
						</div>
<%-- 						<div class="form-group">
							<form:input type="text" class="form-control" path="department"
								name="subject" placeholder="Departement" />
						</div> --%>
						<input type="Submit" id="submit"
							class="btn btn-primary pull-right">
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="footer.jsp" />