<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="style.css" rel="stylesheet">

<title><spring:message code="label.titleupdate" /></title>

<jsp:include page="header.jsp" />

<body>
	<h3 style="margin-top: 25px; text-align: center;"><spring:message code="label.titleupdate" /></h3>
					<button style="margin-right: 150px; text-align: center;" id="settingbtn" class="btn btn-info float-right"
					type="submit"><spring:message code="label.update" /></button>
	<div class="span7">
		<div class="widget stacked widget-table action-table"
			style="width: 80%; margin: auto; padding-top: 5%;">

			<div class="widget-header">
				<i class="icon-th-list"></i>
			</div>
			<!-- /widget-header -->
			<form method="POST" action="updateemployee">
				<div class="widget-content">

					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>ID</th>
							<th><spring:message code="label.firstname" /></th>
							<th><spring:message code="label.lastname" /></th>
							<th><spring:message code="label.startdate" /></th>
							<th><spring:message code="label.title" /></th>
							<th><spring:message code="label.switch" /></th>
							</tr>
						</thead>
						<c:forEach items="${listUnManaged}" var="listUnManaged">
							<tbody>
								<tr>
									<td><c:out value="${listUnManaged.empId}" /></td>
									<td><c:out value="${listUnManaged.firstName}" /></td>
									<td><c:out value="${listUnManaged.lastName}" /></td>
									<td><c:out value="${listUnManaged.startDate}" /></td>
									<td><c:out value="${listUnManaged.title}" /></td>
								<%--<td><c:out value="${listEmployee.department.name}"/></td>
									<td><c:out value="${listEmployee.manager.empid}"/></td> --%>
									
										
										<td><select id="managers" name="managers">
										<option><spring:message code="label.switch" /></option>
										<c:forEach items="${listManager}" var="listManager">
											<option>
												<c:out value="${listManager.firstName} ${listManager.lastName }" />
											</option>
										</c:forEach>		
											</select></td>
									</c:forEach>

							</tbody>
						

						
						
					</table>

				</div>
				<!-- /widget-content -->

				<button id="settingbtn" class="btn btn-info float-right"
					type="submit">Update</button>
			</form>
		</div>
		<!-- /widget -->
	</div>
</body>
<jsp:include page="footer.jsp" />