<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="style.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="header.jsp"/>

<title><spring:message code="label.contactme" /></title>

<div class="container" style="text-align: center;">
<div class="col-md-5">
    <div class="form-area">  
        <form role="form">
        <br style="clear:both">
                    <h3 style="margin-top: 25px; text-align: center;"><spring:message code="label.contactme" /></h3>
    				<div class="form-group">
						<input type="text" class="form-control" id="name" name="name" placeholder="<spring:message code="label.lastname" />" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="email" name="email" placeholder="E-Mail" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="mobile" name="mobile" placeholder="<spring:message code="label.mobile" />" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="subject" name="subject" placeholder="<spring:message code="label.subject" />" required>
					</div>
                    <div class="form-group">
                    <textarea class="form-control" type="textarea" id="message" placeholder="Message" maxlength="140" rows="7"></textarea>                    
                    </div>
            
        <button type="button" id="submit" name="submit" class="btn btn-primary pull-right">Submit Form</button>
        </form>
    </div>
</div>
</div>
<jsp:include page="footer.jsp"/>



