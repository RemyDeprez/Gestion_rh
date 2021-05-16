<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
<nav class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item ">
        <a class="nav-link" href="gethome">
          <i class="fa fa-home"></i>
          <spring:message code="label.home" />
          
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="getlist">
          <i class="fa fa-home"></i>
          <spring:message code="label.totallist" />
          
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="listmanager">
          <i class="fa fa-home"></i>
          <spring:message code="label.managerlist" />
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="getemployeeonly">
          <i class="fa fa-home"></i>
          <spring:message code="label.employeelist" />
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="getsettings">
          <i class="fa fa-home"></i>
          <spring:message code="label.settings" />
      </li>
      <li class="nav-item">
        <a class="nav-link" href="getcontact">
          <i class="fa fa-home">
          </i>
          <spring:message code="label.contact" />
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="getwho">
          <i class="fa fa-home">
          </i>
          <spring:message code="label.who" />
        </a>
      </li>
      
    
  </div>
  <button class="btn btn-outline-danger float-right" type="submit" ><spring:message code="label.disconnect" /></button>
</nav>
</header>
</body>
</html>