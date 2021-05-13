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


<title>Managers List</title>

<jsp:include page="header.jsp" />

<h3 style="margin-top: 25px; text-align: center;">Manager List</h3>

<body>
	<div class="span7">
		<div class="widget stacked widget-table action-table"
			style="width: 80%; margin: auto; padding-top: 5%;">

			<div class="widget-header">
				<i class="icon-th-list"></i>
				<a href="addemployee" class="btn btn-info float-right" type="submit" >Add
						an Employee</a>
			</div>
			<!-- /widget-header -->

			<div class="widget-content">

				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Start Date</th>
							<th>Title</th>
<!-- 							<th>Departement</th>--->
							<!-- <th>Superior</th>  -->
							<th class="td-actions">Actions</th>
						</tr>
					</thead>
					<c:forEach items="${listEmployee}" var="listEmployee">
					<tbody>
						<tr>
							
         						<td><c:out value="${listEmployee.empId}" /></td>
								<td><c:out value="${listEmployee.firstName}" /></td>
								<td><c:out value="${listEmployee.lastName}" /></td>
								<td><c:out value="${listEmployee.startDate}" /></td>
								<td><c:out value="${listEmployee.title}" /></td>
<!-- 								<td></td>
								<td></td -->
								<%-- <td><c:out value="${listEmployee.department}" /></td> --%> 	
								 				
								 <%-- <td><c:out value="${listEmployee.employee.firstName}" /></td> --%>
								 
								 
							<td class="text-center"><a class='btn btn-info btn-xs'
								href="getupdateform"><span
									class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#"
								class="btn btn-danger btn-xs"><span
									class="glyphicon glyphicon-remove"></span> Del</a></td>
						</tr>
					</tbody>
					</c:forEach>
				</table>

			</div>
			<!-- /widget-content -->

		</div>
		<!-- /widget -->
	</div>
</body>
<jsp:include page="footer.jsp" />


