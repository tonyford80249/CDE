
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainContent">
<form:form commandName="vDataForm" action="${pageContext.request.contextPath}/secure/MillLevyOverrideWorksheet/save" method="post">

 <h3> <spring:message code="MillLevyOverrideWorksheet.StaticText.reportStaticText" /></h3>
  <!-- Main outer table -->
  <TABLE>
    <TR>
      <TD>
        <TABLE>
        <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.propertyTaxYearStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path=""  items="${List}" />

            </TD>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.districtCodeNameStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path=""  items="${List}" />

            </TD>
            <TD>District Name</TD>
            <TD><input id="DistrictName" path="districtName" size="26"
								maxlength="26" />
			</TD>
          </TR>
          </table>
          <table>
          <TR>
            <TD>
              <b><spring:message code="MillLevyOverrideWorksheet.StaticText.allowableOverrideStaticText" /></b>
            </TD>
            <TD>
              <b><spring:message code="MillLevyOverrideWorksheet.StaticText.amountStaticText" /></b>
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.projectedTotalProgramFormulaFundingStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path=""   />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.$25TotalProgramStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="vNumber"   />
            </TD>
          </TR>
           <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.minimumOverrideAllowedStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="vNumber"   />
            </TD>
          </TR>
          <TR>
            <TD >
              <spring:message code="MillLevyOverrideWorksheet.StaticText.allowableOverrideStaticText_2" />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<spring:message code="MillLevyOverrideWorksheet.StaticText.greaterOf25OfTotalProgramOr200000StaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="vNumber"   />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.plusCostOfLivingAdjustmentStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path=""   />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.totalAllowableOverrideStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="vNumber"   />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.totalExisitngOverridePropertyTaxRevenuesStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path=""   />
            </TD>
          </TR>
          <TR>
            <TD>
              <LABEL FOR=""><spring:message code="MillLevyOverrideWorksheet.StaticText.remainingBalanceAt25LimitStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="vNumber"   />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="MillLevyOverrideWorksheet.Button.calculateButton" />"
              />
            </TD>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="MillLevyOverrideWorksheet.Button.saveButton" />"
              />
            </TD>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="MillLevyOverrideWorksheet.Button.printButton" />"
              />
            </TD>
          </TR>
       </TABLE></TD>
    </TR>
  </TABLE>
</form:form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/MillLevyOverrideWorksheet.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>