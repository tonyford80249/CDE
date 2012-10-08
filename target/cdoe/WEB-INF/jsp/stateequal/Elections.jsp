
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
	<form:form commandName="electionsDetailForm"
		action="${pageContext.request.contextPath}/secure/Elections/save"
		method="post">

		<!-- Main outer table -->
		<h3>
			<spring:message
				code="Elections.StaticText.reportOfCurrentYearElectionResultsStaticText" />
		</h3>
		<TABLE>
			<TR>
				<TD>District Number:</TD>
				<TD><input id="DistrictNumber" path="districtNumber" size="12"
					maxlength="12" /></TD>
				<TD>District Name:</TD>
				<TD><input id="DistrictName" path="districtName" size="26"
					maxlength="26" /></TD>
			</TR>

			<TR>
				<TD COLSPAN="4"><b><spring:message
							code="Elections.StaticText.pleaseIndicateWhetherOrNotTheBoardOfEducationOfTheAboveDistrictHeldOneOrMoreOfTheFollowingElectionsInNovember2011StaticText" /></b>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><form:checkbox id="" path="" value="true" /></TD>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.ifNoElectionWasHeldPleaseMarkThisBoxAndReturnToCdeOtherwiseCompleteTheFormStaticText" /></LABEL>
				</TD>
			</TR>
			<TR>
				<TD COLSPAN="2"><spring:message
						code="Elections.StaticText.$1OverrideElectionPursuantToSection2254108CrsStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_5" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_4" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.$2FullDayKindergartenOverrideElectionPursuantToSection22541085CrsStaticText" /></LABEL>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_4" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_3" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><spring:message
						code="Elections.StaticText.$3TransportationElectionPursuantToSection224010217CrsStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_3" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_2" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><spring:message
						code="Elections.StaticText.$4BondElectionPursuantToSection2242102CrsStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_2" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><spring:message
						code="Elections.StaticText.$5SpecialBuildingAndTechnologyElectionPursuantToSection224010215CrsStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_5" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.$6ElectionDeBrucingRegardingFiscalYearSpendingLimitsPursuantToArticleXSection20OfTheStateConstitutionTheTaxPayersBillOfRightsStaticText" /></LABEL>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_6" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_6" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.$7CapitalImprovemntsLoanRepaymentsGrowthDistrictsElectionPursuantToSection2240110CrsStaticText" /></LABEL>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_7" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_7" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
				<td><input type="radio" name="outcome"></input>Fail?</td>
			</tr>
			<tr>
				<td colspan="1">Ballot Question:</td>
				<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><spring:message
						code="Elections.StaticText.$8CharterSchoolSpecialCapitalConstructionSpecialMillLevyElectionPursuantToSection22305405CrsStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.pleaseReportEachElectionQuestionSeparatelyAndProvideCopyOfEachSampleBallotStaticText" /></LABEL>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_8" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_8" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
						<td><input type="radio" name="outcome"></input>Fail?</td>
					</tr>
					<tr>
					<td colspan="1">
						Ballot Question:
					</td>
					<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.$9OtherElectionDisctrictConsolidationDeconsolidationDistrictReorganizationEtcStaticText" /></LABEL>
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">Yes</span></span></TD>
				<TD><span><form:checkbox id="" path="electionHeldStatus"
							value="true" /><span class="text">No</span></span></TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.indicateTheNumberOfElectionsForStaticText_9" /></LABEL>
				</TD>
				<TD><form:input id="" path="for0" size="25" maxlength="40" />
				</TD>
				<TD ALIGN="right"><LABEL FOR=""><spring:message
							code="Elections.StaticText.againstStaticText_9" /></LABEL></TD>
				<TD><form:input id="" path="against" size="25" maxlength="40" /></TD>
				<td><input type="radio" name="outcome"></input>Pass?</td>
						<td><input type="radio" name="outcome"></input>Fail?</td>
					</tr>
					<tr>
					<td colspan="1">
						Ballot Question:
					</td>
					<td colspan="6"><textarea rows="2" cols="140"></textarea></td>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD><LABEL FOR=""><spring:message
							code="Elections.StaticText.typeOfOtherElectionStaticText" /></LABEL></TD>
				<TD><form:input id="" path="electionType" size="50"
						maxlength="250" /></TD>
			</TR>
			<TR>
				<TD COLSPAN="4"><spring:message
						code="Elections.StaticText.ifAnyElectionWasHeldAttachAnOfficialSampleBallotInWhichIsStatedTheQuestionSSubmittedToTheElectorsOrACopyOfTheOfficialBallotQuestionLanguageAsCertifiedToTheCountyClerkForACoordinatedElectionStaticText" />
				</TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD WIDTH="82%" />
				<TD colspan="4" align="center"><input type="submit" id=""
					value="<spring:message code="Elections.Button.saveButton" />" /></TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/Elections.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>