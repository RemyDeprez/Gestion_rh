<body>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="style.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->
<div style="margin:auto;padding: auto; text-align: center;">
<div class="container">
<div class="col-md-5">
    <div  class="form-area">  
        <form  method="POST" id="monform" action="listemployee.html">
        <br style="clear:both">
                    <h3>Add an Employee</h3>
    				<div class="form-group">
						<input type="text" class="form-control" id="name" name="name" placeholder="First Name" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="email" name="email" placeholder="Last Name" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="mobile" name="mobile" placeholder="Start Date" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="subject" name="subject" placeholder="Title" required>
					</div>
          <div class="form-group">
            <input type="text" class="form-control" id="subject" name="subject" placeholder="Departement" required>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="subject" name="subject" placeholder="Superior" required>
          </div>
        <button type="Submit" id="submit" class="btn btn-primary pull-right">Submit Form</button>
        </form>
    </div>
</div>
</div>
</div>
</body>