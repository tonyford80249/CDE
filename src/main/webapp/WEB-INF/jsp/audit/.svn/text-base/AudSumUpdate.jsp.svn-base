
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
	<form:form commandName="auditEqualForm"
		action="${pageContext.request.contextPath}/secure/AudSumUpdate/save"
		method="post">

		<!-- Main outer table -->
		<h3>
			<spring:message
				code="AudSumUpdate.StaticText.auditSummaryUpdateStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD width="2%">
				<TD>

					<TABLE>
						<TR>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.districtNumberStaticText" /></LABEL></TD>
							<TD><!-- form:select id="" path="districtNumber"
									items="${districtNumberList}" /--> 
									<select>
									  <option>-- DistrictNumber --</option>
									</select></TD>
						</TR>
						<TR>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.districtNameStaticText" /></LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>

						<TR>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.auditIdStaticText" /></LABEL></TD>
							<TD><form:input id="" path="" /> </td>
						</tr>

						<TR>
							<TD><LABEL FOR="">Primary Auditor</LABEL></TD>
							<TD><!-- form:select id="" path="" items="${List}" / --> <select>
									  <option>-- Primary Auditor--</option>
									</select></TD>

						</tr>

						<TR>
							<TD><LABEL FOR="">Secondary Auditor</LABEL></TD>
									<TD><select>
									  <option>-- Primary Auditor--</option>
									</select></TD>

						</tr>
						<TR>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.typeStaticText" /></LABEL></TD>
							<TD><!-- form:select id="" path="" items="${List}" / --><select>
									  <option>-- Audit Type --</option>
									</select></TD>

						</tr>


						<tr>

							<TD><LABEL FOR="">Date Audit Opened</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<TR>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.totalAuditLiabilityStaticText" /></LABEL>
							</TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>




					</table>
				</TD>
				<TD width="2%">
				<TD valign="top">
					<table>

						<tr>

							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.dateDistrictContactedStaticText" /></LABEL>
							</TD>

							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>


						<tr>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.dateFieldWorkCompletedStaticText" /></LABEL>
							</TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.dateDraftReportCompletedStaticText" /></LABEL>
							</TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>

						<tr>
							<TD><LABEL FOR=""><spring:message
										code="AudSumUpdate.StaticText.dateDraftReportIssuedStaticText" /></LABEL>
							</TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR="">Issued By</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR="">Date Draft Report Finalized</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR="">Finalized By</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>


					</TABLE>
				</TD>
				<TD width="2%">
				<TD valign="top">
					<table>

						<tr>

							<TD><LABEL FOR="">Date Report Appealed</LABEL></TD>

							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>


						<tr>
							<TD><LABEL FOR="">Date Audit Closed</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR="">Date Audit Reopened</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>

						</tr>
						<tr>
							<TD><LABEL FOR="">Date Report Refinalized </LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>
						<tr>
							<TD><LABEL FOR="">Date Report Reclosed</LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>


					</TABLE>
				</TD>
			</TR>
		</TABLE>
		<table>
			<TR>
				<TD width="2%" />
				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.supervisorCommentsStaticText" /></LABEL></TD>
				<TD colspan="6"><form:textarea id="" path="" rows="6" cols="68" />
					<form:errors path="" /></TD>


			</TR>

			<tr>
				<TD width="2%" />
				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.auditorCommentsStaticText" /></LABEL></TD>
				<TD colspan="6"><form:textarea id="" path="" rows="6" cols="68" />
					<form:errors path="" /></TD>

			</tr>
		</table>
		<table>
			<TR>
				<TD><h3>
						<spring:message code="AudSumUpdate.StaticText.timesheetStaticText" />
					</h3></TD>
				<TD><h3>
						<spring:message
							code="AudSumUpdate.StaticText.hoursSpentStaticText" />
					</h3></TD>
			</TR>

			<TR>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.pupilCountStaticText" /></LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>


			<TR>
				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.atRiskStaticText" /></LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>


			<tr>

				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.transportationStaticText" /></LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>

			<tr>

				<TD><LABEL FOR=""><spring:message
							code="AudSumUpdate.StaticText.elpaStaticText" /></LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>
			<tr>

				<TD><LABEL FOR="">Billing</LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>
			<tr>

				<TD>Total</LABEL></TD>
				<TD><form:input id="" path="" /> <form:errors path="" /></td>
			</tr>




		</table>
		<table>
			<TR>
				<TD width="686px" />
				<TD><input type="button" id="" value="Print Audit Summary" /></TD>

				<TD width="480px"><input type="button" id=""
					value="Save Changes" align="left" /></TD>
			</TR>
		</table>

		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AudSumUpdate.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>