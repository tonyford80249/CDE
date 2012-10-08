
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
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<form>

  <!-- Main outer table -->
  <TABLE CLASS="ContentTable">
    <TR>
      <TD>
        <TABLE>
          <TR>
            <TD COLSPAN="4">
              <fmt:message key="EditDistrict.StaticText.editDistrictInformationStaticText" />
            </TD>
          </TR>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.districtNumberStaticText" /></LABEL>
            </TD>
            <TD>
              <select  id=""
              	list="{}" 
              	path="districtNumberDropdownList" size="1"/>

            </TD>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.contactPersonStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="contactPersonTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.districtNameStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="districtNameTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.districtAlsoKnownAsStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="districtAlsoKnownAsTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.districtSizeStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="districtSizeTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.frequencyOfAuditsStaticText" /></LABEL>
            </TD>
            <TD>
              <select  id=""
              	list="{}" 
              	path="frequencyOfAuditsDropdownList" size="1"/>

            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.lastModifiedStaticText" /></LABEL>
            </TD>
            <TD>
              <select  id=""
              	list="{}" 
              	path="lastModifiedDropdownList" size="1"/>

            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <LABEL FOR=""><fmt:message key="EditDistrict.StaticText.additionalNotesStaticText" /></LABEL>
            </TD>
          </TR>
          <TR>
            <TD>
              <textarea  id="" path="additionalNotesTextarea" rows="6"></textarea>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" value="Update"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/EditDistrict.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>