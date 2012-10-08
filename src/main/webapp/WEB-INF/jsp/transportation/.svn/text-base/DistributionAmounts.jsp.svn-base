
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<%

	String formattedFiscalYear = DateUtil.getFiscalYearFormattedLong();

%>

<script type="text/javascript">

	function calculateTotalPayment() {
		var val1 = parseFloat((document.getElementById('totalFirstPayment').value).replace(/[^0-9-.]/g, ''));
		if (isNaN(val1)) {
		   alert("Please enter numeric value only");
		   return;
	   }
		var val2 = 0.0;
		if (!("" == document.getElementById('totalSecondPayment').value) && !document.getElementById('totalSecondPayment').value != 'undefined') {
			if (isNaN(document.getElementById('totalSecondPayment').value)) {
			 	alert("Please enter numeric value only");
			   	return;
			}
			val2 = parseFloat((document.getElementById('totalSecondPayment').value).replace(/[^0-9-.]/g, ''));
		}
		
		document.getElementById('totalDistribution').value = val1 + val2;
	}
</script>
<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainbody">
		<div id="contentarea">
			<div id="pagecontent">
				   
		<h2>
			<spring:message
				code="DistributionAmounts.StaticText.distributionAmountsStaticText" />
		</h2>
<form:form commandName="prorateForm"
		action="${pageContext.request.contextPath}/secure/DistributionAmounts/save"
		method="post">
   
  <div class="formBlock boxShadow3 radius10">
	<h3> For Period <%=formattedFiscalYear %>
	</h3>
	<form:hidden path="id" />
	<div style='float: left;'>
	  <span class="field" style='width: 300px;'><LABEL FOR=""><spring:message code="DistributionAmounts.StaticText.firstDistributionAmountStaticText" /></LABEL>
      </span>
	  <span class="bodyText" style='width: 350px;'>
		<c:choose>
		   <c:when test="${(prorateForm.totalFirstPayment <= 0) || (prorateForm.totalFirstPayment == '') }">
		      <form:input id="totalFirstPayment" path="totalFirstPayment" onBlur="calculateTotalPayment()"/>
		   </c:when>
		   <c:otherwise>
		      <form:input id="totalFirstPayment" path="totalFirstPayment" onBlur="calculateTotalPayment()"/>
		   </c:otherwise>
		</c:choose>
		 <form:hidden path="fiscalYear"/>
		 <form:errors path="totalFirstPayment" cssClass="validationError"/>
	  </span>
	  <br/>
	  <span class="field" style='width: 300px;'><spring:message code="DistributionAmounts.StaticText.$1StProrationFactorStaticText" />
      </span>
	  <span class="bodyText" style='width: 350px;'>
         <form:input id="prorateFactor1stPayment" path="prorateFactor1stPayment" readOnly="true" />
	  </span>
	  <br/>
	  <span class="field" style='width: 300px;'><LABEL FOR=""><spring:message code="DistributionAmounts.StaticText.$2NdDistributionAmountStaticText" /></LABEL>
	  </span>
	  <span class="bodyText" style='width: 350px;'>
		<c:choose>
		   <c:when test="${prorateForm.totalFirstPayment > 0}">
		      <form:input id="totalSecondPayment" path="totalSecondPayment" onBlur="calculateTotalPayment()"/>
		   </c:when>
		   <c:otherwise>
		      <form:input id="totalSecondPayment" path="totalSecondPayment" readOnly="true"/>
		   </c:otherwise>
		</c:choose>
	    <form:errors path="totalSecondPayment" cssClass="validationError"/></TD>
	  </span>
      <br/>
	  <span class="field" style='width: 300px;'><spring:message code="DistributionAmounts.StaticText.$2NdProrationFactorStaticText" /></span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input id="" path="prorateFactor2ndPayment" readOnly="true"/>
	  </span>
      <br/>
	  <span class="field" style='width: 300px;'><spring:message code="DistributionAmounts.StaticText.totalDistributionStaticText" /></span>
	  <span class="bodyText" style='width: 350px;'>
		<form:input id="totalDistribution" path="totalDistribution" readOnly="true" />
	  </span>
        <br/>
	    <input type="Submit" id="" name="saveChanges" value="Save Changes" />
	    <input type="Submit" id="" name="runFirstPayment" value="Run First Payments" />
	    <input type="Submit" id="" name="runSecondPayment" value="Run Second Payments" />
	</div>	
     	<div style='clear:both;'></div>
  </div>
  
  <div style='text-align: left; margin: 1em 0;'>
	  <span class="field" style='width: 350px;'><LABEL FOR=""><spring:message
									code="DistributionAmounts.StaticText.enterAllFundingSourcesOfTotalPaymentStaticText" /></LABEL>
      </span>
      <br/>
	  <span class="bodyText" style='width: 350px;'>
          <form:textarea id="" path="fundingSources" rows="6" cols="115" />
	  </span>
  </div>
  
  <div style='text-align: center; margin: 1em 0;'>
     <input type="Submit" name="saveFundingSources" value="Save Funding Sources" />
  </div>
	
</form:form>
    </div><!-- pagecontent -->
		</div><!-- contentarea -->
	</div><!-- mainbody -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/DistributionAmounts.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>