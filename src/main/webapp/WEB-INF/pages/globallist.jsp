
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="style.css" rel="stylesheet">

<jsp:include page="/pages/publicheader.jsp"/>
<h3 style="margin-top: 25px; text-align: center;">Global List</h3>
<body>
		<div class="btn-toolbar">
    
    </div>
<div class="span7">  

<div class="widget stacked widget-table action-table" style="width:80%;margin:auto;padding-top: 5%;">
				<div class="widget-header">
					<form method="POST" action="addemployee.html">
					<button class="btn btn-info float-right" type="submit">Add an Employee</button></form>
					<i class="icon-th-list"></i>
				</div> <!-- /widget-header -->
				
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
						<tbody>
							<tr onclick="window.location='updateemployee.html'">
								<td>3</td>
                				<td>news3</td>
                				<td>news3</td>
                				<td>news2</td>
                				<td>news2</td>
                				<td>news2</td>
                				<td>news2</td>
                				<td class="text-center"><a class='btn btn-info btn-xs' href="updateemployee.html"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a></td>
							</tr>
							             <tr onclick="window.location='updateemployee.html'">
                <td>3</td>
                        <td>news3</td>
                        <td>news3</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td class="text-center"><a class='btn btn-info btn-xs' href="updateemployee.html"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a></td>
              </tr>
							<tr onclick="window.location='updateemployee.html'">
                <td>3</td>
                        <td>news3</td>
                        <td>news3</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td>news2</td>
                        <td class="text-center"><a class='btn btn-info btn-xs' href="updateemployee.html"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a></td>
              </tr>
							</tbody>
						</table>
					
				</div> <!-- /widget-content -->
			
			</div> <!-- /widget -->
            </div>

</body>
<jsp:include page="/pages/footer.jsp"/>