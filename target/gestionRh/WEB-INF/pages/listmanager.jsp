<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="style.css" rel="stylesheet">

<title>Managers List</title>


 <jsp:include page="header.jsp"/>

<h3 style="margin-top: 25px; text-align: center;">Managers List</h3>
<body>
	<div class="btn-toolbar"></div>
	<div class="span7">

		<div class="widget stacked widget-table action-table"
			style="width: 80%; margin: auto; padding-top: 5%;">
			<div class="widget-header">
				
					<a href="addemployee" class="btn btn-info float-right" type="submit" >Add
						a Manager</a>
				
				<i class="icon-th-list"></i>
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
 							<th>Departement</th>
							<th>Superior</th>  
							<th class="td-actions">Actions</th>
						</tr>
					</thead>
					<c:forEach items="${listEmployee}" var="manager">
					<tbody>
						<tr>
							
         						<td><c:out value="${manager.empId}" /></td>
								<td><c:out value="${manager.firstName}" /></td>
								<td><c:out value="${manager.lastName}" /></td>
								<td><c:out value="${manager.startDate}" /></td>
								<td><c:out value="${manager.title}" /></td>	 
								<td><c:out value="${manager.department.deptId}" /></td>	 				
								<td><c:out value="${manager.employee.empId}" /></td>   
								<td class="text-center">
							 		<a class='btn btn-info btn-xs' href="updateemployee/${manager.empId}">
							 		<span class="glyphicon glyphicon-edit"></span> Edit</a>
							 		<a href="deleteemployee/${manager.empId}" class="btn btn-danger btn-xs" onclick="return confirm('Are you sure you want to delete?')">
							 		<span class="glyphicon glyphicon-remove"></span> Del</a>
								</td>
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
<footer>

  <img style="width:25px;height:25px" src="en.jpg">
  <img style="width:25px;height:25px" src="fr.png">

  <p>?AFPA 2020-2021</p>
</footer>


