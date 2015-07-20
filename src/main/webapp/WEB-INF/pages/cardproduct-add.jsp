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


<div id="page-heading"><h1><spring:message code="cardproduct.page.heading"/></h1></div>


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
			<div class="step-no-off">1</div>
			<div class="step-dark-left">Create New Card Product</div>
			<div class="step-light-round">&nbsp;</div>
			<div class="clear"></div>
		</div>
		<!--  end step-holder -->
	
		<!-- start id-form -->
		<c:url var="saveUrl" value="/crdpdt/save" />
		<form:form modelAttribute="cardProduct" name="form" method="POST" action="${saveUrl}">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
		
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.name"/></th>
			<td><form:input path="name" class="inp-form-error" /></td>
			<td></td>
			<form:hidden path="uid"/>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.upc"/></th>
			<td><form:input path="upc" class="inp-form-error" /></td>
			<td></td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.description"/></th>
			<td><form:textarea path="description" rows="" cols="" class="form-textarea"/></td>
			<td></td>
		</tr>
		
		<tr>
		<th valign="top"><spring:message code="cardproduct.label.currency"/></th>
		<td>	
		<form:select path="currency" class="styledselect_form_1">
			<option value="INR">Indian Rupee</option>
		</form:select>
		</td>
		<td></td>
		</tr>
		
		<tr>
		<th valign="top"><spring:message code="cardproduct.label.issuing.merchant"/></th>
		<td>	
			<form:select path="issuingMerchant" class="styledselect_form_1">
				<form:option value="0" label="-Select-" />
				<form:options items="${merchantList}" itemValue="merchantId" itemLabel="name"/>
			</form:select>
		</td>
		<td></td>
		</tr>

		<tr>
			<th valign="top"><spring:message code="cardproduct.label.point.program"/></th>
			<td>
				<form:checkbox path="pointProgram" value="1"/>
			</td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.card.type"/></th>
			<td>
				<form:select path="cardType" class="styledselect_form_1">
					<form:option value="PRELOADED">Preloaded</form:option>
					<form:option value="RELOADABLE">Reloadable</form:option>
					<form:option value="GIFT_CARD">Gift Card</form:option>
				</form:select>
			</td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.reload.limit"/></th>
			<td><form:input path="reloadLimit" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.redeem.limit"/></th>
			<td><form:input path="redeemLimit" class="inp-form" /></td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.supported.txn"/></th>
			<td>
				<form:select path="supportedTxn" class="styledselect_form_1" multiple="multiple">
					<form:option value="0" label="-Select-" />
					<form:options items="${txnList}" itemValue="txnCode" itemLabel="txnName"/>
				</form:select>			
			</td>
			<td>
			</td>
		</tr>
		<tr>
			<th valign="top"><spring:message code="cardproduct.label.online.pin.required"/></th>
			<td>	
				<form:checkbox path="onlinePinRequired" value="1"/>
			</td>
			<td>
			</td>
		</tr>
		<tr>
		<th valign="top"><spring:message code="cardproduct.label.status"/></th>
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

	<!--  start related-activities -->
	<div id="related-activities">
		
		<!--  start related-act-top -->
		<div id="related-act-top">
		<img src="<c:url value="/resources/images/forms/header_related_act.gif"/>" width="271" height="43" alt="" />
		</div>
		<!-- end related-act-top -->
		
		<!--  start related-act-bottom -->
		<div id="related-act-bottom">
		
			<!--  start related-act-inner -->
			<div id="related-act-inner">
			
				<div class="left"><a href=""><img src="<c:url value="/resources/images/forms/icon_plus.gif"/>" width="21" height="21" alt="" /></a></div>
				<div class="right">
					<h5>Add another product</h5>
					Lorem ipsum dolor sit amet consectetur
					adipisicing elitsed do eiusmod tempor.
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						<li><a href="">Click here to visit</a> </li>
					</ul>
				</div>
				
				<div class="clear"></div>
				<div class="lines-dotted-short"></div>
				
				<div class="left"><a href=""><img src="<c:url value="/resources/images/forms/icon_minus.gif"/>" width="21" height="21" alt="" /></a></div>
				<div class="right">
					<h5>Delete products</h5>
					Lorem ipsum dolor sit amet consectetur
					adipisicing elitsed do eiusmod tempor.
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						<li><a href="">Click here to visit</a> </li>
					</ul>
				</div>
				
				<div class="clear"></div>
				<div class="lines-dotted-short"></div>
				
				<div class="left"><a href=""><img src="<c:url value="/resources/images/forms/icon_edit.gif"/>" width="21" height="21" alt="" /></a></div>
				<div class="right">
					<h5>Edit categories</h5>
					Lorem ipsum dolor sit amet consectetur
					adipisicing elitsed do eiusmod tempor.
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						<li><a href="">Click here to visit</a> </li>
					</ul>
				</div>
				<div class="clear"></div>
				
			</div>
			<!-- end related-act-inner -->
			<div class="clear"></div>
		
		</div>
		<!-- end related-act-bottom -->
	
	</div>
	<!-- end related-activities -->

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