
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
		action="${pageContext.request.contextPath}/secure/CrosswalkCollectionData/save"
		method="post">

		<!-- Main outer table -->
		<h3><spring:message	code="CrosswalkCollectionData.StaticText.crosswalkCollectionDataStaticText" /></h3>
		<TABLE>
			<TR>
				<TD>
					<TABLE>


						<TR>
							<TD><LABEL FOR="FiscalYear"><spring:message
										code="CrosswalkCollectionData.StaticText.fiscalYearStaticText" /></LABEL>
							</TD>
							<TD><form:select cssClass="requiredControl" id="FiscalYear"
									path="fiscalYear" items="${fiscalYearList}" /></TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><spring:message
										code="CrosswalkCollectionData.StaticText.collectionTypeStaticText" /></LABEL>
							</TD>
							<TD><form:select cssClass="requiredControl" id="" path=""
									items="${List}" /></TD>
						</TR>
					
						<TR>
							<TD><input type="submit" id=""
								value="<spring:message code="CrosswalkCollectionData.Button.submitButton" />" />
							</TD>
							<TD><input type="reset" id=""
								value="<spring:message code="CrosswalkCollectionData.Button.cancelButton" />" />
							</TD>
						</TR>
					</TABLE>
					
					<TABLE>
						
						<TR><TD width="1000px"><h3><spring:message	code="CrosswalkCollectionData.StaticText.resultsStaticText" /></h3></TD></TR>
						<TR>
							<TD><input type="submit" id=""
								value="<spring:message code="CrosswalkCollectionData.Button.viewProposedImportButton" />" />
							</TD>

						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD ><LABEL FOR=""><spring:message
										code="CrosswalkCollectionData.StaticText.districtsMissingFromCrosswalkStaticText" /></LABEL>
							</TD>
							<TD><form:select id="" path="" items="${List}" /></TD>
						</TR>

					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/CrosswalkCollectionData.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>