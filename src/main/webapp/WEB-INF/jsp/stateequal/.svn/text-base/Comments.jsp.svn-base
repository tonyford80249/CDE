
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
<form>

  <!-- Main outer table -->
  <h3> <fmt:message key="Comments.StaticText.reviewCommentsStaticText" /></h3>
  <TABLE CLASS="ContentTable">
    <TR>
      <TD>
        <TABLE>
          <TR>
            <TD >
              <LABEL FOR=""><fmt:message key="Comments.StaticText.schoolDistrictNumberAndNameStaticText" /></LABEL>
            </TD>
            <TD>
              <select  id=""
              	list="{}" 
              	path="schoolDistrictNumberAndNameDropdownList" size="1"/>

            </TD>
            <TD >
              <LABEL FOR=""><fmt:message key="Comments.StaticText.reimbursementYearStaticText" /></LABEL>
            </TD>
            <TD>
              <select  id=""
              	list="{}" 
              	path="reimbursementYearDropdownList" size="1"/>

            </TD>
          </TR>
        </TABLE>
     
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="Comments.StaticText.cdeCommentsStaticText" />
            </TD>
            <TD>
              <textarea  id="" path="textarea1369Textarea" cols="100" rows="6"></textarea>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" value="Cancel"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/Comments.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>