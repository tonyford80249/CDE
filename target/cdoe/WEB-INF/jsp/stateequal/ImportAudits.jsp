
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
	<h3>
		<spring:message
			code="ImportAudits.StaticText.importPriorYearAuditedPupilAndLunchCountsStaticText" />
	</h3>
	<form:form commandName="auditEqualForm"
		action="${pageContext.request.contextPath}/secure/ImportAudits/save"
		method="post">
		<input type="hidden" name="rowKey" id="rowKey" />
		<!-- Main outer table -->
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td><b>Audits</b></td>
						</tr>
						<tr></tr>
						<tr>
							<td align="left"><input type="checkbox" name="selectAll"
								onclick="toggle(this)" value="false"></input><b>Select All</b></td>
						</tr>
						<tr>
						<td>
						<div id="auditEqualGrid" align="center"
							style="border: 5px groove #ccc;">
							<table id="auditEqualGrid" class="display">
								<thead>
									<tr>

										<th>Select</th>

										<th>District Number</th>

										<th>District Name</th>

										<th>Date Available As Of</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach var="auditEqualGrid"
										items="${auditEqualForm.auditEqualGridList}" varStatus="idx">
										<tr>
											<td></td>

											<td><form:input
													path="auditEqualGridList[${idx.index}].districtNumber" /></td>

											<td><form:input
													path="auditEqualGridList[${idx.index}].dateChanged" /></td>

											<td><form:input
													path="auditEqualGridList[${idx.index}].organizationCode" /></td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
							<script type="text/javascript">
							<!--
								$(document).ready(function() {
									$("table#auditEqualGrid").dataTable({
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
						</tr>
						</td>

					</table>
				</td>
				<td valign="top">
					<table>
						<tr align="left">
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td colspan="2"><b>Reset Audits</b></td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td colspan="2"><b>Fiscal Year:</b></td>
							<td><select name="beginningFiscalYear">
									<option>2012</option>
									<option>2013</option>
									<option>2014</option>
									<option>2015</option>
									<option>2016</option>
									<option>2017</option>
									<option>2018</option>
									<option>2019</option>
									<option>2020</option>
							</select></td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td align="left" colspan="2"><b>District Code</b></td>
							<td align="left"><select name="districtCode">
									<option>Choose District Code</option>
									<option>631 - Arapahoe</option>
									<option>632 - Jefferson</option>
							</select></td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td colspan="1" align="left"><input type="submit"
								value="Reset" /></td>
						</tr>
					</table>
				</td>
			</tr>
			<TR>
				<TD><spring:message
						code="ImportAudits.StaticText.noteAuditsShouldNotShowOnceUploadedStaticText" />
				</TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/ImportAudits.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>