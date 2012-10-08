
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
<form:form commandName="transportationForm" action="${pageContext.request.contextPath}/secure/ImportAuditTransData/save" method="post">
   <input type="hidden" name="rowKey" id="rowKey"/>


  <!-- Main outer table -->
  <TABLE CLASS="ContentTable">
    <TR>
      <TD>
        <TABLE>
          <TR>
            <TD COLSPAN="2">
              <spring:message code="ImportAuditTransData.StaticText.importAuditedTransportationDataStaticText" />
            </TD>
          </TR>
          <TR>
            <TD COLSPAN="2">
              <div id="transportationGrid" align="center" style="border: 5px groove #ccc;">
              	<table id="transportationGrid" class="display">
              		<thead>
              			<tr>

              							<th>District Number</th>
              						
              							<th>Organization Name</th>
              						
              							<th>Date Changed</th>
              						
              			</tr>
              		</thead>
              		<tbody>
              		<c:forEach var="transportationGrid" items="${transportationForm.transportationGridList}" varStatus="idx">
              			<tr>

              							<td><form:input path="transportationGridList[${idx.index}].districtNumber"/></td>
              						
              							<td><form:input path="transportationGridList[${idx.index}].organizationName"/></td>
              						
              							<td><form:input path="transportationGridList[${idx.index}].dateChanged"/></td>
              						
              			</tr>
              		</c:forEach>
              		</tbody>
              	</table>
              	<script type="text/javascript">
              	<!--
              	$(document).ready(function() {
              		$("table#transportationGrid").dataTable({
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
          <TR>
            <TD>
              <input type="button" id="" value="Upload Transportation Audit Data"/>
            </TD>
            <TD>
              <input type="button" id="" value="Download to Excel"/>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <spring:message code="ImportAuditTransData.StaticText.noteAuditsShouldNotShowOnceUploadedStaticText" />
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form:form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/ImportAuditTransData.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>