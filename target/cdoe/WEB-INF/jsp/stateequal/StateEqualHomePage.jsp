
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

<%
	String userName = (String) session.getAttribute("userName");
		String userType = "stateEqualUser";
		if (userName != null && "districtUser".equals(userName))
			userType = "districtUser";
%>

<div id="mainContent">
	<h3>State Share Processing</h3>
	<form>

		<table>
			<tr>
				<td><font size="2"><b>Last Payment Processed:</b></FONT></td>
				<td><input type="text" value="June 2012" /></td>
				<td><font size="2"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Next
							Payment Processing for :</b></font></td>
				<td><input type="text" value="July 2012" /></td>
			</tr>
		</table>
		<br>
		<table width="60%">
			<%
				if ("stateEqualUser".equals(userType)) {
			%>
				<tr>
					<td align="left">
						<h3>Maintenance Tasks</h3>
					<td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/rulesMenu.htm">1.
							Create and Maintain Calculation Rules</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/UploadVariables">2.
							Upload Variables/Adjustments</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/UploadVariables">3.
							Enter/Update Single District Variables</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/ImportAudits">4.
							Import Prior Year Audited Pupil and Lunch Counts</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/AddAdjustment">5.
							Enter/Update Monthly Adjustments</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/CrosswalkCollectionData">6.
							Crosswalk Collection Data</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/Comments">7.
							Enter Review Comments</a>
					<td>
				</tr>
				<tr></tr>
				<tr>
					<td align="left">
						<h3>Processing Tasks</h3>
					<td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/CalculateEntitlements">1.
							Calculate Entitlements - Monthly, Mid-Year, End-of-Year</a></td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/MonthlyPayments">2.
							Process Monthly Payments and Upload to COFRS</a></td>
				</tr>
				<tr></tr>
				<tr>
					<td><a href="${pageContext.request.contextPath}/secure/Reports">3.
							Reports</a></td>
				</tr>
				<tr></tr>
				<tr>
				<td>
					<h3>State Equal Processing Help</h3>
				<td>
			</tr>
			<tr></tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/secure/julyProcessing.htm">1.
						July Processing</a></td>
			</tr>
			<tr></tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/secure/augToNovProcessing.htm">2.
						August to November Processing</a></td>
			</tr>
			<tr></tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/secure/decemberProcessing.htm">3.
						December Processing</a></td>
			</tr>
			<tr></tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/secure/janToMayProcessing.htm">4.
						January to May Processing</a></td>
			</tr>
			<tr></tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/secure/juneProcessing.htm">5.
						June Processing</a></td>
			</tr>
			
			<%
				} else {
			%>
			
				<tr>
					<td align="left">
						<h3>District Tasks</h3>
					<td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/MillLevyCert">1.
							Mill Levy Certification</a></td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/MillLevyOverrideWorksheet">2.
							Override Limit Calculation Worksheet</a></td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/CSICalculations">3.
							Alternate At Risk Calculations</a></td>
				</tr>
				<tr></tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/secure/Elections">4.
							Election Reporting</a></td>
				</tr>
				<tr></tr>
			<%
				}
			%>
			<!-- Show only this for admin -->
			<!--  tr>
				<td>
					<h3>Administration</h3>
				</td>
			</tr -->
			<!-- tr>
							<td><a href="viewLogs.htm">View Logs</a></td>
						</tr-->
			<!-- tr>
				<td><a href="enterReviewComments.htm">1. Review Comments</a></td>
			</tr  -->
		</table>
	</form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AdvanceAndEntitlementReport.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%><%@include
	file="/WEB-INF/jsp/JspCatch.inc"%>