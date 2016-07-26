<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="logmod">
    <div class="logmod__wrapper">
      <div class="logmod__container">
      <ul class="logmod__tabs">
        <li data-tabtar="lgm-2"><a href="#">Login</a></li>
        <li data-tabtar="lgm-1"><a href="#">Sign Up</a></li>
      </ul>
      <div class="logmod__tab-wrapper">
      <div class="logmod__tab lgm-1">
        <div class="logmod__heading">
          <span class="logmod__heading-subtitle">Enter your personal details <strong>to create an acount</strong></span>
        </div>
        <div class="logmod__form">
          <form:form  accept-charset="utf-8" action="/DispatcherServlet/save.html" class="simform">
            <div class="sminputs">
              <div class="input full">
                <form:label class="string optional" for="name">Name*</form:label>
                <form:input class="string optional" maxlength="255" id="user-name" required placeholder="Name" type=text size="30" />
              </div>
            </div>
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-name">Email*</label>
                <input class="string optional" maxlength="255" id="user-email" placeholder="Email" type="email" size="30" />
              </div>
            </div>

            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="mobile">Mobile Number*</label>
                <input class="string optional" maxlength="12" id="user-mobile" placeholder="Mobile Number" type=text size="30" />
              </div>
            </div>

            <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="user-pw">Password *</label>
                <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="password" size="30" />
                <span class="hide-password">Show</span>
              </div>
              <div class="input string optional">
                <label for="user-pw-repeat">Repeat password *</label>
                <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="password" size="30" />
                						<span class="hide-password">Show</span>
              </div>

            </div>
            <div class="simform__actions">
              <input class="sumbit" name="commit" type="sumbit" value="Create Account" />
              <span class="simform__actions-sidetext">By creating an account you agree to our 
                    <a class="special" href="#" target="_blank" role="link">Terms & Privacy</a>
              </span>
            </div> 
          </form:form>
        </div> 
      </div>
      <div class="logmod__tab lgm-2">
        <div class="logmod__heading">
          <span class="logmod__heading-subtitle">Enter your email and password <strong>to sign in</strong></span>
        </div> 
        <div class="logmod__form">
          <form accept-charset="utf-8" class="simform">
            <div class="sminputs">
               &nbsp;&nbsp;&nbsp;Email* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               &nbsp;&nbsp;
                <input class="string optional" maxlength="255" id="user-email" placeholder="Email" type="email" size="35" />
            </div> <br> <br>
            <div class="sminputs">
                &nbsp;&nbsp;&nbsp;Password* &nbsp;&nbsp;&nbsp;&nbsp; : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="password" size="35" />
            </div>
           <div class = "sminputs"><span class="hide-password">Show</span></div>
            <div class="simform__actions"><a href = "login.jsp">
              <input class="sumbit" name="login" type="sumbit" value="Log In" /></a>
              <span class="simform__actions-sidetext"><a class="special" role="link" href="#">Forgot your password?<br>
              Click here</a></span>
            </div> 
          </form>
        </div> 

      </div>
    </div>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="js/index.js"></script>
</body>
</html>