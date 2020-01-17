<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Gallery</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Curabitur Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
 <script src="js/jquery-1.11.1.min.js"></script>
  <script src="js/bootstrap.js"> </script>
  <!---- start-smoth-scrolling---->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
 <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>
<!---End-smoth-scrolling---->

</head>
<body>
		<!-- start-header section-->
			<div class="header">
				<div class="container">
				     <div class="top-header">
						<div class="phone">
							<ul>
								<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span></li>
								<li><p>+4758 655 5947</p></li>
							</ul>
						</div>
						<div class="logo">
							<h1><a href="index.jsp">curabitur</a></h1>
						</div>
						<div class="header-right">
						<div class="login">
						<a href="login.jsp">login</a>
						</div>
						<div class="cart box_1">
							<a href="checkout.jsp">
								<h3> <span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span> items)<img src="images/bag.png" alt=""></h3>
							</a>	
							<p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
							<div class="clearfix"> </div>
						</div>
				</div>
		
						<div class="clearfix"></div>
					</div>	
				</div>
			</div>
		<!-- end-header section-->
		<!--start-banner-->
			<div class="banner ban1">
				<div class="container">
					<div class="top-menu">
					<span class="menu"><img src="images/nav.png" alt=""/> </span>
						<ul>
							<li><a  href="index.jsp">home</a></li>
							<li><a  href="about.jsp">about</a></li>
							<li><a  href="menu.jsp">menus</a></li>
							<li><a  href="gallery.jsp" class="active">gallery</a></li>
							<li><a  href="events.jsp">events</a></li>
							<li><a  href="contact.jsp">contact</a></li>
						</ul>
						<!-- script for menu -->
									
							 <script>
							 $("span.menu").click(function(){
							 $(".top-menu ul").slideToggle("slow" , function(){
							 });
							 });
							 </script>
						<!-- //script for menu -->
					</div>
					</div>	
			</div>
		<!--end-banner-->
			
			<div class="content">
			<!--gallery-->
	<div class="gallery">
		<div class="container">
			<h3>Gallery</h3>
			<!--light-box-js -->
				<script src="js/jquery.chocolat.js"></script>
				<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8" />
				<!--light-box-files -->
				<script type="text/javascript" charset="utf-8">
				$(function() {
					$('.moments-bottom a').Chocolat();
				});
				</script> 
			<!--//end-gallery js-->
			<div class="gallery-info">
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g1.jpg">
						<img src="images/g1.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g2.jpg">
						<img src="images/g2.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g3.jpg">
						<img src="images/g3.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g4.jpg">
						<img src="images/g4.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g5.jpg">
						<img src="images/g5.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g6.jpg">
						<img src="images/g6.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g7.jpg">
						<img src="images/g7.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g8.jpg">
						<img src="images/g8.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="col-md-4 galry-grids moments-bottom">
					<a class="b-link-stripe b-animate-go" href="images/g9.jpg" >
						<img src="images/g9.jpg" class="img-responsive" alt="">
						<div class="b-wrapper">
							<span class="b-animate b-from-left    b-delay03 ">
								<img class="img-responsive" src="images/e.png" alt=""/>
							</span>					
						</div>
					</a>				
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//gallery-->

			<div class="specials-section">
				<div class="container">
					<div class="col-md-3 specials">
					<h3>about</h3>
					<p>Morbi pretium gravida justo nec ultrices. Ut et facilisis justo. Fusce ac turpis eros, vel molestie lectus.feugiat velit velit non turpis</p>
				</div>
				<div class="col-md-3 specials1">
				<h3>specials</h3>
				<ul>
					<li><a href="#">New Listing Sign-Up</a></li>
					<li><a href="#">Consectetur adipiscing</a></li>
					<li><a href="#">Integer molestie lorem</a></li>
					<li><a href="#">Facilisis in pretium nisl</a></li>
				</ul>
				</div>
			<div class="col-md-3 specials1">
			<h3>recipes</h3>
			<ul>
				<li><a href="#">Integer molestie lorem</a></li>
				<li><a href="#">Integer molestie lorem</a></li>
				<li><a href="#">Consectetur adipiscing</a></li>
				<li><a href="#">Lorem ipsum dolor sit</a></li>
			</ul>
			</div>
			<div class="col-md-3 specials1">
			<h3>social</h3>
			<ul>
				<li><a href="#">facebook</a></li>
				<li><a href="#">twitter</a></li>
				<li><a href="#">google</a></li>
				<li><a href="#">viemo</a></li>
			</ul>
			</div>
			<div class="clearfix"></div>
			</div>
			</div>
	</div>
	<div class="footer-section">
					<div class="container">
						<div class="footer-top">
						<p>Copyright &copy; 2019.Company name All rights reserved by liangqiwen</p>
					</div>
					<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


					</div>
					</div>


	
</body>
</html>
	