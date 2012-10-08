
<%--
(ref: jsp/jsp.jsp.et.jsp)
-------------------------------------
$Revision:   $
$Date:  $
$Author:   $
$Modtime: $

Version History:
-------------------------------------
$Log:$
--%>
<%@ page language="java"%>
<%@ page import="com.cdoe.ui.*"%>
<%@ page import="com.cdoe.biz.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainContent">
	<form:form commandName="stateEqualForm"
		action="${pageContext.request.contextPath}/secure/DisplayAdjustment/save"
		method="post">
		<input type="hidden" name="rowKey" id="rowKey" />


		<!-- Main outer table -->
		<h3>
			<spring:message
				code="DisplayAdjustment.StaticText.viewAuditRepaymentAdjustmentStaticText" />
		</h3>
		<TABLE>
			<TR>

				<TD>District Number:</TD>
				<TD><form:input id="DistrictNumber" path="districtNumber"
						size="12" maxlength="12" /></TD>
				<TD>District Name:</TD>
				<TD><input id="DistrictName" path="districtName" size="26"
					maxlength="26" /></TD>
			</TR>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.fiscalMonthStaticText" /></LABEL></TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.fiscalYearStaticText" /></LABEL></TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
			</TR>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.typeStaticText" /></LABEL></TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
			</TR>

			<TR>
				<TD><input type="submit" id=""
					value="<spring:message code="DisplayAdjustment.Button.searchButton" />" />
				</TD>
				<TD><input type="reset" id=""
					value="<spring:message code="DisplayAdjustment.Button.clearButton" />" />
				</TD>
			</TR>
			<TR>
				<TD COLSPAN="6">
					<div id="stateEqualGrid" align="center"
						style="border: 5px groove #ccc;">
						<table id="stateEqualGrid" class="display">
							<thead>
								<tr>

									<th>Adj #</th>

									<th>District Code</th>

									<th>District Name</th>

									<th>Status</th>

									<th>Type</th>

									<th>Reason</th>

									<th>Frequency</th>
									<th>Begin Month/Year</th>
									<th>End Month/Year</th>
									<th>IPC</th>
									<th>Amount</th>

								</tr>
							</thead>
							<tbody>
								<c:forEach var="stateEqualGrid"
									items="${stateEqualForm.stateEqualGridList}" varStatus="idx">
									<tr>

										<td><form:input
												path="stateEqualGridList[${idx.index}].districtNumber" /></td>

										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>
										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>
										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>
										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>

										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>
										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>
										<td><form:input
												path="stateEqualGridList[${idx.index}].adjStateAssess" /></td>


									</tr>
								</c:forEach>
							</tbody>
						</table>
						<script type="text/javascript">
						<!--
							$(document).ready(function() {
								$("table#stateEqualGrid").dataTable({
									"bPaginate" : false,
									"bSort" : false,
									"bFilter" : false,
									"bInfo" : false,
									"bLengthChange" : false,
									"bAutoWidth" : false
								});
							});
						//-->
						</script>
					</div>
				</TD>
			</TR>
			<TR>
				<TD><input type="submit" id=""
					value="<spring:message code="DisplayAdjustment.Button.editButton" />" />
				</TD>
				<TD></TD>
			</TR>

			<TR>
				<TD COLSPAN="4"><h3><spring:message
						code="DisplayAdjustment.StaticText.viewAdjustmentsByTypeStaticText" /></h3>
				</TD>
			</TR>

			<TR>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.fiscalYearStaticText_2" /></LABEL></TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
			</TR>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.districtCodeStaticText_2" /></LABEL>
				</TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
			</TR>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="DisplayAdjustment.StaticText.adjustmentTypeStaticText" /></LABEL>
				</TD>
				<TD><form:select id="" path="" items="${List}" /></TD>
			</TR>
			<TR>
				<TD><input type="submit" id=""
					value="<spring:message code="DisplayAdjustment.Button.searchButton" />" />
				</TD>
				<TD><input type="reset" id=""
					value="<spring:message code="DisplayAdjustment.Button.clearButton" />" />
				</TD>
			</TR>

		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/DisplayAdjustment.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>