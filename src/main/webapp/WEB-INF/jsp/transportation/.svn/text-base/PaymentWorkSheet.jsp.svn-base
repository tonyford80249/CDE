
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

<script language="javascript" type="text/javascript">
	$(document)
			.ready(
					function() {

						/*
						 *  Attached function to dropdown's onchange event.
						 *
						 */
						$('select#districtNumber')
								.change(
										function() {
											var varDistrictNumber = "";
											$(
													"select#districtNumber option:selected")
													.each(
															function() {
																varDistrictNumber += $(
																		this)
																		.text();
															});

											$
													.getJSON(
															'${pageContext.request.contextPath}/secure/PaymentWorkSheet/json',
															{
																districtNumber : varDistrictNumber,
																fiscalYear : $(
																		'input#fiscalYearId')
																		.val()
															},
															function(json) {
																if (json.transportationForm.valid) {

																	$(
																			'input#DistrictName')
																			.val(
																					json.transportationForm.districtName);
																	$(
																			'input#pupilTran')
																			.val(
																					json.transportationForm.pupilTran);
																	$(
																			'input#totalCurrentOperatingExp')
																			.val(
																					json.transportationForm.operTran);
																	$(
																			'input#capitalOutlayExpense')
																			.val(
																					json.transportationForm.capOutTran);
																	$(
																			'input#netCurrentOperExpense')
																			.val(
																					json.transportationForm.netCurrentOperExpend);
																	$(
																			'input#migrationMiles')
																			.val(
																					json.transportationForm.migMiles);
																	$(
																			'input#regularDailyMiles')
																			.val(
																					json.transportationForm.regDMiles);
																	$(
																			'input#schoolDays')
																			.val(
																					json.transportationForm.schoolDays)
																	$(
																			'input#regularMiles')
																			.val(
																					json.transportationForm.regMiles);
																	$(
																			'input#totalReimMileage')
																			.val(
																					json.transportationForm.totalReimMileage);
																	$(
																			'input#mileageEntitlement')
																			.val(
																					json.transportationForm.mileageEntitlement);
																	$(
																			'input#excessCosts')
																			.val(
																					json.transportationForm.exCosts);
																	$(
																			'input#expenseReimbursement')
																			.val(
																					json.transportationForm.exReim);
																	$(
																			'input#mileageEntitlement')
																			.val(
																					json.transportationForm.mileageEntitlement);
																	$(
																			'input#maxReimEntitlement')
																			.val(
																					json.transportationForm.maxReimEntitlement);
																	$(
																			'input#reimbursementTranportation')
																			.val(
																					json.transportationForm.reimTran);
																	$(
																			'input#reimbursementTranportationLastYear')
																			.val(
																					json.transportationForm.reimTranLy);
																	$(
																			'input#reimEntitlement')
																			.val(
																					json.transportationForm.reimEntitlement);
																	$(
																			'input#boardTran')
																			.val(
																					json.transportationForm.boardTran);
																	$(
																			'input#totalReimEntitlement')
																			.val(
																					json.transportationForm.totalReimEntitlement);
																	$(
																			'input#advancePayLastYear')
																			.val(
																					json.transportationForm.advPayLy);
																	$(
																			'input#finalReimEntitlement')
																			.val(
																					json.transportationForm.finalReimEntitlement);
																	$(
																			'input#finalReimProrated')
																			.val(
																					json.transportationForm.finalReimProrated);
																	$(
																			'input#advancePay')
																			.val(
																					json.transportationForm.advPay);
																	$(
																			'input#desegReim')
																			.val(
																					json.transportationForm.desegReim);
																	$(
																			'input#actualMiles')
																			.val(
																					json.transportationForm.actMiles);
																	$(
																			'input#totalMiles')
																			.val(
																					json.transportationForm.totalMiles);
																	$(
																			'input#printOneReport')
																			.click(
																					function() {
																						window.location = "${pageContext.request.contextPath}/secure/PaymentWorkSheet/report/paymentWorksheet.pdf?districtNumber="
																								+ json.transportationForm.districtNumber
																								+ "&fiscalYear="
																								+ json.transportationForm.fiscalYear;
																					});

																} else {
																	$(
																			'input#DistrictName')
																			.val(
																					json.transportationForm.districtName);
																	$(
																			'input#pupilTran')
																			.val(
																					0);
																	$(
																			'input#totalCurrentOperatingExp')
																			.val(
																					0.00);
																	$(
																			'input#capitalOutlayExpense')
																			.val(
																					0.00);
																	$(
																			'input#netCurrentOperExpense')
																			.val(
																					0.00);
																	$(
																			'input#migrationMiles')
																			.val(
																					0.0);
																	$(
																			'input#regularDailyMiles')
																			.val(
																					0.0);
																	$(
																			'input#schoolDays')
																			.val(
																					0);
																	$(
																			'input#regularMiles')
																			.val(
																					0.0);
																	$(
																			'input#totalReimMileage')
																			.val(
																					0.0);
																	$(
																			'input#mileageEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#excessCosts')
																			.val(
																					0.00);
																	$(
																			'input#expenseReimbursement')
																			.val(
																					0.00);
																	$(
																			'input#mileageEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#maxReimEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#reimbursementTranportation')
																			.val(
																					0.0);
																	$(
																			'input#reimbursementTranportationLastYear')
																			.val(
																					0.0);
																	$(
																			'input#reimEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#boardTran')
																			.val(
																					0.0);
																	$(
																			'input#totalReimEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#advancePayLastYear')
																			.val(
																					0.0);
																	$(
																			'input#finalReimEntitlement')
																			.val(
																					0.0);
																	$(
																			'input#finalReimProrated')
																			.val(
																					0.0);
																	$(
																			'input#advancePay')
																			.val(
																					0.0);
																	$(
																			'input#desegReim')
																			.val(
																					0.0);
																	$(
																			'input#actualMiles')
																			.val(
																					0.0);
																	$(
																			'input#totalMiles')
																			.val(
																					0.0);
																	$(
																			'input#printOneReport')
																			.click(
																					function() {
																						window.location = "${pageContext.request.contextPath}/secure/PaymentWorkSheet/";
																					});
																}

																formatPage();
															})
										})
					})
