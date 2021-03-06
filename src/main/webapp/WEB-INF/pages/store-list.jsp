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
 
<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
<!-- start content -->
<div id="content">

	<!--  start page-heading -->
	<div id="page-heading"><h1><spring:message code="store.page.heading"/> : ${merchant.name}</h1>
	</div>
	<!-- end page-heading -->

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
		<!--  start content-table-inner ...................................................................... START -->
		<div id="content-table-inner">
		
			<!--  start table-content  -->
			<div id="table-content">
			
			<!-- Search screen - start -->
			<c:url var="saveUrl" value="/merc/${merchant.uid}/store" />
			<form:form modelAttribute="filter" name="form" method="GET" action="${saveUrl}">
			
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="id-form">
					<tr>
						<th valign="middle"><spring:message code="merchant.label.name"/></th>
						<td><form:input path="name" class="inp-form" /></td>
						<td></td>
						<th valign="middle"><spring:message code="store.label.id"/></th>
						<td>
							<form:select path="sid" class="styledselect_form_1">
								<form:option value="" label="-Select-" />
								<form:options items="${storeList}" itemValue="storeId" itemLabel="name"/>
							</form:select>						
						</td>
						<td><input type="submit" class="submit-login"  /></td>
					</tr>

				</table>
				</form:form>
				<!-- Search screen - end -->

			<c:url var="createStoreUrl" value="/merc/${merchant.uid}/store/add" />
			
				<!--  start message-green -->
				<div id="message-green">
				<table border="0" width="100%" cellpadding="0" cellspacing="0">
				<tr>
				
					<td class="green-left">Product added sucessfully. <a href="${createStoreUrl}">Add new one.</a></td>
					<td class="green-right"><a class="close-green"><img src="<c:url value="/resources/images/table/icon_close_green.gif"/>"   alt="" /></a></td>
				</tr>
				</table>
				</div>
				<!--  end message-green -->
		
		 
				<!--  start product-table ..................................................................................... -->
			<c:if test="${!empty storeList}">
				<form id="mainform" action="">
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
				<tr>
					<th class="table-header-check"><a id="toggle-all" ></a> </th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Store Name</a>	</th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Store Id</a></th>
					<th class="table-header-repeat line-left"><a href="">Address</a></th>
					<th class="table-header-repeat line-left"><a href="">Contact Number</a></th>
					<th class="table-header-repeat line-left"><a href="">Website</a></th>
					<th class="table-header-options line-left"><a href="">Options</a></th>
				</tr>
				<c:forEach items="${storeList}" var="store">
				<tr>
					<td><input  type="checkbox"/></td>
					<td>${store.name}</td>
					<td>${store.storeId}</td>
					<td><a href="">${store.address}</a></td>
					<td>${store.phone}</td>
					<td><a href="">${store.website}</a></td>
					<td class="options-width">
					<c:url var="editUrl" value="/store/edit/${store.uid}" />
					<c:url var="delUrl" value="/store/del/${store.uid}" />
					<a href="${editUrl}" title="Edit" class="icon-1 info-tooltip"></a>
					<a href="${delUrl}" title="Delete" class="icon-2 info-tooltip"></a>
					</td>
				</tr>
				</c:forEach>
				
				</table>
				<!--  end product-table................................... --> 
				</form>
				</c:if>
			</div>
			<!--  end content-table  -->
		
			<!--  start actions-box ............................................... -->
			<div id="actions-box">
				<a href="" class="action-slider"></a>
				<div id="actions-box-slider">
					<a href="" class="action-edit">Edit</a>
					<a href="" class="action-delete">Delete</a>
				</div>
				<div class="clear"></div>
			</div>
			<!-- end actions-box........... -->
			
			<!--  start paging..................................................... -->
			<table border="0" cellpadding="0" cellspacing="0" id="paging-table">
			<tr>
			<td>
				<a href="" class="page-far-left"></a>
				<a href="" class="page-left"></a>
				<div id="page-info">Page <strong>1</strong> / 15</div>
				<a href="" class="page-right"></a>
				<a href="" class="page-far-right"></a>
			</td>
			<td>
			<select  class="styledselect_pages">
				<option value="">Number of rows</option>
				<option value="">1</option>
				<option value="">2</option>
				<option value="">3</option>
			</select>
			</td>
			</tr>
			</table>
			<!--  end paging................ -->
			
			<div class="clear"></div>
		 
		</div>
		<!--  end content-table-inner ............................................END  -->
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
<!--  end content-outer........................................................END -->

<div class="clear">&nbsp;</div>
    
<!-- start footer -->         
<%@ include file="footer.jsp" %>
<!-- end footer -->
 
</body>
</html>