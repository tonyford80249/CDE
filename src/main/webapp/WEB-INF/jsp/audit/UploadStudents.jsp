
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
<form:form commandName="auditTrackingForm"
	action="${pageContext.request.contextPath}/secure/UploadStudents/save"
	method="post">
	<!-- Main outer table -->
	<h3>State Equal Exceptions Upload Students (Step 2)</h3>
	<TABLE CLASS="ContentTable">
		<TR>
			<TD>
				<TABLE>

					<TR>
						<TD ALIGN="right"><LABEL FOR="">Fiscal Year</LABEL></TD>
						<TD><form:input id="" path="" />&nbsp;&nbsp;&nbsp;&nbsp</TD>

						<TD ALIGN="right"><LABEL FOR="">District Code</LABEL></TD>
						<TD><form:input id="" path="" />&nbsp;&nbsp;&nbsp;&nbsp</TD>

						<TD ALIGN="right"><LABEL FOR="">District Name </LABEL></TD>
						<TD><form:input id="" path="" />&nbsp;&nbsp;&nbsp;&nbsp</TD>
					</TR>

				</TABLE> </BR>
				<TABLE width="100%">
					<TR>

						<TD ALIGN="right" colspan="2"><h3>
								<LABEL FOR="">Browse to upload file of SASIDs</LABEL>
							</h3></TD>
					</TR>
				</table>
				<table>
					<TR>
						<TD WIDTH="10%" />
						<TD><form:input id="" type="file" path="" /></TD>
					</TR>
				</TABLE> </BR>
				<TABLE  width="100%">

					<TR>
						<TD><h3>Or Manually Enter up to 10 SASIDs to search for:</h3></TD>
					</TR>
				</TABLE>
				<TABLE>
					<TR>
						<TD WIDTH="10%" />
						<TD>
							<TABLE>
								<%
									for (int i = 0; i < 10; i++) {
								%>
								<TR>
									<TD width="10%"></TD>
									<TD><form:input id="" path="" /></TD>

									<%
										}
									%>
								</TR>
								<TR>
									<TD>
									<TD><input type="Submit" id=""
										value="Search above Student SASIDs" /></TD>
									</TD>
								</TR>
							</TABLE>
						</TD>

					</TR>
				</TABLE>
			</TD>
		</TR>
	</TABLE>
</form:form>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AuditSummary.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>