</script>

<script language="javascript" type="text/javascript">
	function formatPage() {

		formatMileageField('migrationMiles');
		formatMileageField('regularDailyMiles');
		formatMileageField('totalMiles');
		formatMileageField('regularMiles');
		formatMileageField('totalReimMileage');
		formatMileageField('mileageEntitlement');

		checkAndFormatAmount('totalCurrentOperatingExp');
		checkAndFormatAmount('finalReimProrated');
		checkAndFormatAmount('totalReimEntitlement');
		checkAndFormatAmount('desegReim');
		checkAndFormatAmount('finalReimEntitlement');
		checkAndFormatAmount('districtDistribution');
		checkAndFormatAmount('reimEntitlement');
		checkAndFormatAmount('excessCosts');
		checkAndFormatAmount('capitalOutlayExpense');
		checkAndFormatAmount('expenseReimbursement');
		checkAndFormatAmount('advancePayLastYear');
		checkAndFormatAmount('netCurrentOperExpend');

	}
</script>

<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainbody">
	<div id="contentarea">
		<div id="pagecontent">
			<form:form commandName="transportationForm"
				action="${pageContext.request.contextPath}/secure/PaymentWorkSheet/save"
				method="post">
				<script onLoad="formatPage()" type="text/javascript">
					
				</script>
				</br>
				<h3>
					<spring:message
						code="PaymentWorkSheet.StaticText.paymentWorksheetStaticText" />
				</h3>

				<!-- Main outer table ${ districtNumber} pupilTran-->
				<div class="formBlock boxShadow3 radius10">
					<TABLE>
						<TR>
							<TD>School District Number&nbsp;&nbsp;&nbsp;&nbsp;</TD>
							<TD><form:select id="districtNumber" path="districtNumber">
									<form:option value="NONE" label="-- Select --" />
									<form:options items="${districtNumbers}"></form:options>
								</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
							<TD>School District Namer&nbsp;&nbsp;&nbsp;&nbsp;</TD>
							<TD><form:input id="DistrictName" path="districtName"
									size="26" maxlength="26" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
							<TD><spring:message
									code="PaymentWorkSheet.StaticText.fiscalYearStaticText" />&nbsp;&nbsp;&nbsp;&nbsp;</TD>
							<TD><form:input id="" path="fiscalYear" size="8"
									maxlength="8" /></TD>
						</TR>

					</TABLE>
				</div>
				<TABLE>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.numberOfPupilsStaticText" /></TD>
						<TD><form:input id="pupilTran" path="pupilTran" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$1TotalCurrentOperatingExpendituresForPupilTransportationLine1cFromCde40StaticText" />
						</TD>
						<TD><form:input id="totalCurrentOperatingExp" path="operTran" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$2CapitalOutlayExclusionForPupilTransportationForIndependentContractorsAsCalculatedByCdeStaticText" />
						</TD>
						<TD><form:input id="capitalOutlayExpense" path="capOutTran" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$3NetCurrentOperatingExpendituresLine1MinusLine2StaticText" />
						</TD>
						<TD><form:input id="netCurrentOperExpense"
								path="netCurrentOperExpend" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$4MileageTraveledForTransportingMigrantEducationPupilsLine2Cde40StaticText" />
						</TD>
						<TD><form:input id="migrationMiles" path="migMiles" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$5MileageTraveledForRegularPupilTransportationOnTheMileageCountDateLine3Cde40NearestToOctober1StaticText" />
						</TD>
						<TD><form:input id="regularDailyMiles" path="regDMiles" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$6DaysOfSchoolHeldWhenPupilsWereTransportedIn20102011FiscalYearSchoolTermLine4Cde40StaticText" />
						</TD>
						<TD><form:input id="schoolDays" path="schoolDays" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$7RegularEducationPupilTransportationMileageStaticText" />
						</TD>
						<TD><form:input id="" path="regMiles" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$8TransportationReimbursableMileageLine4PlusLine7StaticText" />
						</TD>
						<TD><form:input id="totalReimMileage" path="totalReimMileage" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$9MileageEntitlementLine8Times3787StaticText" />
						</TD>
						<TD><form:input id="mileageEntitlement"
								path="mileageEntitlement" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$10ExcessCostsLine3MinusLine9StaticText" />
						</TD>
						<TD><form:input id="excessCosts" path="exCosts" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$11ExcessCostsEntitlementLine10Times3387StaticText" />
						</TD>
						<TD><form:input id="expenseReimbursement" path="exReim" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$12MileageEntitlementPlusExcessCostEntitlementLine9PlusLine11StaticText" />
						</TD>
						<TD><form:input id="mileageEntitlement"
								path="mileageEntitlement" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$13MaximumReimbursementEntitlementLine3Times90StaticText" />
						</TD>
						<TD><form:input id="maxReimEntitlement"
								path="maxReimEntitlement" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$14CalculatedReimbursementEntitlementFor20102011LessOfLines12Or13StaticText" />
						</TD>
						<TD><form:input id="reimbursementTranportation"
								path="reimTran" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$15CalculatedReimbursementEntitlementFor20092010SeeAttachedListStaticText" />
						</TD>
						<TD><form:input id="reimbursementTranportationLastYear"
								path="reimTranLy" /></TD>
					</TR>

					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$16ReimbursementEntitlementFor20102011NotIncludingFinancialAidForBoardGreatOfLines14And15StaticText" />
						</TD>
						<TD><form:input id="reimEntitlement" path="reimEntitlement" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$17FinancialAidForProvidingBoardNumberOfDaysBoardWasPaidForPupilsInLieuOfTransportationTimes1StaticText" />
						</TD>
						<TD><form:input id="boardTran" path="boardTran" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$18ReimbursementEntitlementFor20102011Line16PlusLine17StaticText" />
						</TD>
						<TD><form:input id="totalReimEntitlement"
								path="totalReimEntitlement" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$19AdvanceReimbursementEntitlementFor20102011StaticText" />
						</TD>
						<TD><form:input id="advancePayLastYear" path="advPayLy"
								readonly="true" /></TD>
					</TR>
					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$20FinalReimbursementEntitlementFor20102011Line18MinusLine19StaticText" />
						</TD>
						<TD><form:input id="finalReimEntitlement"
								path="finalReimEntitlement" readonly="true" /></TD>
					</TR>

					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$21FinalReimbursementEntitlementProratedLine20Times51718479StaticText" />
						</TD>
						<TD><form:input id="finalReimProrated"
								path="finalReimProrated" readonly="true" /></TD>
					</TR>

					<TR>
						<TD><spring:message
								code="PaymentWorkSheet.StaticText.$23AdditionalReimbursementForCourtDesegregationOrderStaticText" />
						</TD>
						<TD><form:input id="desegReim" path="desegReim"
								readonly="true" /></TD>
					</TR>
					<TR>
						<TD>23. Total payment for 2010-2011 (Line 21 plus Line 22)</TD>
						<TD><form:input id="totalDistribution" path=""
								readonly="true" /></TD>
					</TR>
					<TR>
						<TD>24. Total actual miles traveled for activity trips, field
							trips, athletic trips, etc. for 2010-2011</TD>
						<TD><form:input id="actualMiles" path="actMiles" /></TD>
					</TR>
					<TR>
						<TD>25. Total actual miles traveled for any purpose in
							2010-2011 (excluding transportation support vehicles)</TD>
						<TD><form:input id="totalMiles" path="totalMiles" /></TD>
					</TR>
				</TABLE>
				</br>
				<div style='text-align: center; margin: 1em 0;'>
					<TABLE>
						<TR>
							<TD />
							<c:if test="${transportationForm.valid}">
								<input type="Button" id="printOneReport" name="printOneReport"
									onclick="window.location='${pageContext.request.contextPath}/secure/PaymentWorkSheet/report/paymentWorksheet.pdf?districtNumber=' + ${transportationForm.districtNumber} + '&fiscalYear=' + ${transportationForm.fiscalYear};"
									value="Print Current Report" />
							</c:if>
							<c:if test="${!transportationForm.valid}">
								<input type="Button" id="printOneReport" name="printOneReport"
									value="Print Current Report" />
							</c:if>
							<TD><input type="Submit" id="printAllReport"
								name="printAllReport" value="Print All Reports" /></TD>
							<TD><input type="Submit" id="uploadToWeb" name="uploadToWeb"
								value="Upload Reports To Web" /></TD>
						</TR>
					</TABLE>
				</div>
				<!--  div-->
			</form:form>
		</div>
	</div>
</div>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/PaymentWorkSheet.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>