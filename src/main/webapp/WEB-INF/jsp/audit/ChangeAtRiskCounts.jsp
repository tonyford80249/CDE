
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
<form:form commandName="auditEqualForm" action="${pageContext.request.contextPath}/secure/ChangeAtRiskCounts/save" method="post">


  <!-- Main outer table -->
   <h3><spring:message code="ChangeAtRiskCounts.StaticText.changeAtRiskCountsStaticText" /></h3>
  <TABLE>
    <TR>
      <TD>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="ChangeAtRiskCounts.StaticText.fiscalYearStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path=""  items="${List}" /><form:errors path=""/>

            </TD>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="ChangeAtRiskCounts.StaticText.districtCodeStaticText" /></LABEL>
            </TD>
            <TD>
              <form:select  id="" 
              path=""  items="${List}" /><form:errors path=""/>

            </TD>
            <TD ALIGN="right">
              <LABEL FOR=""><spring:message code="ChangeAtRiskCounts.StaticText.districtNameStaticText" /></LABEL>
            </TD>
            <TD>
              <form:input  id="" path="districtNumber"   size="6" maxlength="6"/><form:errors path="districtNumber"/>
              </td>
              <td><img src="images/calbtn.gif" id="_picker_icon" class="picker_icon" alt="Date picker icon image"></td>
              <td><div id="_picker_container" class="date_picker_container"></div></td>
              </tr>
              </table>
            </TD>
          </TR>
          <TR>
            <TD COLSPAN="6">
              <div id="noNameGrid" align="center" style="border: 5px groove #ccc;">
              	<table id="noNameGrid" class="display">
              		<thead>
              			<tr>
              			</tr>
              		</thead>
              		<tbody>
              		<c:forEach var="noNameGrid" items="${auditEqualForm.noNameGridList}" varStatus="idx">
              			<tr>
              			</tr>
              		</c:forEach>
              		</tbody>
              	</table>
              	<script type="text/javascript">
              	<!--
              	$(document).ready(function() {
              		$("table#noNameGrid").dataTable({
                          "bPaginate": false,
                			"bSort": false,
                			"bFilter": false,
                			"bInfo": false,
                			"bLengthChange": false,
                			"bAutoWidth": false
              		});
              	});
              	//-->
              	</script>	
              </div>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" name="recalculate" value="Recalculate"/>
            </TD>
            <TD>
              <input type="button" id="" name="saveChanges" value="Save Changes"/>
            </TD>
            <TD>
              <input type="button" id="" name="printExcel" value="Print this sheet to Excel"/>
            </TD>
            <TD>
              <input type="button" id="" name="cancel" value="Cancel"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form:form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/ChangeAtRiskCounts.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>