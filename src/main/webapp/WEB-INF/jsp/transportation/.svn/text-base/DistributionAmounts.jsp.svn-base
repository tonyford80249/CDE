
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


<%  String prevFiscalYear = DateUtil.getPrevFiscalYear();
	String formattedFiscalYear = DateUtil.getFiscalYearFormattedLong(prevFiscalYear);
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
		checkAndFormatAmount('totalDistribution');
		checkAndFormatAmount('totalFirstPayment');
		checkAndFormatAmount('totalSecondPayment');
		
	}
	
	function editFields() {
	   document.getElementById('totalFirstPayment').setAttribute("readOnly", "true");
	   document.getElementById('runFirstPayment').disabled=true;
	
	}
	</script>

   <script type="text/javascript"> 
		if (window.addEventListener) { // Mozilla, Netscape, Firefox     
	  	    window.addEventListener('load', WindowLoad, false); 
		} else if (window.attachEvent) { // IE     
	   		window.attachEvent('onload', WindowLoad); 
		}  
	
	
	function WindowLoad(event) { 
	  var prorateFirst =  document.getElementById('prorateFactor1stPayment').value; 
	  if (prorateFirst > 0) {
	      document.getElementById('totalFirstPayment').setAttribute("readOnly", "true");
	  	  document.getElementById('runFirstPayment').disabled=true;
	  } else {
	  	  document.getElementById('totalSecondPayment').setAttribute("readOnly", "true");
	  	  document.getElementById('runSecondPayment').disabled=true;
	  }
	}
	  
</script>
<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainContent">
	<form:form commandName="prorateForm"
		action="${pageContext.request.contextPath}/secure/DistributionAmounts/save"
		method="post">

		<h3>
			<spring:message
				code="DistributionAmounts.StaticText.distributionAmountsStaticText" />
			For
			<%=formattedFiscalYear%>
		</h3>
		<!-- Main outer table -->
		<TABLE>
			<TR>
				<TD><form:hidden path="id" /></TD>
				<TD>
					<TABLE width="40%">
						<TR>

							<TD align="left"><LABEL FOR=""><spring:message
										code="DistributionAmounts.StaticText.firstDistributionAmountStaticText" /></LABEL>
							</TD>
							
                            <TD><form:input id="totalFirstPayment"
											path="totalFirstPayment" onBlur="calculateTotalPayment()" />
									<form:hidden path="fiscalYear" />
							</TD>
							<form:errors path="totalFirstPayment" cssClass="validationError" />
						</TR>
						<TR>

							<TD align="left"><spring:message
									code="DistributionAmounts.StaticText.$1StProrationFactorStaticText" />
							</TD>
							<TD><form:input id="prorateFactor1stPayment"
									path="prorateFactor1stPayment" readOnly="true" /></TD>
						</TR>
						<TR>
							<TD align="left"><LABEL FOR=""><spring:message
										code="DistributionAmounts.StaticText.$2NdDistributionAmountStaticText" /></LABEL>
							</TD>
							
							
							<TD>
							   <form:input id="totalSecondPayment"
											path="totalSecondPayment"
											onBlur="calculateTotalPayment()" />
							   <form:errors path="totalSecondPayment" cssClass="validationError" />
							</TD>
						</TR>
						<TR>
							<TD align="left"><spring:message
									code="DistributionAmounts.StaticText.$2NdProrationFactorStaticText" />
							</TD>
							<TD><form:input id="" path="prorateFactor2ndPayment"
									readOnly="true" /></TD>
						</TR>
						<TR>
							<TD align="left"><spring:message
									code="DistributionAmounts.StaticText.totalDistributionStaticText" />
							</TD>

							<TD><form:input id="totalDistribution"
									path="totalDistribution" readOnly="true" /></TD>
						</TR>

					</TABLE>
					<TABLE>
						<TR>
							<TD><input type="Submit" id="saveChanges" name="saveChanges"
								value="Save Changes" /></TD>
							<TD><input type="Submit" id="runFirstPayment"
								name="runFirstPayment" value="Run First Payments" /></TD>
							<TD><input type="Submit" id="runSecondPayment"
								name="runSecondPayment" value="Run Second Payments" /></TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD colspan="3" align="right"><h3>
									<spring:message
										code="DistributionAmounts.StaticText.enterAllFundingSourcesOfTotalPaymentStaticText" />
								</h3></TD>
						</TR>
						<TR>
							<TD><form:textarea id="" path="fundingSources" rows="6"
									cols="120" /></TD>
						</TR>
						<TR>
							<TD align="center"><input type="Submit"
								name="saveFundingSources" value="Save Funding Sources" /></TD>
						</TR>
					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/DistributionAmounts.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>