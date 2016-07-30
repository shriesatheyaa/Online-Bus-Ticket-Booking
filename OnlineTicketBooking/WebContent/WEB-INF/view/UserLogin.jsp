<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    
    <title>Online Bus Ticket Booking</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    

</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="#page-top"><img style="position:fixed; left:1px;top:24px"class="img-responsive" src="img/bus.gif" alt=""></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="login.jsp">login</a>
                    </li>
                    <li class="page-scroll">
                        <a href="signup.jsp">signup</a>
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

<div class="container-fluid"><br><br>
  <div class="row">
    <div class="col-lg-6" ">
       <div id="signup">   
          <h1>LOGIN</h1>
          
          <c:url var="userRegistration" value="authenticate.html"/>
          <form:form  modelAttribute="user" method="post" action="${userRegistration}">
          
            <div class="field-wrap">
              <form:input path="email" type="email" placeholder="Enter Email-ID" autocomplete="off" />
            </div>

          
          
          <div class="field-wrap">
            
            <form:input path="password"  placeholder="Enter password" type="password" autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>Get Started</button>
          
          </form:form>

        </div>
    </div>
    <div class="col-lg-6" >
      <img src = "bg1.jpg">
    </div>
  </div>
</div>
    
    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-top page-scroll hidden-sm hidden-xs hidden-lg hidden-md">
        <a class="btn btn-primary" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

    

</body>

</html>
