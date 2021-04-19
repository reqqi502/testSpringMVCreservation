<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet"href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>

</head>
<body>
		<header>
		<nav class="navbar navbar-expand-md navbar-dark" style = "background-color:black;padding:20px;padding-right: 60px;padding-left: 60px;">
			<div>
				<a href="" class="navbar-brand"> <img src="https://youcode.ma/images/logo.png" style="width: 139px;"></a>
			</div>

			<ul class="navbar-nav ml-auto">
				<li><a href="welcome"class="nav-link">Compus_Safi</a></li>
				 <%
           if(session.getAttribute("role")==null ){   
        	   response.sendRedirect("/");  
                                                   }
                  %>
                   <%
          if(session.getAttribute("role")!=null ){
              if(session.getAttribute("role").equals("administrateur")){%>
               <li><a href="ListReservation" class="nav-link">liste_Resevation</a></li>
               <li><a href="calendrier" class="nav-link">Calendrier</a></li>
               <li><a href="listApprenant" class="nav-link">liste_apprenant</a></li>
             <%}
              if(session.getAttribute("role").equals("apprenant")){%>
               <li><a href="reserver"class="nav-link">reserver</a></li>
              <%}
                                                 }   
                  
                %>
                
                
                
                                        
                                        <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         <i class="fas fa-user-circle" style="font-size:30px;margin-top:-7px"></i>   Welcome <%= session.getAttribute("nom") %>
        </a>
        
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Visit Your Profile</a>
          
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="logout" style="color:red">Logout</a>
          
        </div>
      </li>
			</ul>
		</nav>
	</header>
	<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" style="width: 100%!important;height: 757px;" src="https://simplon.co/storage/7114/Safi.jpg" alt="First slide">
      <div class="carousel-caption d-none d-md-block" style="margin: 0px 0px 172px 0px;">
    <h5 style="font-size:35px;font-family:Optima">Programmer Student</h5>
    <p>THESTUDENTSCHOOL is an alternative school located in the Morroco</p>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" style="width: 100%!important;height: 757px;" src="https://www.leconomiste.com/sites/default/files/eco7/public/youcode-et-1337-098.jpg" alt="Second slide">
      <div class="carousel-caption d-none d-md-block" style="margin: 0px 0px 172px 0px;">
    <h5 style="font-size:35px;font-family:Optima">Nursing school </h5>
    <p>THESTUDENTSCHOOL is an alternative school located in the Unated States</p>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" style="width: 100%!important;height: 757px;" src="https://thumbs.dreamstime.com/b/smart-college-students-networking-laptop-library-doing-homework-together-smart-college-students-networking-laptop-169781950.jpg" alt="Third slide">
      <div class="carousel-caption d-none d-md-block" style="margin: 0px 0px 172px 0px;">
    <h5 style="font-size:35px;font-family:Optima">Student Life</h5>
    <p>tTHESTUDENTSCHOOL is an alternative school located in the Sud Afrique</p>
  </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	
	</body>
	</html>
	