<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><spring:message code="home.page.title" /></title>
<%@ include file="commonjs.jsp"%>
</head>
<body>

	<%@ include file="header-cms.jsp"%>


	<div class="clear"></div>

	<!-- start content-outer -->
	<div id="content-outer">
		<!-- start content -->
		<div id="content">


			<div id="page-heading">
				<h1>
					<spring:message code="home.heading" />
				</h1>
			</div>


			<table border="0" width="100%" cellpadding="0" cellspacing="0"
				id="content-table">
				<tr>
					<td>
						<table border="0" width="100%" cellpadding="0" cellspacing="0"
							id="content-table">
							<tr>
								<th rowspan="3" class="sized"><img src="<c:url value="/resources/images/shared/side_shadowleft.jpg"/>" width="20" height="300"
									alt="" /></th>
								<th class="topleft"></th>
								<td id="tbl-border-top">&nbsp;</td>
								<th class="topright"></th>
								<th rowspan="3" class="sized"><img
									src="<c:url value="/resources/images/shared/side_shadowright.jpg"/>" width="20"
									height="300" alt="" /></th>
							</tr>
							<tr>
								<td id="tbl-border-left"></td>
								<td>
									<!--  start content-table-inner ...................................................................... START -->
									<div id="content-table-inner">
										<table>
											<tr>
												<td width="70%">
													<!--  start table-content  -->
													<div id="table-content">
														<h2><spring:message code="home.sub.heading" /></h2>
															<ul class="greyarrow">
																<li>Manage Merchants/Businesses</li>
																<li>Manage Card Programs</li>
																<li>Manage Offers</li>
																<li>Manage Users</li>
																<li>View Transactions</li>
															</ul>
													</div> <!--  end table-content  -->
												</td>
												<td width="30%">
													<!--  start related-activities -->
													<div id="related-activities">

														<!--  start related-act-top -->
														<div id="related-act-top">
															<img src="<c:url value="/resources/images/forms/header_related_act.gif"/>"
																width="271" height="43" alt="" />
														</div>
														<!-- end related-act-top -->

														<!--  start related-act-bottom -->
														<div id="related-act-bottom">

															<!--  start related-act-inner -->
															<div id="related-act-inner">

																<div class="left">
																	<a href=""><img src="<c:url value="/resources/images/forms/icon_edit.gif"/>"
																		width="21" height="21" alt="" /></a>
																</div>
																<div class="right">
																	<h5>Manage Merchants/Business</h5>
																	Register and on-board new merchants.
																	<ul class="greyarrow">
																		<li><a href="${viewMerchant}">List available Merchants</a></li>
																		<!--  <li><a href="">Click here to visit</a></li> -->
																	</ul>
																</div>

																<div class="clear"></div>
																<div class="lines-dotted-short"></div>

																<div class="left">
																	<a href=""><img src="<c:url value="/resources/images/forms/icon_edit.gif"/>"
																		width="21" height="21" alt="" /></a>
																</div>
																<div class="right">
																	<h5>Define Card Products</h5>
																	Customize Card Products for Business and Merchants.
																	<ul class="greyarrow">
																		<li><a href="${viewCardProduct}">Show available Card Products</a></li>
																	</ul>
																</div>

																<div class="clear"></div>
																<div class="lines-dotted-short"></div>

																<div class="left">
																	<a href=""><img src="<c:url value="/resources/images/forms/icon_edit.gif"/>"
																		width="21" height="21" alt="" /></a>
																</div>
																<div class="right">
																	<h5>Search Transaction</h5>
																	As Admin, search and analyse all transaction.
																	<ul class="greyarrow">
																		<li><a href="${transaction}">Search Transaction</a></li>
																	</ul>
																</div>
																<div class="clear"></div>

															</div>
															<!-- end related-act-inner -->
															<div class="clear"></div>

														</div>
														<!-- end related-act-bottom -->

													</div> <!-- end related-activities -->
												</td>
											</tr>
										</table>



										<div class="clear"></div>

									</div> <!--  end content-table-inner ............................................END  -->
								</td>
								<td id="tbl-border-right"></td>
							</tr>
							<tr>
								<th class="sized bottomleft"></th>
								<td id="tbl-border-bottom">&nbsp;</td>
								<th class="sized bottomright"></th>
							</tr>
						</table>
					</td>
					<td>test 3</td>
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
	<%@ include file="footer.jsp"%>
	<!-- end footer -->

</body>
</html>