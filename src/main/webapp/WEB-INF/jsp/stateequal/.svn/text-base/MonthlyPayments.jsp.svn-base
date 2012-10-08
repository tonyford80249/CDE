
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
	<form>

		<!-- Main outer table -->
		<h3>
			<fmt:message
				key="MonthlyPayments.StaticText.processMonthlyPaymentsStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD>
					<TABLE>
						<TR>
							<TD ALIGN="right"><LABEL FOR=""><fmt:message
										key="MonthlyPayments.StaticText.fiscalYearStaticText" /></LABEL></TD>
							<TD><select id="" list="{}" path="fiscalYearDropdownList"
								size="1" /></TD>
							<TD><input type="button" id="" name="viewPaymentReport"
								value="Calculate and View Payment Report" /></TD>
						</TR>
						<TR>
							<TD ALIGN="right"><LABEL FOR=""><fmt:message
										key="MonthlyPayments.StaticText.monthStaticText" /></LABEL></TD>
							<TD><select id="" list="{}" path="monthDropdownList"
								size="1" /></TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><fmt:message
									key="MonthlyPayments.StaticText.selectDistrictsToBePaidStaticText" />
							</TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD>
								<TABLE>
									<TR>
										<TD><select id="" list="{}"  value="NONE" label="-- Select to Pay --"
											path="scrollingList912ScrollingList" size="10" /></TD>
									</TR>
								</TABLE>
							</TD>
							<TD>

								<TABLE>
									<TR>
										<TD><input type="submit" id=""
											value="<fmt:message key="MonthlyPayments.Button.button" />" />
										</TD>
									</TR>
									<TR>
										<TD><input type="submit" id=""
											value="<fmt:message key="MonthlyPayments.Button.button_2" />" />
										</TD>
									</TR>
									<TR>
										<TD><input type="submit" id=""
											value="<fmt:message key="MonthlyPayments.Button.allButton" />" />
										</TD>
									</TR>
									<TR>
										<TD><input type="submit" id="" name="PayAll"
											value="<fmt:message key="MonthlyPayments.Button.allButton_2" />" />
										</TD>
									</TR>
								</TABLE>
							</TD>
							<TD>
								<TABLE>
									<TR>
										<TD><select id="" list="{}" value="NONE" label="-- Districts to be  Paid --" 
											path="scrollingList914ScrollingList" size="10" /></TD>
									</TR>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><input type="submit" id=""
								value="<fmt:message key="MonthlyPayments.Button.confirmSendToCofrsButton" />" />
							</TD>
						</TR>

					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/MonthlyPayments.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>