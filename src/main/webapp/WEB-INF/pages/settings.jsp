<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="style.css" rel="stylesheet"> 

<title>Settings</title>

<jsp:include page="header.jsp"/>

<body>
  <h3 style="margin-top: 25px; text-align: center;">Settings</h3>
<div class="span7">   
<div class="widget stacked widget-table action-table" style="width:80%;margin:auto;padding-top: 5%;">
            
        <div class="widget-header">
          <i class="icon-th-list"></i>
        </div> <!-- /widget-header -->
        <form method="POST" action="updateemployee">
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
                <th>Switch Manager</th>
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
<%-- 								<td><c:out value="${listEmployee.department.name}"/></td>
								<td><c:out value="${listEmployee.manager.empid}"/></td> --%>
                        <td>
                            <select id="cars" name="cars">
                              <option value="rere"></option>
                              <option value="volvo">Susan</option>
                              <option value="saab">John</option>
                            </select>
                        </td>
              </tr>

                        
              </tbody>
              </c:forEach>
            </table>
          
        </div> <!-- /widget-content -->
      
          <button id="settingbtn" class="btn btn-info float-right" type="submit">Update</button></form>
      </div> <!-- /widget -->
            </div></body>

<jsp:include page="footer.jsp"/>
