
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
<%@ page import="java.util.*"%>
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
	ArrayList<String[]> iData = new ArrayList<String[]>();
		String[] a = { "360", "Complete Formula By District" };
		iData.add(0, a);
		String[] b = { "Funding Summary", "Funding Summary by District" };
		iData.add(0, b);
		String[] c = { "Monthly Payments",
				"Monthly Payments  by District" };
		iData.add(0, c);
		String[] d = { "CSI Payments", "CSI Payments by School" };
		iData.add(0, d);
		String[] e = { "Monthly Comparisons",
				"Monthly Data Elements Comparisons" };
		iData.add(0, e);
		String[] f = { "YTD Payments Withholding",
				"Year To Date Payments Withholding" };
		iData.add(0, f);
		String[] g = { "Mill Levy", "State  Wide Summary" };
		iData.add(0, g);
		String[] h = { "Election", "Elections" };
		iData.add(0, h);
		String[] o = { "Total Entitlements", "Total Entitlements" };
		iData.add(0, o);
		String[] j = { "Negative Payments", "Negative Payments" };
		iData.add(0, j);
		String[] k = { "COFRS Payments", "COFRS Payments" };
		iData.add(0, k);
		String[] n = { "Audit Upload Summary",
				"Summary of Audit Adjustments" };
		iData.add(0, n);
%>
<div id="mainContent">
	<form:form commandName="vDataForm"
		action="${pageContext.request.contextPath}/secure/Reports/save"
		method="post">
		<input type="hidden" name="rowKey" id="rowKey" />


		<!-- Main outer table -->
		<p id="adjustmentFormInstructions">
		<h3>&nbsp;&nbsp;&nbsp;&nbsp;Reports</h3>
		</p>
		<table>
			<tr>
				
				<td align="left"><b>Generate monthly reports for processing
						date:</b></td>
				<td align="left"><select name="beginningFiscalMonth">
						<option>Choose Month</option>
						<option>January</option>
						<option>February</option>
						<option>March</option>
						<option>April</option>
						<option>May</option>
						<option>June</option>
						<option>July</option>
						<option>August</option>
						<option>September</option>
						<option>October</option>
						<option>November</option>
						<option>December</option>
				</select></td>
				<td align="left"><select name="Year">
						<option>Choose Year</option>
						<option>2012</option>
						<option>2011</option>
						<option>2010</option>
						<option>2009</option>
						<option>2008</option>
						<option>2007</option>
				</select></td>
			</tr>
		</table>
		<table>
			<h3>
				<tr align="left">
					
					<td><h3>Select</h3></td>
					<td><h3>Report Name</h3></td>
					<td><h3>Description</h3></td>
					<td><h3>District Code&nbsp;&nbsp;&nbsp;&nbsp;</h3></td>
					</td>

				</tr>
			</h3>
			<%
				int length = iData.size();
						for (int i = length - 1; i >= 0; i--) {
			%>
			<tr>
				<td align="left"><input type="checkbox" name="selectedReport" + <%= i %>></input></td>
				<td><%=(iData.get(i))[0]%></td>
				<td><%=(iData.get(i))[1]%></td>
				<%
					if (i > 8) {
				%>
				<td><select name="districtCode">
						<option>Choose District Code</option>
						<option>631 - Arapahoe</option>
						<option>632 - Jefferson</option>
				</select></td>
				<%
					}
				%>


			</tr>
			<%
				}
			%>

			<tr>
				<td align="right" colspan="12"><h4>
						<b> <input type="Submit" id="" value="Generate Reports"/>
							<input type="Submit" id="" value="View Reports"/>&nbsp;&nbsp;&nbsp;&nbsp; 
							<input type="Submit" id="" value="Save Reports"/>&nbsp;&nbsp;&nbsp;&nbsp; 
							<input type="Submit" id="" value="Print Reports"/> &nbsp;&nbsp;&nbsp;&nbsp;
							<input type="Submit" id="" value="Publish Report(s) to CDE Website"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="Submit" id="" value="Cancel"/>
						</b>
					</h4></td>

			</tr>

		</table>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/Reports.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>