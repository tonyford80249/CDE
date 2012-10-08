
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
<form:form commandName="stateEqualForm" action="${pageContext.request.contextPath}/secure/UploadVariables/save" method="post">

  <!-- Main outer table -->
  <h3>  <spring:message code="UploadVariables.StaticText.uploadVariablesAdjustmentsStaticText" /></h3>
  <TABLE>
    <TR>
      <TD>
        <TABLE>
         <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="UploadVariables.StaticText.selectFiscalYearStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path="fiscalYear"  items="${fiscalYearList}" />
            </TD>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="UploadVariables.StaticText.chooseFileToUploadStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" type="file" path=""/>
            </TD>
        </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="UploadVariables.Button.displayDataButton" />"
              />
            </TD>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="UploadVariables.Button.confirmUploadDataButton" />"
              />
            </TD>
            <TD>
              <input type="reset" id="" value="<spring:message code="UploadVariables.Button.cancelButton" />"/>
            </TD>
          </TR>
        </TABLE>
        <h3> <spring:message code="UploadVariables.StaticText.enterUpdateSingleVariableStaticText" /></h3>
        <TABLE>
          <TR>
            <TD>
              <spring:message code="UploadVariables.StaticText.fiscalYearStaticText" />
            </TD>
            <TD>
              <form:select  id="FiscalYear" 
              path="fiscalYear"  items="${fiscalYearList}" />
            </TD>
          </TR>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="UploadVariables.StaticText.districtCodeStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path=""  items="${List}" />

            </TD>
          </TR>
          <TR>
            <TD>
              <spring:message code="UploadVariables.StaticText.dataElementStaticText" />
            </TD>
            <TD>
              <form:select  id="DataElement" 
              path=""  items="${List}" />
            </TD>
          </TR>
          <TR>
            <TD>
              <spring:message code="UploadVariables.StaticText.valueStaticText" />
            </TD>
            <TD>
              <form:input  id="DataElement" path=""   size="25" maxlength="50"/>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="submit" id=""
                value="<spring:message code="UploadVariables.Button.saveVariableButton" />"
              />
            </TD>
            <TD>
              <input type="reset" id="" value="<spring:message code="UploadVariables.Button.clearButton" />"/>
            </TD>
          </TR>
      </TABLE></TD>
    </TR>
  </TABLE>
</form:form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/UploadVariables.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>