
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
    $(document).ready(
     function() {         
         
         /*
          *  Attached function to dropdown's onchange event.
          *
          */                        
         $('select#districtNumber').change(
          function() {
              var varDistrictNumber = "";
                        $("select#districtNumber option:selected").each(function () {
                               varDistrictNumber += $(this).text();
                        });
                        
              $.getJSON('${pageContext.request.contextPath}/secure/PaymentWorkSheet/json', 
                 {
                  districtNumber :  varDistrictNumber,
                  fiscalYear : $('input#fiscalYearId').val()
                 }
                ,
                 function(json) {
                  if (json.transportationForm.valid) {
                                               
                      
                      $('input#DistrictName').val(json.transportationForm.districtName);   
                      $('input#pupilTran').val(json.transportationForm.pupilTran);
                      $('input#totalCurrentOperatingExp').val(json.transportationForm.operTran);
                      $('input#capitalOutlayExpense').val(json.transportationForm.capOutTran);
                      $('input#netCurrentOperExpense').val(json.transportationForm.netCurrentOperExpend);
                      $('input#migrationMiles').val(json.transportationForm.migMiles);
                      $('input#regularDailyMiles').val(json.transportationForm.regDMiles);
                      $('input#schoolDays').val(json.transportationForm.schoolDays)
                      $('input#regularMiles').val(json.transportationForm.regMiles);
                      $('input#totalReimMileage').val(json.transportationForm.totalReimMileage);
                      $('input#mileageEntitlement').val(json.transportationForm.mileageEntitlement);
                      $('input#excessCosts').val(json.transportationForm.exCosts);
                      $('input#expenseReimbursement').val(json.transportationForm.exReim);
                      $('input#mileageEntitlement').val(json.transportationForm.mileageEntitlement);
                      $('input#maxReimEntitlement').val(json.transportationForm.maxReimEntitlement);
                      $('input#reimbursementTranportation').val(json.transportationForm.reimTran);
                      $('input#reimbursementTranportationLastYear').val(json.transportationForm.reimTranLy);
                      $('input#reimEntitlement').val(json.transportationForm.reimEntitlement);
                      $('input#boardTran').val(json.transportationForm.boardTran);
                      $('input#totalReimEntitlement').val(json.transportationForm.totalReimEntitlement);
                      $('input#advancePayLastYear').val(json.transportationForm.advPayLy);
                      $('input#finalReimEntitlement').val(json.transportationForm.finalReimEntitlement);
                      $('input#finalReimProrated').val(json.transportationForm.finalReimProrated);
                      $('input#advancePay').val(json.transportationForm.advPay);
                      $('input#desegReim').val(json.transportationForm.desegReim);
                      $('input#actualMiles').val(json.transportationForm.actMiles);
                      $('input#totalMiles').val(json.transportationForm.totalMiles);
                      $('input#printOneReport').click(
                       function() {
                        window.location="${pageContext.request.contextPath}/secure/PaymentWorkSheet/report/paymentWorksheet.pdf?districtNumber=" + json.transportationForm.districtNumber + "&fiscalYear=" + json.transportationForm.fiscalYear;   
                       }
                      ); 
                      
                  }
                   else {
                     $('input#DistrictName').val(json.transportationForm.districtName);   
                      $('input#pupilTran').val(0);
                      $('input#totalCurrentOperatingExp').val(0.00);
                      $('input#capitalOutlayExpense').val(0.00);
                      $('input#netCurrentOperExpense').val(0.00);
                      $('input#migrationMiles').val(0.0);
                      $('input#regularDailyMiles').val(0.0);
                      $('input#schoolDays').val(0);
                      $('input#regularMiles').val(0.0);
                      $('input#totalReimMileage').val(0.0);
                      $('input#mileageEntitlement').val(0.0);
                      $('input#excessCosts').val(0.00);
                      $('input#expenseReimbursement').val(0.00);
                      $('input#mileageEntitlement').val(0.0);
                      $('input#maxReimEntitlement').val(0.0);
                      $('input#reimbursementTranportation').val(0.0);
                      $('input#reimbursementTranportationLastYear').val(0.0);
                      $('input#reimEntitlement').val(0.0);
                      $('input#boardTran').val(0.0);
                      $('input#totalReimEntitlement').val(0.0);
                      $('input#advancePayLastYear').val(0.0);
                      $('input#finalReimEntitlement').val(0.0);
                      $('input#finalReimProrated').val(0.0);
                      $('input#advancePay').val(0.0);
                      $('input#desegReim').val(0.0);
                      $('input#actualMiles').val(0.0);
                      $('input#totalMiles').val(0.0);    
                      $('input#printOneReport').click(
                       function() {
                        window.location="${pageContext.request.contextPath}/secure/PaymentWorkSheet/";
                       }
                      ); 
                   }
                   
                   formatPage();
                 }
              )   
          }
         )   
     }
    )
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
	
	
	
   //document.getElementById('finalReimProrated').value = parseFloat(document.getElementById('finalReimProrated').value).formatMoney();
   //document.getElementById('totalReimEntitlement').value = parseFloat(document.getElementById('totalReimEntitlement').value).formatMoney();
   /**document.getElementById('desegReim').value = parseFloat(document.getElementById('desegReim').value).formatMoney();
   document.getElementById('finalReimEntitlement').value = parseFloat(document.getElementById('finalReimEntitlement').value).formatMoney();
   document.getElementById('districtDistribution').value = parseFloat(document.getElementById('districtDistribution').value).formatMoney();
   document.getElementById('reimEntitlement').value = parseFloat(document.getElementById('reimEntitlement').value).formatMoney();
   document.getElementById('finalReimEntitlement').value = parseFloat(document.getElementById('finalReimEntitlement').value).formatMoney();
  // document.getElementById('totalCurrentOperatingExp').value = parseFloat(document.getElementById('totalCurrentOperatingExp').value).formatMoney();
   document.getElementById('capitalOutlayExpense').value = parseFloat(document.getElementById('capitalOutlayExpense').value).formatMoney();
  
   document.getElementById('excessCosts').value = parseFloat(document.getElementById('excessCosts').value).formatMoney();
   document.getElementById('expenseReimbursement').value = parseFloat(document.getElementById('expenseReimbursement').value).formatMoney();
   document.getElementById('advancePayLastYear').value = parseFloat(document.getElementById('advancePayLastYear').value).formatMoney();
    document.getElementById('netCurrentOperExpend').value = parseFloat(document.getElementById('netCurrentOperExpend').value).formatMoney();*/
    
  
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
                
                <form:hidden id="fiscalYearId" path="currentFiscalYear" />                                
                                
		<h2>
			<spring:message
				code="PaymentWorkSheet.StaticText.paymentWorksheetStaticText" />
		</h2>			
  <div class="formBlock boxShadow3 radius10">
	<h3>District Information
	</h3>
	<div style='float: left;'>
	  <span class="field" style='width: 100px;'>School District Number</span>
	  <span class="bodyText" style='width: 350px;'>
		<form:select id="districtNumber" path="districtNumber">
						<form:option value="NONE" label="-- Select --" />
						<form:options items="${districtNumbers}"></form:options>
		</form:select>
	  </span>
	  <br/> 
      <span class="field" style='width: 100px;'>School District Name</span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input id="DistrictName" path="districtName" size="26"
						maxlength="26" />
	  </span>
	  <br/> 
      <span class="field" style='width: 100px;'><spring:message 
                code="PaymentWorkSheet.StaticText.fiscalYearStaticText" /></span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input id="formattedFiscalYearId" path="formattedCurrentFiscalYear" size="26" maxlength="26" />
	  </span>
	  <br/> 
      <span class="field" style='width: 100px;'><spring:message
						code="PaymentWorkSheet.StaticText.numberOfPupilsStaticText" /></span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input id="pupilTran" path="pupilTran" />
	  </span>
	  <br/> 	  			  			  		
	</div>
	<div style='clear:both;'></div>
  </div>	

 <div class="formBlock boxShadow3 radius10">
	<h3>Payment Worksheet Details</h3>
	<div id='hintRI' class="hint boxShadow3 radius5 right"></div>
	<div>
	  <span class="field">
	    <spring:message
						code="PaymentWorkSheet.StaticText.$1TotalCurrentOperatingExpendituresForPupilTransportationLine1cFromCde40StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="totalCurrentOperatingExp" path="operTran" />
	  </span>
	</div>	
    <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$2CapitalOutlayExclusionForPupilTransportationForIndependentContractorsAsCalculatedByCdeStaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="capitalOutlayExpense" path="capOutTran" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$3NetCurrentOperatingExpendituresLine1MinusLine2StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="netCurrentOperExpense" path="netCurrentOperExpend" />
	  </span>
	</div>   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$4MileageTraveledForTransportingMigrantEducationPupilsLine2Cde40StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="migrationMiles" path="migMiles" />
	  </span>
	</div>
    <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$5MileageTraveledForRegularPupilTransportationOnTheMileageCountDateLine3Cde40NearestToOctober1StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="regularDailyMiles" path="regDMiles" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$6DaysOfSchoolHeldWhenPupilsWereTransportedIn20102011FiscalYearSchoolTermLine4Cde40StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="schoolDays" path="schoolDays" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$7RegularEducationPupilTransportationMileageStaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="regularMiles" path="regMiles" />
	  </span>
	</div>
	
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$8TransportationReimbursableMileageLine4PlusLine7StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="totalReimMileage" path="totalReimMileage" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$9MileageEntitlementLine8Times3787StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="mileageEntitlement" path="mileageEntitlement" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$10ExcessCostsLine3MinusLine9StaticText" />
	  </span>
	  <span class="bodyText">
		<form:input id="excessCosts" path="exCosts" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$11ExcessCostsEntitlementLine10Times3387StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="expenseReimbursement" path="exReim" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$12MileageEntitlementPlusExcessCostEntitlementLine9PlusLine11StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="mileageEntitlement" path="mileageEntitlement" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$13MaximumReimbursementEntitlementLine3Times90StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="maxReimEntitlement" path="maxReimEntitlement" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$14CalculatedReimbursementEntitlementFor20102011LessOfLines12Or13StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="reimbursementTranportation" path="reimTran" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$15CalculatedReimbursementEntitlementFor20092010SeeAttachedListStaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="reimbursementTranportationLastYear" path="reimTranLy" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$16ReimbursementEntitlementFor20102011NotIncludingFinancialAidForBoardGreatOfLines14And15StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="reimEntitlement" path="reimEntitlement" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$17FinancialAidForProvidingBoardNumberOfDaysBoardWasPaidForPupilsInLieuOfTransportationTimes1StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="boardTran" path="boardTran" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$18ReimbursementEntitlementFor20102011Line16PlusLine17StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="totalReimEntitlement" path="totalReimEntitlement" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$19AdvanceReimbursementEntitlementFor20102011StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="advancePayLastYear" path="advPayLy" readonly="true" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$20FinalReimbursementEntitlementFor20102011Line18MinusLine19StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="finalReimEntitlement" path="finalReimEntitlement" readonly="true"/>
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$21FinalReimbursementEntitlementProratedLine20Times51718479StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="finalReimProrated" path="finalReimProrated" readonly="true"/>
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$22AdvanceReimbursementEntitlementFor20112012Line18Times2StaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="advancePay" path="advPay" readonly="true"/>
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$23AdditionalReimbursementForCourtDesegregationOrderStaticText" />
	  </span>
	  <span class="bodyText">
		$ <form:input id="desegReim" path="desegReim" readonly="true"/>
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$25TotalActualMilesTraveledForActivityTripsFieldTripsAthleticTripsEtcFor20102011StaticText" />
	  </span>
	  <span class="bodyText">
		&nbsp;&nbsp;&nbsp;<form:input id="actualMiles" path="actMiles" />
	  </span>
	</div>
   <div>
	  <span class="field">
        <spring:message
						code="PaymentWorkSheet.StaticText.$26TotalActualMilesTraveledForAnyPurposeIn20102011ExcludingTransportationSupportVehiclesStaticText" />
	  </span>
	  <span class="bodyText">
	    &nbsp;&nbsp;&nbsp;<form:input id="totalMiles" path="totalMiles" />
	  </span>
	</div>
																			
  </div>
  <div style='text-align: center; margin: 1em 0;'>
      <c:if test="${transportationForm.valid}">
          <input type="Button" id="printOneReport" name="printOneReport" onclick="window.open('${pageContext.request.contextPath}/secure/PaymentWorkSheet/report/paymentWorksheet.pdf?districtNumber=' + ${transportationForm.districtNumber} + '&fiscalYear=' + ${transportationForm.fiscalYear});" value="Print Current Report" />              
      </c:if>
      <c:if test="${!transportationForm.valid}">
         <input type="Button" id="printOneReport" name="printOneReport" value="Print Current Report" />           
      </c:if>
      
      <input type="Submit" id="printAllReport" name="printAllReport"	value="Print All Reports" />
      <input type="Submit" id="uploadToWeb" name="uploadToWeb"/>
  </div>			
  </form:form>
   </div>
 </div>
</div>
			
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/PaymentWorkSheet.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>