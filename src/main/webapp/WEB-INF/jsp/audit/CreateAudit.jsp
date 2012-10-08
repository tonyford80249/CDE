
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
		action="${pageContext.request.contextPath}/secure/CreateAudit/save"
		method="post">

		<!-- Main outer table -->
		<h3>
			<spring:message code="CreateAudit.StaticText.createAuditStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD>

					<TABLE>
						<TR>
							<TD><LABEL FOR=""><b><spring:message
										code="CreateAudit.StaticText.districtNumberStaticText" /></b></LABEL></TD>
							<TD><!-- form:select id="" path="districtNumber"
									items="${districtNumberList}" />  -->
									<select>
									  <option>-- DistrictNumber --</option>
									</select></TD>

							<form:errors path="" /></td>
						</tr>

						<TR>
							<TD><LABEL FOR=""><b><spring:message
										code="CreateAudit.StaticText.districtNameStaticText" /></b></LABEL></TD>
							<TD><form:input id="" path="" /> <form:errors path="" /></td>
						</tr>

						<TR>
							<TD COLSPAN="16"><h3><spring:message
									code="CreateAudit.StaticText.selectedRangeForFiscalYearsForEachProgramAuditedStaticText" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3>
							</TD>
						</TR>

						<TR>
							<TD COLSPAN="16"><b><spring:message
									code="CreateAudit.StaticText.stateEqualStaticText" /></b></TD>
						</TR>
					</table>
					<table>
						<TR>
							<TD><form:radiobutton id="" path="" value="true" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.naStaticText" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$1YearStaticText" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$2YearStaticText" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$3YearStaticText" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$4YearStaticText" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$5YearStaticText" /></LABEL></TD>
							<TD><span> </span></TD>
							<TD>2011-2012</TD>
							
						</TR>
						<TR>
							<TD colspan="16" align="right">2010-2011</TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD COLSPAN="16"><b><spring:message
									code="CreateAudit.StaticText.transportationStaticText" /></b></TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.naStaticText_2" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$1YearStaticText_2" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$2YearStaticText_2" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$3YearStaticText_2" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$4YearStaticText_2" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$5YearStaticText_2" /></LABEL></TD>
							<TD><span> </span></TD>
							<TD>2011-2012</TD>

						</TR>
						<TR>
							<TD colspan="16" align="right">2010-2011</TD>
						</TR>
						<TR>
							<TD colspan="16" align="right">2009-2010</TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD COLSPAN="14"><b><spring:message
									code="CreateAudit.StaticText.elpaStaticText" /></b></TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.naStaticText_3" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$1YearStaticText_3" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$2YearStaticText_3" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$3YearStaticText_3" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$4YearStaticText_3" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$5YearStaticText_3" /></LABEL></TD>
							<TD><span> </span></TD>
							<TD></TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD COLSPAN="14"><b><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.billingStaticText" /></b></LABEL></TD>
						</TR>
						</table>
					<table>
						<TR>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.naStaticText_4" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$1YearStaticText_4" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$2YearStaticText_4" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$3YearStaticText_4" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD ALIGN="right"><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$4YearStaticText_4" /></LABEL></TD>
							<TD><form:radiobutton id="" path="" value="true" /> <form:errors
									path="" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.$5YearStaticText_4" /></LABEL></TD>
							<TD><span> </span></TD>
							
						
							<TD colspan="16" align="right">2010-2011</TD>
						</TR>
						<TR>
							<TD colspan="16" align="right">2009-2010</TD>
						</TR>
						<TR>
							<TD colspan="16" align="right">2008-2009</TD>
						</TR>
					</TABLE>
				</TD>
				<TD width="6%">&nbsp</TD>
				<TD valign="top">
					<TABLE>
						<TR>
							<TD valign="top"><b><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.auditIdStaticText" /></b></LABEL></TD>
							<TD><!-- form:select id="" path="" items="${List}" /--> <select
								name="status">
									<option>-- Choose Audit ID --</option>
							</select></TD>
						</tr>
						<TR>
							<TD><LABEL FOR=""><b><spring:message
										code="CreateAudit.StaticText.dateAssignedStaticText" /></b></LABEL></TD>
							<TD><form:input id="" path="" /> </td>
							
						</tr>
						<TR>
							<TD ><LABEL FOR=""><b><spring:message
										code="CreateAudit.StaticText.auditorStaticText" /></b></LABEL></TD>
							<TD><!--form:select id="" path="" items="${List}" /  --> <select
								name="status">
									<option>-- Choose Status --</option>
							</select></TD>
						</tr>
						<TR>
							<TD ><LABEL FOR=""><b><spring:message
										code="CreateAudit.StaticText.typeStaticText" /></b></LABEL></TD>
									<TD><!-- form:select id="" path="" items="${List}" /  --> <select
									name="type">
									<option>-- Choose Type --</option>
							</select></TD>
						</tr>
						<TR>
							<TD ALIGN="right"><b><LABEL FOR=""><spring:message
										code="CreateAudit.StaticText.supervisorCommentsStaticText" /></LABEL></TD>
							<TD><form:textarea id="" path="" rows="16" cols="48" /><b><form:errors
									path="" /></TD>

						</TR>
					</TABLE>
				</TD>
			</TR>
			<TR>
				<TD align="center"><input type="button" id="" value="Create Audit" /></TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/CreateAudit.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>