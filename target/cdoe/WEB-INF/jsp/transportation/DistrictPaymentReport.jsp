
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
<%@ page language="java" %>
<%@ page import="com.cdoe.ui.*" %>
<%@ page import="com.cdoe.biz.*" %>
<%@ page import="com.cdoe.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>

<%
	String formattedFiscalYear = DateUtil.getFiscalYearFormattedLong();
%>
<script type="text/javascript">
              	<!--
              	$(document).ready(function() {
              		$("table#transportationGrid").dataTable({
                          "bPaginate": false,
                			"bSort": true,
                			"bFilter": true,
                			"bInfo": false,
                			"bLengthChange": true,
                			"bAutoWidth": true
              		});
              	});
              	//-->
              	</script>	
<style>
.scrollableArea { 
	width: 1230px;
	height: 320px;
	padding: 10px;
	border-style: solid;
	border-width: 1;
	overflow: auto;
}
</style>
<div id="mainbody">
		<div id="contentarea">
			<div id="pagecontent">
<form:form commandName="prorateForm" action="${pageContext.request.contextPath}/dynamic/report/districtPayment.xls" method="post">
   <input type="hidden" name="rowKey" id="rowKey"/>
   
   <input type="hidden" name="fiscalYear" value="${prorateForm.fiscalYear}" />
<h2><spring:message code="DistrictPaymentReport.StaticText.districtPaymentReportForReimbursementYearStaticText" />&nbsp;<%=formattedFiscalYear %>
</h2>

  <div class="formBlock boxShadow3 radius10">
	<h3>Payment Information
	</h3>
	<div style='float: left;'>
	  <span class="field" style='width: 100px;'> <LABEL FOR=""><spring:message code="DistrictPaymentReport.StaticText.$1StDistributionStaticText" /></LABEL></span>
	  <span class="bodyText" style='width: 350px;'>
		 <form:input  id="" path="totalFirstPayment"  readOnly="true" />
	  </span>
	  <br/>
	  <span class="field" style='width: 100px;'><LABEL FOR=""><spring:message code="DistrictPaymentReport.StaticText.$2NdDistributionStaticText" /></LABEL>
      </span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input  id="" path="totalSecondPayment" readOnly="true"  />
	  </span>
	  <br/>
	  <span class="field" style='width: 100px;'> <LABEL FOR=""><spring:message code="DistrictPaymentReport.StaticText.totalDistributionStaticText" /></LABEL></span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input  id="" path="totalDistribution" readOnly="true"   />
	  </span>
	</div>
	<div style='float: left; background-color: #fafafa; border: 1px solid #ddd; padding: 0.5em 1em;' class='radius5'>
	  <span class="field" style='width: 120px;'><LABEL FOR="FirstProration"><spring:message code="DistrictPaymentReport.StaticText.$1StProrationStaticText" /></LABEL></span>
	  <span class="bodyText">
		<form:input  id="FirstProration" path="prorateFactor1stPayment"  readOnly="true" />
	  </span>
	  <br/>
	  <span class="field" style='width: 120px;'><LABEL FOR="SecondProration"><spring:message code="DistrictPaymentReport.StaticText.$2NdProrationStaticText" /></LABEL></span>
	  <span class="bodyText">
		 <form:input  id="SecondProration" path="prorateFactor2ndPayment"  readOnly="true" />
	  </span>
	</div>
	<div style='clear:both;'></div>
  </div>
	<div id="capitalOutlayGrid" class="scrollableArea boxShadow3 radius10">
		<table id="transportationGrid" class="display">
			<thead>
				<tr>
					<th>District Number</th>
              		<th>District Name</th>
              		<th>First Payment</th>
              		<th>Second Payment</th>
              		<th>Total Distribution</th>
				</tr>
			</thead>
			<tbody>
              		<c:forEach var="prorateTransportationGrid" items="${prorateForm.prorateTransportationGridList}" varStatus="idx">
              			<tr>
              				<td><form:hidden path="prorateTransportationGridList[${idx.index}].districtNumber"/>
              				<c:out value="${prorateForm.prorateTransportationGridList[idx.index].districtNumber}"/></td>
              				<form:hidden path="prorateTransportationGridList[${idx.index}].organizationName"/>
              				<td><c:out value="${prorateForm.prorateTransportationGridList[idx.index].organizationName}"/></td>
              				<form:hidden path="prorateTransportationGridList[${idx.index}].firstPayment"/>
              				<td><c:out value="${prorateForm.prorateTransportationGridList[idx.index].firstPayment}"/></td>
              				<form:hidden path="prorateTransportationGridList[${idx.index}].secondPayment"/>
              				<td><c:out value="${prorateForm.prorateTransportationGridList[idx.index].secondPayment}"/></td>
              				<form:hidden path="prorateTransportationGridList[${idx.index}].districtDistribution"/>
              				<td><c:out value="${prorateForm.prorateTransportationGridList[idx.index].districtDistribution}"/></td>
              			</tr>
              		</c:forEach>

			</tbody>
		</table>
	</div>  
  <div style='text-align: center; margin: 1em 0;'>
     <input type="Submit" id="" value="Download to Excel"/> 
     <br>
     <span class="field" style='width: 100px;'>
        <spring:message code="DistrictPaymentReport.StaticText.noteAuditsShouldNotShowOnceUploadedStaticText" />
     </span>  
  </div>
</form:form>
   </div><!-- pagecontent -->
 </div><!-- contentarea -->
</div><!-- mainbody -->

<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/DistrictPaymentReport.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>