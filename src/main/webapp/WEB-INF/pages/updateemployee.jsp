<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="style.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->

<title>Update Employees</title>
<header>
<nav class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item ">
        <a class="nav-link" href="index.html">
          <i class="fa fa-home"></i>
          Home
          
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="listemployee.html">
          <i class="fa fa-home"></i>
          Total List
          
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="listManager.html">
          <i class="fa fa-home"></i>
          Manager
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="listemployeeonly.html">
          <i class="fa fa-home"></i>
          Employee
      </li>
            <li class="nav-item ">
        <a class="nav-link" href="settings.html">
          <i class="fa fa-home"></i>
          Settings
      </li>
      <li class="nav-item">
        <a class="nav-link" href="contact.html">
          <i class="fa fa-home">
          </i>
          Contact
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="whoami.html">
          <i class="fa fa-home">
          </i>
          Who am I ?
        </a>
      </li>
      
    
  </div>
  <button class="btn btn-outline-danger float-right" type="submit" >Disconnect</button>
</nav>
</header>
<br>
<br>
<body>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<div style="margin:auto;padding: auto; text-align: center;">
<div class="container">
<div class="col-md-5">
    <div  class="form-area">  
        <form  method="POST" id="monform" action="listemployee.html">
        <br style="clear:both">
                    <h3>Update Employees</h3>
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
<footer>

  <img style="width:25px;height:25px" src="en.jpg">
  <img style="width:25px;height:25px" src="fr.png">

  <p>©AFPA 2020-2021</p>
</footer>