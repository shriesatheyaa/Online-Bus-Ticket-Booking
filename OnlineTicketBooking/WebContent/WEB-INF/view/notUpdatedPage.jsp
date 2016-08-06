<!DOCTYPE html>
<html lang="en">

<head>

    
    <title>My Profile</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
   
     <!-- Load jQuery from Google's CDN -->
    <!-- Load jQuery UI CSS  -->
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
   
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
   
    <!-- Load SCRIPT.JS which will create datepicker for input field  -->
    

</head>

        <script type="text/javascript">
            window.onload = function() {
                alert("!!!The current password you have given is wrong.. Try Again with correct password !!!");
        	}
        </script>
<style>
   .bodyColor {
  text-align: center;
  /*background: #18BC9C;*/
  /*	background: url("img/bg.jpg");*/
  	
        
  color: white;
} 
  .form-control option {
      font-size:large;
      color:black;
    }
    
    td {
    color:black;
    font-family:Comic Sans MS;
    font-size:25px; 
    text-align: left;  
    }
</style>

<body id="page-top" class="bodyColor">

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <a class="navbar-brand" href="#page-top"><img style="position:fixed; left:1px;top:7px"class="img-responsive" src="img/logo_bus_stop.png" alt="" width = "85px" height = "85px"></a>
                <a class="navbar-brand" href="#page-top" style = "color:white; font-size:40px; font-family:Comic Sans MS; important">
                &nbsp;
                BUS STOP</a> 
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="logOut.html" style = " font-size:large;">Log Out</a>
                    </li>
                    
                    <li class="page-scroll">
                      <a href="UserHomePage.html" style = "text-decoration : none; font-size:large;"  >Back</a>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>


<div style="position:fixed; left:80px; top:200px;margin-bottom: 2cm;"  ><br><br><br>
<form id ="updateUser" action = "updateUser.html"method = "post">
<h2 style="margin-bottom: 2cm;color:black;">
${user.name} </h2>
         	
             <table class = "table table-hover" align = "left" style = "color :yellow; font-size:20px; font-family:Comic Sans MS; width:75%;">
             <col width="530">
              	<tr><td>E-Mail Id</td>
                   <td><input id = "email"  name="email" type="text"   disabled value  = ${user.email}></td>
                   <td><input style = "color: teal;" type = "button" name = "update" value = "Edit" onclick = "enableEmailEditing()"/></td>
                </tr>
                <tr><td>Mobile Number</td>
                   <td><input id = "mobileNumber" name="mobileNumber" type="text"   disabled value  =${user.mobileNumber}></td>
                   <td><input style = "color: teal;" type = "button" name = "update" value = "Edit" onclick = "enableMobileEditing()"/></td>
                </tr>
                <tr><td></td>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                   <td><input style = "color: teal;" type = "button" name = "update" value = "Change My Password" onclick = "enablePwd()"/></td>
                </tr>      
                <tr><td><div id="pwd_chg" style="visibility:hidden">
                          Enter Current Password <input type="text" name="pwd" id="pwd"/>
                        </td></tr>
                <tr><td> <div id="pwd_chg1" style="visibility:hidden">
                Enter New Password <input type="text" name="password" id="password"/></div><td>
                <div id="pwd_chg2" style="visibility:hidden">
                <input type = "button" value = "save" ></td>
                        </div> </td></tr>   
        </table><br><br><br><br><br><br><br><br><br><br><br>
        
        <input type  = "submit" value = "Update MY Changes" style = " color : teal; font-size:30px; font-family:Comic Sans MS;" >
        </form>
      <!--  <img src = "img/user.png" style = "margin-left = 150px;"/>-->  
 </div>
     <script type="text/javascript">
     
        $(document).ready(
    		  /* This is the function that will get executed after the DOM is fully loaded */
    		  function () {
    	       	     document.getElementById("email").disabled = true;        
    	      	     document.getElementById("mobile").disabled = true;
    	      	     }        
    	);
        
        function enableEmailEditing() {
        	 document.getElementById("email").disabled = false; disableMobileEditing();       
        }
        
        function enableMobileEditing() {
       	     document.getElementById("mobileNumber").disabled = false; disableEmailEditing();        
        }
        
        function disableEmailEditing() {
       	     document.getElementById("email").disabled = true;        
        }
        
        function disableMobileEditing() {
      	     document.getElementById("mobileNumber").disabled = true;        
        }
        
        function enablePwd() {
            document.getElementById("pwd_chg").style.visibility = 'visible';
            document.getElementById("pwd_chg1").style.visibility = 'visible';
            document.getElementById("pwd_chg2").style.visibility = 'visible';
        }
        
        </script>
</body>
</html>