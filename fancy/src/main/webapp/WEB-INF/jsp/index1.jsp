<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">	
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="../static/css/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<!--//webfonts-->
<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
});
</script>
 <!--SIGN UP-->
 <h1>Glad To See U Here ^o^</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info" id="message_txt">
			
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="../static/images/avtar.png" />
	</div>
			<form id="loginform" name="loginform" action="<%=path%>/user/login" method="post">
					<input type="text" class="text" name = "username" value="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
						<div class="key">
					<input type="password" id = "pass" name = "password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
						</div>
			    <div class="signin">
		            <input type="submit" value="GO!" >
	            </div>
			</form>
	
</div>
    <script type="text/javascript">
    var ctxpath = '<%=path%>';
	$(document).ready(function() {
		$(".keydown").keydown(function(e) {
			var curKey = e.which;
			if (curKey == 13) {
				$("#loginform").submit();
				return false;
			}
		});
	});
    </script>
    <script src="../static/js/jquery/jquery.min.js"></script>
    <script src="../static/js/jquery/jquery-3.4.1.min.js"></script>
    <script src="../static/js/jquery/jquery.form.js"></script>
    <script src="../static/js/login.js"></script>
    <script src="../static/js/alert.js"></script>
   
</body>
</html>