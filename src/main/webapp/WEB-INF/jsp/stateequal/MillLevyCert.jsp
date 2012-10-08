
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

	<form:form commandName="vDataForm"
		action="${pageContext.request.contextPath}/secure/MillLevyCert/save"
		method="post">

		<!-- Main outer table -->
		<h3>
			<spring:message
				code="MillLevyCert.StaticText.millLevyCertiicationStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD>
					<TABLE>

						<TR>
							<TD>District Number:</TD>
							<TD><input id="DistrictNumber" path="districtNumber"
								size="12" maxlength="12" /></TD>
							<TD>District Name:</TD>
							<TD><input id="DistrictName" path="districtName" size="26"
								maxlength="26" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="MillLevyCert.StaticText.countyStaticText" /></LABEL></TD>
							<TD><form:input id="" path="vTextstring" size="25"
									maxlength="128" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="MillLevyCert.StaticText.propertyTaxYearStaticText" /></LABEL></TD>
							<TD><form:select id="" path="" items="${List}" /></TD>
						</TR>

						<TR>
							<TD><LABEL FOR=""><spring:message
										code="MillLevyCert.StaticText.nameStaticText" /></LABEL></TD>
							<TD><form:input id="" path="vTextstring" size="25"
									maxlength="128" /></TD>
							<TD><LABEL FOR=""><spring:message
										code="MillLevyCert.StaticText.phoneStaticText" /></LABEL></TD>
							<TD><form:input id="" path="vTextstring" size="25"
									maxlength="128" /></TD>
						</TR>
					</table>
					<table>
						<TR>
							<TD><h3><spring:message
									code="MillLevyCert.StaticText.millLevyCategoryStaticText" /></h3></TD>
							<TD width="23%"><h3><spring:message
									code="MillLevyCert.StaticText.cdePreliminaryMillLevyStaticText" />
							</h3></TD>
							<TD><h3><spring:message
									code="MillLevyCert.StaticText.districtMillLevyStaticText" /></h3></TD>
							<TD><h3><spring:message
									code="MillLevyCert.StaticText.finalMillCertifiedStaticText" /></h3>
							</TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$1TotalProgramStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$2CategoricalBuyoutStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD COLSPAN="4"><spring:message
									code="MillLevyCert.StaticText.$3OverridesStaticText" /></TD>
						</TR>

						<TR>
							<TD>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message
									code="MillLevyCert.StaticText.aVoterApprovedStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message
									code="MillLevyCert.StaticText.bHoldHarmlessStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message
									code="MillLevyCert.StaticText.cExcessHoldHarmlessStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>

						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$4AbatementStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$5TotalGeneralFundStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$6BondRedemptionFundStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$7TransportationFundStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><LABEL FOR=""><spring:message
										code="MillLevyCert.StaticText.$8SpecialBuildingAndTechnologyFundStaticText" /></LABEL>
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$9FullDayKindergartenFundStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$10OtherStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.$11TotalStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>

						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.assessedValuationStaticText" />
							</TD>
						</TR>


						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.grossAssessedValuationStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.taxIncrementFinancingStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.netAssessedValuationStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.abatementsStaticText" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.totalAcrossAllCountiesStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>


						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.informationForCertificationToCountyTreasurerStaticText" />
							</TD>
						</TR>

						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.fullFundingMillLevyStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>
						<TR>
							<TD><spring:message
									code="MillLevyCert.StaticText.fundingReceivedFromStateStaticText" />
							</TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
							<TD><form:input id="" path="" /></TD>
						</TR>

						<TR>
							<TD><input type="button" id="" value="Calculate" /></TD>
							<TD><input type="button" id="" value="Approve as Final" /></TD>
							<TD><input type="button" id="" value="Save" /></TD>
							<TD><input type="button" id="" value="Print" /></TD>
						</TR>

					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/MillLevyCert.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>