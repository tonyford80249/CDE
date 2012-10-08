
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
<form:form commandName="auditTranForm"
	action="${pageContext.request.contextPath}/secure/AudCDE40TransReimbForm/save"
	method="post">

	<!-- Main outer table -->
	<h3>Public School Transportation Fund Reimbursement Claim</h3>
	<TABLE CLASS="ContentTable">
		<TR>
			<TD>
				<TABLE>


					<TR>
						<TD ALIGN="right"><LABEL FOR="">Fiscal Year</LABEL>
						<TD>
						<TD><form:input id="" path="" value="2011-2012" />
						<TD>
						<TD ALIGN="right"><LABEL FOR="">District Code</LABEL></TD>
						<TD><form:input id="" path="" value="3120" />
						<TD>
						<TD ALIGN="right"><LABEL FOR="">District Name</LABEL></TD>
						<TD><form:input id="" path="" value="Broomfield" /></TD>
					</TR>
				</table>
			</TD>
		</TR>
	</TABLE>
	<TABLE>
		<TR>
			<TD>Change Transportation</TD>
			<TD>District</TD>
			<TD><LABEL FOR="">Audit</LABEL></TD>
			<TD><LABEL FOR="">Difference</LABEL></TD>
		</TR>
	</TABLE>
	<TABLE>
		<TR>
			<TD>Total Current Operating Expenditures For Pupil
				Transportation</TD>
			<TD><span> <c:out value="auditTran.operTran" />
			</span></TD>

		</tr>
	</TD>
	
	</TR>
	</TABLE>
	<TABLE>
		<TR>
			<TD><input type="button" id="" value="Save Changes" /></TD>
			<TD><input type="button" id="" value="Print This Page to Excel" />
			</TD>
		</TR>
	</TABLE>
	</TD>
	</TR>
	</TABLE>
</form:form>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AudCDE40TransReimbForm.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>