
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
            <TD>
              <fmt:message key="DistrictAuditReporting.StaticText.auditorSReportsStaticText" />
            </TD>
          </TR>
          <TR>
            <TD>
              <div id="noNameGrid" align="center"></div>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" value="Generate Reports"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/DistrictAuditReporting.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>