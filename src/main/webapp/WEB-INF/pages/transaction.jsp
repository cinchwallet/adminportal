<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><spring:message code="home.page.title"/></title>
<%@ include file="commonjs.jsp" %>

<script>
function selectMerchant()
{
	document.form.ms.value="true";
	document.form.submit();
}

</script>  

</head>


<body> 

<%@ include file="header.jsp" %>

 <div class="clear"></div>
 
<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
<!-- start content -->
<div id="content">

	<!--  start page-heading -->
	<div id="page-heading"><h1><spring:message code="transaction.page.heading"/></h1>
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
			<c:url var="saveUrl" value="/txn" />
			<form:form modelAttribute="filter" name="form" method="GET" action="${saveUrl}">
				<form:hidden path="ms"/>
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="id-form">
					<tr>
						<th valign="middle"><spring:message code="transaction.label.merchant"/></th>
						<td>
							<form:select path="mid" onChange="selectMerchant();">
								<form:option value="" label="-Select-" />
								<form:options items="${merchantList}" itemValue="merchantId" itemLabel="name"/>
							</form:select>						
						</td>
						<td>
						</td>
						<th valign="middle"><spring:message code="transaction.label.store"/></th>
						<td>
							<form:select path="sid" class="styledselect_form_1">
								<form:option value="" label="-Select-" />
								<form:options items="${storeList}" itemValue="storeId" itemLabel="name"/>
							</form:select>						
						</td>
						<td></td>
					</tr>
					<tr>
						<th valign="middle"><spring:message code="transaction.label.card"/></th>
						<td><form:input path="cardNumber" class="inp-form" /></td>
						<td></td>
						<th valign="middle"><spring:message code="transaction.label.txn.date"/></th>
						<td><form:input path="txnDate" class="inp-form" /></td>
						<td><input type="submit" class="submit-login"  /></td>
					</tr>
				</table>
				</form:form>
				<!-- Search screen - end -->

			
				<!--  start product-table ..................................................................................... -->
			<c:if test="${!empty txnList}">
				<form id="mainform" action="">
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
				<tr>
					<th class="table-header-check"><a id="toggle-all" ></a> </th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Card Number</a>	</th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Txn Date</a></th>
					<th class="table-header-repeat line-left"><a href="">Txn Type</a></th>
					<th class="table-header-repeat line-left"><a href="">Txn Amount</a></th>
					<th class="table-header-repeat line-left"><a href="">Merchant Id/Store Id</a></th>
					<th class="table-header-options line-left"><a href="">Status</a></th>
					<th class="table-header-options line-left"><a href="">Response Code</a></th>
				</tr>
				<c:forEach items="${txnList}" var="txn">
				<tr>
					<td><input  type="checkbox"/></td>
					<td>${txn.panHint}</td>
					<td>${txn.dtTransaction}</td>
					<td>${txn.transactionType}</td>
					<td>${txn.txnAmount}</td>
					<td>${txn.mid}/${txn.sid}</td>
					<td>${txnMsg.resultCode=='0000'?'Success':'Failed'}</td>
					<td>${txn.resultCode}</td>
				</tr>
				</c:forEach>
				
				</table>
				<!--  end product-table................................... --> 
				</form>
				</c:if>
			</div>
			<!--  end content-table  -->
		
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