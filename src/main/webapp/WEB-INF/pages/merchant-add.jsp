<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><spring:message code="home.page.title"/></title>
<%@ include file="commonjs.jsp" %>
</head>
<body> 

<%@ include file="header.jsp" %>
 
<div class="clear"></div>
 
<!-- start content-outer -->
<div id="content-outer">
<!-- start content -->
<div id="content">


<div id="page-heading"><h1><spring:message code="merchant.page.heading"/></h1></div>


<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
<tr>
	<th rowspan="3" class="sized"><img src="<c:url value="/resources/images/shared/side_shadowleft.jpg"/>" width="20" height="300" alt="" /></th>
	<th class="topleft"></th>
	<td id="tbl-border-top">&nbsp;</td>
	<th class="topright"></th>
	<th rowspan="3" class="sized"><img src="<c:url value="/resources/images/shared/side_shadowright.jpg"/>" width="20" height="300" alt="" /></th>
</tr>
<tr>
	<td id="tbl-border-left"></td>
	<td>
	<!--  start content-table-inner -->
	<div id="content-table-inner">
	
	<table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr valign="top">
	<td>
	
	
		<!--  start step-holder -->
		<div id="step-holder">
			<div class="step-no"></div>
			<div class="step-dark-left">Create Merchant - need some modification</div>
			<div class="step-dark-round"></div>
			<div class="clear"></div>
		</div>
		<!--  end step-holder -->
	
		<!-- start id-form -->
		<c:url var="saveUrl" value="/merc/save" />
		<form:form modelAttribute="merchant" name="form" method="POST" action="${saveUrl}">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
		
		<tr>
			<th valign="top"><spring:message code="merchant.label.id"/></th>
			<td><form:input path="merchantId" class="inp-form" readonly="readonly"/></td>
			<td></td>
			<form:hidden path="uid"/>
		</tr>
				
		<tr>
			<th valign="top"><spring:message code="merchant.label.name"/></th>
			<td><form:input path="name" class="inp-form-error" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.description"/></th>
			<td><form:textarea path="description" rows="" cols="" class="form-textarea"/></td>
			<td></td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.address"/></th>
			<td><form:input path="address" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.city"/></th>
			<td><form:input path="city" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
		<th valign="top"><spring:message code="merchant.label.state"/></th>
		<td>	
		<form:select path="state" class="styledselect_form_1">
			<option value="">All</option>
			<option value="">Products</option>
			<option value="">Categories</option>
			<option value="">Clients</option>
			<option value="">News</option>
		</form:select>
		</td>
		<td></td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.phone"/></th>
			<td><form:input path="phone" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.mobile"/></th>
			<td><form:input path="mobile" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.email"/></th>
			<td><form:input path="email" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="merchant.label.website"/></th>
			<td><form:input path="website" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
		<th valign="top"><spring:message code="merchant.label.status"/></th>
		<td>	
		<form:select path="status" class="styledselect_form_1">
			<option value="1">Active</option>
			<option value="0">Inactive</option>
		</form:select>
		</td>
		<td></td>
		</tr> 
		
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
			<input type="submit" value="" class="form-submit" />
			<input type="reset" value="" class="form-reset"  />
		</td>
		<td></td>
	</tr>
	</table>
	</form:form>
	<!-- end id-form  -->

	</td>
	<td>

</td>
</tr>
<tr>
<td><img src="<c:url value="/resources/images/shared/blank.gif"/>" width="695" height="1" alt="blank" /></td>
<td></td>
</tr>
</table>
 
<div class="clear"></div>
 

</div>
<!--  end content-table-inner  -->
</td>
<td id="tbl-border-right"></td>
</tr>
<tr>
	<th class="sized bottomleft"></th>
	<td id="tbl-border-bottom">&nbsp;</td>
	<th class="sized bottomright"></th>
</tr>
</table>









 





<div class="clear">&nbsp;</div>

</div>
<!--  end content -->
<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->

 

<div class="clear">&nbsp;</div>
    
<!-- start footer -->         
<div id="footer">
	<!--  start footer-left -->
	<div id="footer-left">
	Admin Skin &copy; Copyright Internet Dreams Ltd. <a href="">www.netdreams.co.uk</a>. All rights reserved.</div>
	<!--  end footer-left -->
	<div class="clear">&nbsp;</div>
</div>
<!-- end footer -->
 
</body>
</html>