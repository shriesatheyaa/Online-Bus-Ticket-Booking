<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    
    <title>Login Page</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">  

</head>
<style>
 .body{
background : url("img/back.jpg");
 }
</style>

<body id="page-top"  >

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll" style="margin-bottom: -33px;">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="#page-top"><img style="position:fixed; left:1px;top:24px"class="img-responsive" src="img/bus.gif" alt=""></a>
                <a class="navbar-brand" href="#page-top" style = "font-color:green; font-size:40px; font-family:Comic Sans MS;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                BUS STOP</a>           
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    

                    
                    <li class="page-scroll">
                        <a href="loginPage.html">Login</a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="registerPage.html">SignUp</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
      
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="img/load.gif" alt="">
                    <div class="intro-text" style="
                                                   height: 100px;
                                                   padding-bottom: 8px;
                                                   padding-top: 0px;
                                                  ">
                        <span class="name">Start Journey</span>
                        <hr class="star-light">
                        <span class="skills">Welcome -Experience Travel Together</span>
                    </div>
                </div>
            </div>
        </div>
    </header>
     <div style="margin-top: 19px;" class="body" style="margin-top: 0px; border-top-width: 0px; border-top-style: solid; " >
          <h1 style="color:black;"><center style="border-top-style: solid; border-top-width: 0px; margin-top: -20px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</center></h1>

          
          <h1><center>LOGIN</center></h1>
          
          <form id="user" action="authenticate.html" method="post" onsubmit = "return validate()">
            &nbsp;&nbsp;&nbsp;&nbsp;<br><br>
            <div class="form-group col-lg-12 col-xs-4 ">
              <center>
              <input id="email" name="email" style="padding-right: 95px; padding-left: 106px; margin-left: 12px;" placeholder="Enter Email - Id" type="email" value="" autocomplete="off"/>
              </center>
            </div><br><br><br><br>
            <div class="form-group col-lg-12 col-xs-4"><center>
                 <input id="password" name="password" style="padding-right: 95px; padding-left: 106px; margin-left: 12px;" placeholder="Enter Password" type="password" value="" autocomplete="off"/></h4>
                           </div>
            </center>
            
            <br><br><br><br>
            <button type="submit" style="margin-left: 420px;" class="btn btn-success col-lg-4">LET ME IN </button></center>
            <br><br><br></center><br><br><br><br>
<script>              
  function validate() {
      var email = document.getElementById("email").value;  
      var password = document.getElementById("password").value;  
      
      if (email == "") {
    	  alert("Email Id Should not be left blank!!!");
    	  return false;
      } else if (password == ""){
    	  alert("Password Should not be left blank!!!");
    	  return false;
      }      
  }  
  </script>
          </form>
          <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h1>
        </div>
</div>

  
</body>

</html>


