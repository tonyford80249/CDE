
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
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainContent">
	<form>

		<!-- Main outer table -->
		<h3>
			<fmt:message
				key="CalculateEntitlements.StaticText.calculateDistrictEntitlementsMonthlyMidYearEndOfYearStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD>
					<TABLE>
						<TR>
							<TD ALIGN="right"><LABEL FOR=""><fmt:message
										key="CalculateEntitlements.StaticText.fiscalYearStaticText" /></LABEL>
							</TD>
							<TD><select id="" list="{}" path="fiscalYearDropdownList"
								size="1" /></TD>
						</TR>
						<TR>
							<TD ALIGN="right"><LABEL FOR=""><fmt:message
										key="CalculateEntitlements.StaticText.monthStaticText" /></LABEL></TD>
							<TD><select id="" list="{}" path="monthDropdownList"
								size="1" /></TD>
						</TR>
						<TR>
							<TD ALIGN="right"><LABEL FOR=""><fmt:message
										key="CalculateEntitlements.StaticText.caculationPeriodStaticText" /></LABEL>
							</TD>
							<TD><select id="" list="{}"
								path="caculationPeriodDropdownList" size="1" /></TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><input type="submit" id="" name="viewReportButton"
								value="<fmt:message key="CalculateEntitlements.Button.viewReportButton" />" />
							</TD>
							<TD><input type="submit" id="" name="confirmButton"
								value="<fmt:message key="CalculateEntitlements.Button.confirmButton" />" />
							</TD>
							<TD><input type="reset" id="" name="cancelButton"
								value="<fmt:message key="CalculateEntitlements.Button.cancelButton" />" />
							</TD>
						</TR>
					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/CalculateEntitlements.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>