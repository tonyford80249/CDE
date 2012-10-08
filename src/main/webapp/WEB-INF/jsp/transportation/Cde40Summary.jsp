
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
<%@ page import="com.cdoe.util.*"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>





<%
	String formattedFiscalYear = DateUtil.getFiscalYearFormattedLong();
	HashMap<String, String> districtsMap = (HashMap<String, String>) session.getAttribute("districtsMap");
%>

<style>
.scrollableArea { padding: 1em; margin: 1em 0; border: 1px solid #A6C9E2; overflow: auto; }
</style>

<script type='text/javascript'>
$(document).ready(function() {
	$("table#transportationGrid").dataTable({
					"bPaginate" : false,
					"bSort" : true,
					"bFilter" : true,
					"bInfo" : true,
					"bLengthChange" : true,
					"bAutoWidth" : true
	});
        
       applyAllFormats(); 
});
</script>

	<div id="mainbody">
		<div id="contentarea">
			<div id="pagecontent">
<form:form commandName="transportationForm" action="${pageContext.request.contextPath}/secure/Cde40Summary/save" method="post">
<input type="hidden" name="rowKey" id="rowKey"/>
<form:hidden path="id"/>
<h2><spring:message code="Cde40Summary.StaticText.cde40SummaryStaticText" /> for Fiscal Year <%= formattedFiscalYear %></h2>

	<fieldset class='boxShadow3 radius10' style='background-color: #fafafa; border: 1px solid #ddd; padding: 0.5em 1em; margin: 2em 0;'>
	  <legend style='display: none; padding: 5px 10px; font-size: 14px; background-color: #fafafa; border: 1px solid #ddd; border-bottom: 0; position: relative; top: -13px;'>LEGEND</legend>
	  <h3 style='margin: 0.5em; font-size: 1.1em;'>Legend:</h2>
	  <ol class='left' style='margin-top: 0px;'>
	    <li>District Code</li>
	    <li>District</li>
	    <li>Last Updated</li>
	    <li>Net Current Oper Expenditure</li>
	    <li>Mileage Traveled Transporting Migrant Pupils</li>
	    <li>Mileage Scheduled for Regular Pupil Transport</li>
	    <li>Days School was in Session</li>
	    <li>Days Room and Board was Paid for Pupils in Lieu of Transport</li>
	  </ol>
	  <ol start='8' class='left' style='margin-top: 0px;'>
	    <li>Pupils Scheduled to be Transported at Public Expense</li>
	    <li>Actual Miles Traveled for Trips</li>
	    <li>Actual Miles Traveled for Any Purpose</li>
	    <li>Capital Outlay</li>
	    <li>Fees Collected from Individuals</li>
	    <li>Calculated Reimbursement Entitle-ment (Previous Year)</li>
	    <li>Advance Reimbursement Entitlement (Current Entitlement Period)</li>
	  </ol>
	</fieldset>

<div id="transportationGrid" class="scrollableArea boxShadow3 radius10">
	<table id="transportationGrid" class="display">
		<thead>
			<tr>
				<th><span title='Select'>a</span></th>
				<th><span title='District Code'>1a</span></th>
				<th><span title='District Name'>1b</span></th>
				<th><span title='Last Updated'>2</span></th>
				<th><span title='Net Current Oper Expenditure'>3</span></th>
				<th><span title='Mileage Traveled Transporting Migrant Pupils'>4</span></th>
				<th><span title='Mileage Scheduled for Regular Pupil Transport'>5</span></th>
				<th><span title='Days School was in Session'>6</span></th>
				<th><span title='Days Room and Board was Paid for Pupils in Lieu of Transport'>7</span></th>
				<th><span title='Pupils Scheduled to be Transported at Public Expense'>8</span></th>
				<th><span title='Actual Miles Traveled for Trips'>9</span></th>
				<th><span title='Actual Miles Traveled for Any Purpose'>10</span></th>
				<th><span title='Capital Outlay'>11</span></th>
				<th><span title='Fees Collected from Individuals'>12</span></th>
				<th><span title='Calculated Reimbursement Entitle-ment (Previous Year)'>13</span></th>
                                <th><span title='Advance Reimbursement Entitlement (Current Entitlement Period)'>14</span></th>
			</tr>
		</thead>
		<tbody>
			<tr>
			<c:forEach var="transportationGrid"
												items="${transportationForm.transportationGridList}"
												varStatus="idx">
				<td>
				 <form:hidden path="transportationGridList[${idx.index}].id" /><form:checkbox value="false" path="transportationGridList[${idx.index}].select"/>
				</td>
				<td style='white-space: nowrap;'>
				 <c:out value="${transportationForm.transportationGridList[idx.index].districtNumber}"/>
				</td>
				<td style='white-space: nowrap;'>
				 <c:out value="${transportationForm.transportationGridList[idx.index].districtName}"/>
				</td>
				<td>
				  <form:input size="8" path="transportationGridList[${idx.index}].dateUpdated" onFocus="showDate(0)"/>
				</td>
				<td>
				  <form:input class="moneyType" size="8" path="transportationGridList[${idx.index}].netCurrentOperExpend" />
				</td>
				<td>
				  <form:input class="numericyType" size="5" path="transportationGridList[${idx.index}].migMiles" />
				</td>
				<td>
				  <form:input  class="numericyType" size="5" path="transportationGridList[${idx.index}].regDMiles" />
				</td>
				<td>
				  <form:input class="integerType" size="5" path="transportationGridList[${idx.index}].schoolDays" />
				</td>
				<td>
				  <form:input class="numericyType" size="5" path="transportationGridList[${idx.index}].boardTran" />
				</td>
				<td>
				  <form:input  class="numericyType" size="6" path="transportationGridList[${idx.index}].pupilTran" />				
				</td>
				<td>
				  <form:input class="numericyType" size="6" path="transportationGridList[${idx.index}].actMiles" />
				</td>
				<td>
				  <form:input class="numericyType" size="8" path="transportationGridList[${idx.index}].totalMiles" />
				</td>
				<td>
				  <form:input class="moneyType" size="8" path="transportationGridList[${idx.index}].feesCollected" />
				</td>
				<td>
				  <form:input class="moneyType" size="8" path="transportationGridList[${idx.index}].capOutTran" />
				</td>
				<td>
				  <form:input class="moneyType" size="8" path="transportationGridList[${idx.index}].reimTranLy" />
				</td>
				<td>
				  <form:input class="moneyType"  size="8" path="transportationGridList[${idx.index}].advPay" />
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table><!-- transportationGrid -->
</div>

  <div style='margin: 1em 0;'>
	<input type="Submit" id="saveButton" name="saveButton" value="Save Changes" />
	<input type="Submit" id="rejectDistrict"  name="rejectDistrict" value="Reject District" />
	<input type="Button" id="downLoadToExcel" name="downLoadToExcel" onclick="window.location='${pageContext.request.contextPath}/dynamic/report/cde40SummaryPayment.xls?fiscalYear=${transportationForm.fiscalYear}'" value="Download this Report to Excel" />
  </div>
</form:form>
		    </div><!-- pagecontent -->
		</div><!-- contentarea -->
	</div><!-- mainbody -->


<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/Cde40Summary.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>