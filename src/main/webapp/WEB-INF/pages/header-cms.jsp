<!-- Start: page-top-outer -->
<div id="page-top-outer">    

<!-- Start: page-top -->
<div id="page-top">

	<!-- start logo -->
	<div id="logo">
	<a href=""><img src="<c:url value="/resources/images/shared/logo.png"/>" width="156" height="40" alt="" /></a>
	</div>
	<!-- end logo -->
	
	<!--  start top-search -->

 	<!--  end top-search -->
 	<div class="clear"></div>

</div>
<!-- End: page-top -->

</div>
<!-- End: page-top-outer -->



<div class="clear">&nbsp;</div>
 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		<!-- start nav-right -->
		<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account"><img src="<c:url value="/resources/images/shared/nav/nav_myaccount.gif"/>" width="93" height="14" alt="" /></div>
			<div class="nav-divider">&nbsp;</div>
			<a href="<c:url value="j_spring_security_logout" />" id="logout"><img src="<c:url value="/resources/images/shared/nav/nav_logout.gif"/>" width="64" height="14" alt="" /></a>
			<div class="clear">&nbsp;</div>
		
			<!--  start account-content -->	
			<div class="account-content">
			<div class="account-drop-inner">
				<a href="" id="acc-settings">Settings</a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-details">Personal details </a>
			</div>
			</div>
			<!--  end account-content -->
		
		</div>
		<!-- end nav-right -->

<!-- Url configuration - start -->

<c:url var="dashboard" value="/home" />
<c:url var="viewMerchant" value="/merc" />
<c:url var="addMerchant" value="/merc/add" />
<c:url var="viewCardProduct" value="/crdpdt" />
<c:url var="addCardProduct" value="/crdpdt/add" />
<c:url var="transaction" value="/txn" />
<c:url var="viewUser" value="/usr" />
<c:url var="addUser" value="/usr/add" />
<c:url var="viewCard" value="/crd" />

<!-- Url configuration - end -->

		<!--  start nav -->
		<div class="nav">
		<div class="table">
		
		<ul class="select"><li><a href="${dashboard}"><b>Dashboard</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
				<li><a href="#nogo"></a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		                    
		<ul class="select"><li><a href="#nogo"><b>Card</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
				<li><a href="${viewCard}">View Card</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="clear"></div>
		</div>
		<div class="clear"></div>
		</div>
		<!--  start nav -->

</div>
<div class="clear"></div>
<!--  start nav-outer -->
</div>
<!--  start nav-outer-repeat................................................... END -->