<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" style="border-top-style: solid; border-top-width: 0px; margin-top: -22px;">

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
       <!-- <script type="text/javascript">
	    window.onload = function() {
	       alert("!!!Welcome to your Booking Page !!!");
	   	}
	</script> --> 
<style>
   .bodyColor {
  text-align: center;
  /*background: #18BC9C;*/
  	/*background: url("img/back.jpg") 30% 30%;*/
        
  color: white;
} 
  
table tr:nth-child(odd) {
 background-color: #f1f1f1;
}
table tr:nth-child(even) {
 background-color: #ffffff;
}
table {
    border-collapse: collapse;
    width: 50%;
}

th, td {
    text-align: left;
    padding: 8px;
    color:black;
}



th {
    text-align: center;
    background-color: #18BC9C;
    color: white;
}
.button {
    border-radius: 8px;
    background-color:  #f44336;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
}
.button2:hover { 
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}

#main {
   height:580px;
   border:1px solid black;
}

#PayVisible {
   height:330px; 
   border:1px solid black;
}

.five{
  width:100px;
  height:100px;
background:blue;
}
</style>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<body id="page-top" >

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll" style="margin-bottom: -33px;">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                 <a class="navbar-brand" href="#page-top"><img style="position:fixed; left:1px;top:7px"class="img-responsive" src="img/logo_bus_stop.png" alt="" width = "85px" height = "85px"></a>
                <a class="navbarleft-brand" href="#page-top" style = "font-color:green; font-size:40px; font-family:Comic Sans MS;">
                &nbsp;
                BUS STOP</a>                     
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1"><form>
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                     <c:forEach items="${users}" var="user" >
                     <c:out value = "${user.name}"/>
                     <input type = "hidden" value = "${user.id}"/>
                     </c:forEach>
                    <li class="page-scroll">
                        <a href="HomePage.html">Log Out</a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="searchBusPage.html">Search Bus</a>
                    </li>
                </ul></form>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    
      
    <div  id = "main" class = "body" style="border-top-width: 125px; border-top-style: solid; background-color : white;">
          <c:forEach items = "${tripRoute}" var = "tripRoute">
             <form id ="booking_info" action = "payment.html" method = "post"><br><br><br>
             	<table align = "center" style = "font-size:20px; font-family:Comic Sans MS;">
             	<tr><td>Travels</td>
                   <td><c:out value="${tripRoute.trip.bus.travels.name}"/></td></tr>
                   <tr><td>Bus Type</td><td>
                   <c:out value="${tripRoute.trip.bus.type}"/></td></tr>
                   <tr><td>AC/NON-AC</td><td>
                   <c:if test="${tripRoute.trip.bus.isAc}">
                        AC
                   </c:if>
                   <c:if test="${!tripRoute.trip.bus.isAc}">
                         NON-AC
                   </c:if></td></tr>
                  <tr><td>Departure Time</td><td>                            
                  <c:out value="${tripRoute.departureTime}"/></td></tr>
                  <tr><td>Arrival Time</td><td>
                  <c:out value="${tripRoute.arrivalTime}"/></td></tr>
                  <tr><td>Number Of Available Seats</td><td>
                  <c:out value="${tripRoute.trip.seatVacancy}"/></td></tr>
                  <tr><td>Number of Passengers:</td><td><input type="number" name = "tickets"/></td></tr>
                  <tr><td>
                  <input id = "pay" type = "button" value = "Pay" onClick = "return show()" ></td><td><a href="SearchBus.html"><input type="button" value = "Cancel" name = "cancel"/> </a>
                </table><br><br>
                
                <div id="PayVisible" style="visibility:hidden">
                <input type="radio" id="credit" name="choice" value="Credit" onclick="showForm();" >Pay Using Credit Card
                <div id = "creditVisible" style="visibility:hidden">
                Enter Your Bank name&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp; <input type = "text" name = "netBank" ><br>
                Enter Your Customer Id &nbsp;: &nbsp;&nbsp;&nbsp;<input type = "text" name = "netBank" ><br>
                Enter Your Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type = "password" name = "netBank" ><br>
                <input type = "submit" value = "PAY NOW">
                </div> 
                <input type="radio" id="debit" name="choice" value="Debit" onclick="showForm();" >Pay Using Debit Card
                <div id = "debitVisible" style="visibility:hidden">
                Enter Your Bank name&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp; <input type = "text" name = "netBank" ><br>
                Enter Your Customer Id &nbsp;: &nbsp;&nbsp;&nbsp;<input type = "text" name = "netBank" ><br>
                Enter Your Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type = "password" name = "netBank" ><br>
                <input type = "submit" value = "PAY NOW">
                </div> 
                <input type="radio" id="netBanking" name="choice" value="NetBanking" onclick="showForm();" >Net Banking
                <div id = "netBankingVisible" class = "five" style="visibility:hidden">
                Enter Your Bank name&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp; <input type = "text" name = "netBank" ><br>
                Enter Your Customer Id &nbsp;: &nbsp;&nbsp;&nbsp;<input type = "text" name = "netBank" ><br>
                Enter Your Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;<input type = "password" name = "netBank" ><br>
                <input type = "submit" value = "PAY NOW">
                </div> 
                </div>       
             </form>
          </c:forEach> 
          
    <script type="text/javascript">
        function show() { 
            document.getElementById("PayVisible").style.visibility = 'visible';
        }
        
        function showForm() { 
            hide();
            if (document.getElementById("credit").checked) {
                document.getElementById("creditVisible").style.visibility = 'visible';
            } else if (document.getElementById("debit").checked) {
                document.getElementById("debitVisible").style.visibility = 'visible'; 
            } else {
                document.getElementById("netBankingVisible").style.visibility = 'visible'; 
            }
        }
        function hide() { 
            document.getElementById("creditVisible").style.visibility = 'hidden';
            document.getElementById("debitVisible").style.visibility = 'hidden';
            document.getElementById("netBankingVisible").style.visibility = 'hidden'; 
        }
    </script>
   </div>  

</body>
</html>

